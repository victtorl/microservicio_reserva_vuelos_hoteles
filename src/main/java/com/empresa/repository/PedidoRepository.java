package com.empresa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.modelo.Reserva;

public interface PedidoRepository extends JpaRepository<Reserva, Integer> {

}
