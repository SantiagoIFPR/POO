package com.santiago.SistemaDeMercado.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.santiago.SistemaDeMercado.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
