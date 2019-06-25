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

import com.santiago.SistemaDeMercado.models.Estado;
import com.santiago.SistemaDeMercado.models.Produtos;
import com.santiago.SistemaDeMercado.repository.ProdutoRepository;

@Controller
public class ProdutoController {
	@Autowired
	public ProdutoRepository repository;
	
	@GetMapping("/listaProduto")
	public ModelAndView lista() {
		ModelAndView mv = new ModelAndView("/produto");
		List<Produtos> produtos = repository.findAll();
		mv.addObject("produto", produtos);
		return mv;
	}
	
	@GetMapping("/adicionarProduto")
	public ModelAndView add(Produtos produtos) {
		ModelAndView mv = new ModelAndView("/addproduto");
		mv.addObject("produtos", produtos);
		return mv;
	}
	
	@GetMapping("/editarProduto/{id}")
	public ModelAndView editar(@PathVariable("id") Long id){
		Optional<Produtos> produtos = repository.findById(id);
		Produtos e = produtos.get();
		return add(e);
	}
	@GetMapping("/removerProduto/{id}")
	public ModelAndView remover(@PathVariable("id") Long id){
		Optional<Produtos> produtos = repository.findById(id);
		Produtos e = produtos.get();
		repository.delete(e);
		return lista();
	}
	@PostMapping("/salvarProduto")
	public ModelAndView salvar(@Valid Produtos produtos, BindingResult result ) {
		if(result.hasErrors()) {
			
		}
		repository.saveAndFlush(produtos);
		return lista();
	}
	
}



