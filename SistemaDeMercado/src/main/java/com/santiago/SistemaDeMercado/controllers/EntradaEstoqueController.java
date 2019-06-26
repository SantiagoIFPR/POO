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

import com.santiago.SistemaDeMercado.models.EntradaProdutoEstoque;
import com.santiago.SistemaDeMercado.repository.EstoqueRepository;




@Entity
public class EntradaEstoqueController {
	@Autowired
	public EstoqueRepository repository;
	
	@GetMapping("/listaEstoque")
	public ModelAndView lista() {
		ModelAndView mv = new ModelAndView("/estoque");
		List<EntradaProdutoEstoque> estoque = repository.findAll();
		mv.addObject("estoque", estoque);
		return mv;
	}
	
	@GetMapping("/adicionarEstoque")
	public ModelAndView add(EntradaProdutoEstoque estoque) {
		ModelAndView mv = new ModelAndView("/addestoque");
		mv.addObject("estoque", estoque);
		return mv;
	}
	
	@GetMapping("/editarEstoque/{id}")
	public ModelAndView editar(@PathVariable("id") Long id){
		Optional<EntradaProdutoEstoque> estoque = repository.findById(id);
		EntradaProdutoEstoque e = estoque.get();
		return add(e);
	}
	@GetMapping("/removerEstoque/{id}")
	public ModelAndView remover(@PathVariable("id") Long id){
		Optional<EntradaProdutoEstoque> estoque = repository.findById(id);
		EntradaProdutoEstoque e = estoque.get();
		repository.delete(e);
		return lista();
	}
	@PostMapping("/salvarEstoque")
	public ModelAndView salvar(@Valid EntradaProdutoEstoque estoque, BindingResult result ) {
		if(result.hasErrors()) {
			
		}
		repository.saveAndFlush(estoque);
		return lista();
	}
	
}

