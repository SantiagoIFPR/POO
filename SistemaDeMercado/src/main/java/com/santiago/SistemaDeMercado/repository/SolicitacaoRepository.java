package com.santiago.SistemaDeMercado.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.santiago.SistemaDeMercado.models.Solicitacao;


public interface SolicitacaoRepository extends JpaRepository<Solicitacao, Long> {

}
