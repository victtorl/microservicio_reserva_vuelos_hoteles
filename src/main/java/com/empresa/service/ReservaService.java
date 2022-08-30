package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.modelo.Reserva;
import com.empresa.repository.PedidoRepository;

@Service
public class ReservaService {

	@Autowired
	private PedidoRepository repositorio;
	
	public List<Reserva> listarReservas(){
		return repositorio.findAll();
	}
	
	public void guardarReserva(Reserva reserva) {
		repositorio.save(reserva);
		 
	}
	
	public Reserva obtenerReservaPorId( Integer id) {
		 return repositorio.findById(id).get();
	}
	
	public void eliminarReserva(Integer id) {
		repositorio.deleteById(id);
	}
	
}
