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

import com.santiago.SistemaDeMercado.repository.FornecedorRepository;


@Entity
public class Fornecedor {
	@Autowired
	public FornecedorRepository repository;
	
	@GetMapping("/listaFornecedor")
	public ModelAndView lista() {
		ModelAndView mv = new ModelAndView("/fornecedor");
		List<Fornecedor> fornecedor = repository.findAll();
		mv.addObject("fornecedor", fornecedor);
		return mv;
	}
	
	@GetMapping("/adicionarFornecedor")
	public ModelAndView add(Fornecedor fornecedor) {
		ModelAndView mv = new ModelAndView("/addfornecedor");
		mv.addObject("fornecedor", fornecedor);
		return mv;
	}
	
	@GetMapping("/editarFornecedor/{id}")
	public ModelAndView editar(@PathVariable("id") Long id){
		Optional<Fornecedor> fornecedor = repository.findById(id);
		Fornecedor e = fornecedor.get();
		return add(e);
	}
	@GetMapping("/removerFornecedor/{id}")
	public ModelAndView remover(@PathVariable("id") Long id){
		Optional<Fornecedor> fornecedor = repository.findById(id);
		Fornecedor e = fornecedor.get();
		repository.delete(e);
		return lista();
	}
	@PostMapping("/salvarEstoque")
	public ModelAndView salvar(@Valid Fornecedor fornecedor, BindingResult result ) {
		if(result.hasErrors()) {
			
		}
		repository.saveAndFlush(fornecedor);
		return lista();
	}
}
