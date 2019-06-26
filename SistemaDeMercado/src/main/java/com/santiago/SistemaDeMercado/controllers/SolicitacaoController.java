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

import com.santiago.SistemaDeMercado.models.Solicitacao;
import com.santiago.SistemaDeMercado.repository.SolicitacaoRepository;

@Controller
public class SolicitacaoController {
	@Autowired
	public SolicitacaoRepository repository;
	
	@GetMapping("/listaSolicitacao")
	public ModelAndView lista() {
		ModelAndView mv = new ModelAndView("/solicitacao");
		List<Solicitacao> solicitacao = repository.findAll();
		mv.addObject("solicitacao", solicitacao);
		return mv;
	}
	
	@GetMapping("/adicionarSolicitacao")
	public ModelAndView add(Solicitacao solicitacao) {
		ModelAndView mv = new ModelAndView("/addsolicitacao");
		mv.addObject("solicitacao", solicitacao);
		return mv;
	}
	
	@GetMapping("/editarSolicitacao/{id}")
	public ModelAndView editar(@PathVariable("id") Long id){
		Optional<Solicitacao> solicitacao = repository.findById(id);
		Solicitacao e = solicitacao.get();
		return add(e);
	}
	@GetMapping("/removerSolicitacao/{id}")
	public ModelAndView remover(@PathVariable("id") Long id){
		Optional<Solicitacao> solicitacao = repository.findById(id);
		Solicitacao e = solicitacao.get();
		repository.delete(e);
		return lista();
	}
	@PostMapping("/salvarSolicitacao")
	public ModelAndView salvar(@Valid Solicitacao solicitacao, BindingResult result ) {
		if(result.hasErrors()) {
			
		}
		repository.saveAndFlush(solicitacao);
		return lista();
	}

}
