package com.sanvalero.feedback2.model;

public class ResultadoPartidos {
	
	private short numeroPartido;
	private Equipo equipo1;
	private short golesEquipo1;
	private Equipo equipo2;
	private short golesEquipo2;
	private String incidencias;
	private String observaciones;

	public ResultadoPartidos(short numeroPartido, Equipo equipo1, short golesEquipo1, Equipo equipo2, short golesEquipo2, String incidencias,
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

	public short getNumeroPartido() {
		return numeroPartido;
	}

	public void setNumeroPartido(short numeroPartido) {
		this.numeroPartido = numeroPartido;
	}
	
	public Equipo getEquipo1() {
		return equipo1;
	}

	public void setEquipo1(Equipo equipo1) {
		this.equipo1 = equipo1;
	}

	public short getGolesEquipo1() {
		return golesEquipo1;
	}

	public void setGolesEquipo1(short golesEquipo1) {
		this.golesEquipo1 = golesEquipo1;
	}
	
	public Equipo getEquipo2() {
		return equipo2;
	}

	public void setEquipo2(Equipo equipo2) {
		this.equipo2 = equipo2;
	}

	public short getGolesEquipo2() {
		return golesEquipo2;
	}

	public void setGolesEquipo2(short golesEquipo2) {
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
	
	public void marcadorResultado(Equipo equipo1, Equipo equipo2, short golesEquipo1, short golesEquipo2) {
		
		if (golesEquipo1 > golesEquipo2) {
			System.out.println("El resultado del partido es: " + equipo1 + ": " + golesEquipo1 + " - " + equipo2 + ": " + golesEquipo2);
			System.out.println("Ganador: " + equipo1);
		}
		
		else if (golesEquipo1 < golesEquipo2) {
			System.out.println("El resultado del partido es: " + equipo2 + ": " + golesEquipo2 + " - " + equipo1 + ": " + golesEquipo1);
			System.out.println("Ganador: " + equipo2);
		}
		
		else {
			System.out.println("El resultado del partido es: " + equipo1 + ": " + golesEquipo1 + " - " + equipo2 + ": " + golesEquipo2);
			System.out.println("Empate");
		}
		
	}
	
}
