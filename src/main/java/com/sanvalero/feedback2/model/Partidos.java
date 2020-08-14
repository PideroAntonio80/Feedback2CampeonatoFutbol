package com.sanvalero.feedback2.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Partidos {

	private short numeroPartido;
	private LocalDate fecha;
	private String campo;
	private Equipo equipo1;
	private Equipo equipo2;
	private String arbitro;
	
	private List<ResultadoPartidos> resultados;
	
	public Partidos(short numeroPartido, LocalDate fecha, String campo, Equipo equipo1, Equipo equipo2,
			String arbitro) {
		super();
		this.numeroPartido = numeroPartido;
		this.fecha = fecha;
		this.campo = campo;
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
		this.arbitro = arbitro;
		
		resultados = new ArrayList<>();
		
	}

	public short getNumeroPartido() {
		return numeroPartido;
	}

	public void setNumeroPartido(short numeroPartido) {
		this.numeroPartido = numeroPartido;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getCampo() {
		return campo;
	}

	public void setCampo(String campo) {
		this.campo = campo;
	}

	public Equipo getEquipo1() {
		return equipo1;
	}

	public void setEquipo1(Equipo equipo1) {
		this.equipo1 = equipo1;
	}

	public Equipo getEquipo2() {
		return equipo2;
	}

	public void setEquipo2(Equipo equipo2) {
		this.equipo2 = equipo2;
	}

	public String getArbitro() {
		return arbitro;
	}

	public void setArbitro(String arbitro) {
		this.arbitro = arbitro;
	}

	public List<ResultadoPartidos> getResultados() {
		return resultados;
	}

	public void setResultados(List<ResultadoPartidos> resultados) {
		this.resultados = resultados;
	}
	
}
