package com.sanvalero.feedback2.model;

public class DetallesEquipo {

	private short partidosDisputados;
	private short victorias;
	private short derrotas;
	private short empates;
	private short posicionRanking;
	
	public DetallesEquipo(short partidosDisputados, short victorias, short derrotas, short empates,
			short posicionRanking) {
		super();
		this.partidosDisputados = partidosDisputados;
		this.victorias = victorias;
		this.derrotas = derrotas;
		this.empates = empates;
		this.posicionRanking = posicionRanking;
	}

	public short getPartidosDisputados() {
		return partidosDisputados;
	}

	public void setPartidosDisputados(short partidosDisputados) {
		this.partidosDisputados = partidosDisputados;
	}

	public short getVictorias() {
		return victorias;
	}

	public void setVictorias(short victorias) {
		this.victorias = victorias;
	}

	public short getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(short derrotas) {
		this.derrotas = derrotas;
	}

	public short getEmpates() {
		return empates;
	}

	public void setEmpates(short empates) {
		this.empates = empates;
	}

	public short getPosicionRanking() {
		return posicionRanking;
	}

	public void setPosicionRanking(short posicionRanking) {
		this.posicionRanking = posicionRanking;
	}
	
	
	
}
