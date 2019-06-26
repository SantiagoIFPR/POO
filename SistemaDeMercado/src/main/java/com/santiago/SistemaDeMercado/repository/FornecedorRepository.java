package com.santiago.SistemaDeMercado.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.santiago.SistemaDeMercado.models.Fornecedor;


public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {

}
