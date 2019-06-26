package com.santiago.SistemaDeMercado.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.santiago.SistemaDeMercado.models.Saida;
import com.santiago.SistemaDeMercado.repository.SaidaRepository;
@Controller
public class SaidaController {
	@Autowired
	public SaidaRepository repository;
	
	@GetMapping("/listaSaida")
	public ModelAndView lista() {
		ModelAndView mv = new ModelAndView("/saida");
		List<Saida> saida = repository.findAll();
		mv.addObject("saida", saida);
		return mv;
	}
	
	@GetMapping("/adicionarSaida")
	public ModelAndView add(Saida saida) {
		ModelAndView mv = new ModelAndView("/addsaida");
		mv.addObject("saida", saida);
		return mv;
	}
	
	@GetMapping("/editarSaida/{id}")
	public ModelAndView editar(@PathVariable("id") Long id){
		Optional<Saida> saida = repository.findById(id);
		Saida e = saida.get();
		return add(e);
	}
	@GetMapping("/removerSaida/{id}")
	public ModelAndView remover(@PathVariable("id") Long id){
		Optional<Saida> saida = repository.findById(id);
		Saida e = saida.get();
		repository.delete(e);
		return lista();
	}
	@PostMapping("/salvarSaida")
	public ModelAndView salvar(@Valid Saida saida, BindingResult result ) {
		if(result.hasErrors()) {
			
		}
		repository.saveAndFlush(saida);
		return lista();
	}

}
