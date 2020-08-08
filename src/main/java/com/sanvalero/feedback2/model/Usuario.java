package com.sanvalero.feedback2.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
	
	private String idUsuario;
	private String contrase�a;
	private String nombre;
	private String apellidos;
	private LocalDate fechaNacimiento;
	private String direccion;
	private int telefono;
	
	private List<Mensaje> mensajesEnviados;
	private List<Mensaje> mensajesRecibidos;
	
	public Usuario(String idUsuario, String contrase�a, String nombre, String apellidos, LocalDate fechaNacimiento,
			String direccion, int telefono) {
		super();
		this.idUsuario = idUsuario;
		this.contrase�a = contrase�a;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.direccion = direccion;
		this.telefono = telefono;
		mensajesEnviados = new ArrayList<>();
		mensajesRecibidos = new ArrayList<>();
	}

	public String getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
}
