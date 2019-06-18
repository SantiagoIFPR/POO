package com.santiago.SistemaDeMercado.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.santiago.SistemaDeMercado.models.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long>{

}