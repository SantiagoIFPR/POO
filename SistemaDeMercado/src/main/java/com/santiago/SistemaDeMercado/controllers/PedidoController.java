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

import com.santiago.SistemaDeMercado.models.Pedido;
import com.santiago.SistemaDeMercado.repository.PedidoRepository;



@Controller
public class PedidoController {
	@Autowired
	public PedidoRepository repository;
	
	@GetMapping("/listaPedido")
	public ModelAndView lista() {
		ModelAndView mv = new ModelAndView("/pedido");
		List<Pedido> pedido = repository.findAll();
		mv.addObject("pedido", pedido);
		return mv;
	}
	
	@GetMapping("/adicionarPedido")
	public ModelAndView add(Pedido pedido) {
		ModelAndView mv = new ModelAndView("/addpedido");
		mv.addObject("pedido", pedido);
		return mv;
	}
	
	@GetMapping("/editarPedido/{id}")
	public ModelAndView editar(@PathVariable("id") Long id){
		Optional<Pedido> pedido = repository.findById(id);
		Pedido e = pedido.get();
		return add(e);
	}
	@GetMapping("/removerPedido/{id}")
	public ModelAndView remover(@PathVariable("id") Long id){
		Optional<Pedido> pedido = repository.findById(id);
		Pedido e = pedido.get();
		repository.delete(e);
		return lista();
	}
	@PostMapping("/salvarPedido")
	public ModelAndView salvar(@Valid Pedido pedido, BindingResult result ) {
		if(result.hasErrors()) {
			
		}
		repository.saveAndFlush(pedido);
		return lista();
	}
	

}
