package com.sanvalero.feedback2.model;

public class ResultadoPartidos {
	
	private int numeroPartido;
	private Equipo equipo1;
	private int golesEquipo1;
	private Equipo equipo2;
	private int golesEquipo2;
	private String incidencias;
	private String observaciones;

	public ResultadoPartidos(int numeroPartido, Equipo equipo1, int golesEquipo1, Equipo equipo2, int golesEquipo2, String incidencias,
			String observaciones) {
		super();
		this.numeroPartido = numeroPartido;
		this.equipo1 = equipo1;
		this.golesEquipo1 = golesEquipo1;
		this.equipo2 = equipo2;
		this.golesEquipo2 = golesEquipo2;
		this.incidencias = incidencias;
		this.observaciones = observaciones;
	}

	public int getNumeroPartido() {
		return numeroPartido;
	}

	public void setNumeroPartido(int numeroPartido) {
		this.numeroPartido = numeroPartido;
	}
	
	public Equipo getEquipo1() {
		return equipo1;
	}

	public void setEquipo1(Equipo equipo1) {
		this.equipo1 = equipo1;
	}

	public int getGolesEquipo1() {
		return golesEquipo1;
	}

	public void setGolesEquipo1(int golesEquipo1) {
		this.golesEquipo1 = golesEquipo1;
	}
	
	public Equipo getEquipo2() {
		return equipo2;
	}

	public void setEquipo2(Equipo equipo2) {
		this.equipo2 = equipo2;
	}

	public int getGolesEquipo2() {
		return golesEquipo2;
	}

	public void setGolesEquipo2(int golesEquipo2) {
		this.golesEquipo2 = golesEquipo2;
	}

	public String getIncidencias() {
		return incidencias;
	}

	public void setIncidencias(String incidencias) {
		this.incidencias = incidencias;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
	/****************Metodo para obtener el marcador de resultados****************/
	
	public String marcadorResultado(Equipo equipo1, Equipo equipo2, int golesEquipo1, int golesEquipo2) {
		
		if (golesEquipo1 > golesEquipo2) {
			return "El resultado del partido es: " + equipo1.getNombre() + ": " + golesEquipo1 + " - " + equipo2.getNombre() + ": " + golesEquipo2;
		}
		
		else if (golesEquipo1 < golesEquipo2) {
			return "El resultado del partido es: " + equipo2.getNombre() + ": " + golesEquipo2 + " - " + equipo1.getNombre() + ": " + golesEquipo1;
		}
		
		else {
			return "El resultado del partido es: " + equipo1.getNombre() + ": " + golesEquipo1 + " - " + equipo2.getNombre() + ": " + golesEquipo2;
		}
		
	}
	
}
