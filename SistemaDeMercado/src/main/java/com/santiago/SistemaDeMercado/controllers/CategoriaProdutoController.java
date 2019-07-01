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

import com.santiago.SistemaDeMercado.models.CategoriaProduto;
import com.santiago.SistemaDeMercado.repository.CategoriaRepository;
import com.santiago.SistemaDeMercado.repository.FornecedorRepository;

@Controller
public class CategoriaProdutoController {
	@Autowired
	public CategoriaRepository repositoryCategoria;
	
	@Autowired
	public FornecedorRepository repositoryFornecedor;
	
	@GetMapping("/listaCategoria")
	public ModelAndView lista() {
		ModelAndView mv = new ModelAndView("/categoria");
		List<CategoriaProduto> categoriaproduto = repositoryCategoria.findAll();
		mv.addObject("categoria", categoriaproduto);
		return mv;
	}
	
	@GetMapping("/adicionarCategoria")
	public ModelAndView add(CategoriaProduto categoriaproduto) {
		ModelAndView mv = new ModelAndView("/addcategoria");
		mv.addObject("categoria", categoriaproduto);
		mv.addObject("fornecedor", repositoryFornecedor.findAll());
		return mv;
	}
	
	@GetMapping("/editarCategoria/{id}")
	public ModelAndView editar(@PathVariable("id") Long id){
		Optional<CategoriaProduto> categoriaproduto = repositoryCategoria.findById(id);
		CategoriaProduto cat = categoriaproduto.get();
		return add(cat);
	}
	@GetMapping("/removerCategoria/{id}")
	public ModelAndView remover(@PathVariable("id") Long id){
		Optional<CategoriaProduto> categoriaproduto = repositoryCategoria.findById(id);
		CategoriaProduto cat = categoriaproduto.get();
		repositoryCategoria.delete(cat);
		return lista();
	}
	@PostMapping("/salvarCategoria")
	public ModelAndView salvar(@Valid CategoriaProduto categoriaproduto, BindingResult result ) {
		if(result.hasErrors()) {
			
		}
		repositoryCategoria.saveAndFlush(categoriaproduto);
		return lista();
	}
}
