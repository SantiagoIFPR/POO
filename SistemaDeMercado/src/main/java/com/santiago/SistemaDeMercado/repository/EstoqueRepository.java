package com.santiago.SistemaDeMercado.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.santiago.SistemaDeMercado.models.EntradaProdutoEstoque;

public interface EstoqueRepository extends JpaRepository<EntradaProdutoEstoque, Long> {
}
