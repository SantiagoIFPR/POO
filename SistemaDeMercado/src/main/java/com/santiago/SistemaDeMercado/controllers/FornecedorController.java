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

import com.santiago.SistemaDeMercado.models.Fornecedor;
import com.santiago.SistemaDeMercado.repository.CidadeRepository;
import com.santiago.SistemaDeMercado.repository.FornecedorRepository;


@Controller
public class FornecedorController {
	@Autowired
	public FornecedorRepository repository;
	@Autowired
	public CidadeRepository repositoryCidade;
	
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
		mv.addObject("cidade", repositoryCidade.findAll());
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
	@PostMapping("/salvarFornecedor")
	public ModelAndView salvar(@Valid Fornecedor fornecedor, BindingResult result ) {
		if(result.hasErrors()) {
			
		}
		repository.saveAndFlush(fornecedor);
		return lista();
	}
}
