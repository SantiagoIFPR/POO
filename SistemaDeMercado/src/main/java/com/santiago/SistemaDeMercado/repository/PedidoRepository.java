package com.santiago.SistemaDeMercado.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.santiago.SistemaDeMercado.models.Pedido;


public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
