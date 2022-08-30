package com.empresa.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="reservas")
public class Reserva {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	private String hotel;
	private String vuelo;
	private String nombre;  
	private Integer dni;
	
	public Reserva() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHotel() {
		return hotel;
	}

	public void setHotel(String hotel) {
		this.hotel = hotel;
	}

	public String getVuelo() {
		return vuelo;
	}

	public void setVuelo(String vuelo) {
		this.vuelo = vuelo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public Reserva(int id, String hotel, String vuelo, String nombre, Integer dni) {
		super();
		this.id = id;
		this.hotel = hotel;
		this.vuelo = vuelo;
		this.nombre = nombre;
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Reserva [id=" + id + ", hotel=" + hotel + ", vuelo=" + vuelo + ", nombre=" + nombre + ", dni=" + dni
				+ ", getId()=" + getId() + ", getHotel()=" + getHotel() + ", getVuelo()=" + getVuelo()
				+ ", getNombre()=" + getNombre() + ", getDni()=" + getDni() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	


	
	

}
