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

import com.santiago.SistemaDeMercado.models.Usuario;
import com.santiago.SistemaDeMercado.repository.UsuarioRepository;



@Controller
public class UsuarioController {
	@Autowired
	public UsuarioRepository repository;
	
	@GetMapping("/listaUsuario")
	public ModelAndView lista() {
		ModelAndView mv = new ModelAndView("/usuario");
		List<Usuario> usuario = repository.findAll();
		mv.addObject("usuario", usuario);
		return mv;
	}
	
	@GetMapping("/adicionarUsuario")
	public ModelAndView add(Usuario usuario) {
		ModelAndView mv = new ModelAndView("/addusuario");
		mv.addObject("usuario", usuario);
		return mv;
	}
	
	@GetMapping("/editarUsuario/{id}")
	public ModelAndView editar(@PathVariable("id") Long id){
		Optional<Usuario> usuario = repository.findById(id);
		Usuario e = usuario.get();
		return add(e);
	}
	@GetMapping("/removerusuario/{id}")
	public ModelAndView remover(@PathVariable("id") Long id){
		Optional<Usuario> usuario = repository.findById(id);
		Usuario e = usuario.get();
		repository.delete(e);
		return lista();
	}
	@PostMapping("/salvarusuarioo")
	public ModelAndView salvar(@Valid Usuario usuario, BindingResult result ) {
		if(result.hasErrors()) {
			
		}
		repository.saveAndFlush(usuario);
		return lista();
	}

}
