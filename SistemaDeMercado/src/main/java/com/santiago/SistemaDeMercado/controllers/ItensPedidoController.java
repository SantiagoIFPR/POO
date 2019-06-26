package com.santiago.SistemaDeMercado.controllers;

import java.util.List;
import java.util.Optional;

import javax.persistence.Entity;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.santiago.SistemaDeMercado.models.ItensPedido;
import com.santiago.SistemaDeMercado.repository.ItensPedidoRepository;


@Entity
public class ItensPedidoController {
	@Autowired
	public ItensPedidoRepository repository;
	
	@GetMapping("/listaItensPedido")
	public ModelAndView lista() {
		ModelAndView mv = new ModelAndView("/itenspedido");
		List<ItensPedido> itenspedido = repository.findAll();
		mv.addObject("itenspedido", itenspedido);
		return mv;
	}
	
	@GetMapping("/adicionarItensPedido")
	public ModelAndView add(ItensPedido itenspedido) {
		ModelAndView mv = new ModelAndView("/additenspedido");
		mv.addObject("itenspedido", itenspedido);
		return mv;
	}
	
	@GetMapping("/editarItensPedido/{id}")
	public ModelAndView editar(@PathVariable("id") Long id){
		Optional<ItensPedido> itenspedido = repository.findById(id);
		ItensPedido e = itenspedido.get();
		return add(e);
	}
	@GetMapping("/removerItensPedido/{id}")
	public ModelAndView remover(@PathVariable("id") Long id){
		Optional<ItensPedido> itenspedido = repository.findById(id);
		ItensPedido e = itenspedido.get();
		repository.delete(e);
		return lista();
	}
	@PostMapping("/salvarItensPedido")
	public ModelAndView salvar(@Valid ItensPedido itenspedido, BindingResult result ) {
		if(result.hasErrors()) {
			
		}
		repository.saveAndFlush(itenspedido);
		return lista();
	}

}
