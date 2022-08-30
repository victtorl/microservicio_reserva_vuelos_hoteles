 package com.empresa.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.modelo.Reserva;
import com.empresa.service.ReservaService;
@CrossOrigin(origins="*")
@RestController
public class ReservaControlador {
	
	@Autowired
	private ReservaService servicio;
	 
	@GetMapping("/api/reservas")
	public List<Reserva> listarReservas(){
		return servicio.listarReservas();
	}
	
	@GetMapping("/api/reserva/{id}")
	public ResponseEntity<Reserva> ObtenerReserva(@PathVariable Integer id) {
		try {
			Reserva reserva=servicio.obtenerReservaPorId(id);
			return new ResponseEntity<Reserva>(reserva,HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Reserva>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/api/reserva")
	public void guardarReserva(@RequestBody Reserva reserva) {
		servicio.guardarReserva(reserva);
	}
	
	@PutMapping("/api/reserva/{id}")
	public ResponseEntity<?> actualizarReserva(@RequestBody Reserva reserva,@PathVariable Integer id){
		try {
			Reserva reservaExistente=servicio.obtenerReservaPorId(id);
			
				reservaExistente.setNombre(reserva.getNombre());
				reservaExistente.setVuelo(reserva.getVuelo());
				reservaExistente.setHotel(reserva.getHotel());
				reservaExistente.setDni(reserva.getDni());
				
			servicio.guardarReserva(reservaExistente);
			
			
			
			return new ResponseEntity<Reserva>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Reserva>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/api/reserva/{id}")
	public void eliminarReserva(@PathVariable Integer id) {
		servicio.eliminarReserva(id);
	}
	
}
