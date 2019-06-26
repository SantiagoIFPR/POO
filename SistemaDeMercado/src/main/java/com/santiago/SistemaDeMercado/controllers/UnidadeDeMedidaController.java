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

import com.santiago.SistemaDeMercado.models.UnidadeDeMedida;
import com.santiago.SistemaDeMercado.repository.UnidadeDeMedidaRepository;
@Controller
public class UnidadeDeMedidaController {
	@Autowired
	public UnidadeDeMedidaRepository repository;
	
	@GetMapping("/listaUnidadeDeMedida")
	public ModelAndView lista() {
		ModelAndView mv = new ModelAndView("/medida");
		List<UnidadeDeMedida> medida = repository.findAll();
		mv.addObject("medida", medida);
		return mv;
	}
	
	@GetMapping("/adicionarUnidadeDeMedida")
	public ModelAndView add(UnidadeDeMedida medida) {
		ModelAndView mv = new ModelAndView("/addmedida");
		mv.addObject("medida", medida);
		return mv;
	}
	
	@GetMapping("/editarUnidadeDeMedida/{id}")
	public ModelAndView editar(@PathVariable("id") Long id){
		Optional<UnidadeDeMedida> medida = repository.findById(id);
		UnidadeDeMedida e = medida.get();
		return add(e);
	}
	@GetMapping("/removerUnidadeDeMedida/{id}")
	public ModelAndView remover(@PathVariable("id") Long id){
		Optional<UnidadeDeMedida> medida = repository.findById(id);
		UnidadeDeMedida e = medida.get();
		repository.delete(e);
		return lista();
	}
	@PostMapping("/salvarUnidadeDeMedida")
	public ModelAndView salvar(@Valid UnidadeDeMedida medida, BindingResult result ) {
		if(result.hasErrors()) {
			
		}
		repository.saveAndFlush(medida);
		return lista();
	}

}
