package com.santiago.SistemaDeMercado.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.santiago.SistemaDeMercado.models.CategoriaProduto;

public interface CategoriaRepository extends JpaRepository<CategoriaProduto, Long>{

}
