package com.santiago.SistemaDeMercado.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.santiago.SistemaDeMercado.models.Produtos;

public interface ProdutoRepository extends JpaRepository<Produtos, Long>{

}
