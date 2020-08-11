package com.sanvalero.feedback2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.sanvalero.feedback2.model.Equipo;
import com.sanvalero.feedback2.model.Jugador;

public class EquipoTest {
	
	private static Equipo equipo;
	
	@BeforeAll
	public static void setupAll() {
		equipo = new Equipo(null, null, null, null, null);
	}

	@Test
	public void ingresarJugadorLista() {
		Jugador jugadorA = new Jugador(null, null, null, null, null, null, 0, 0, null);
		Jugador jugadorB = new Jugador(null, null, null, null, null, null, 1, 1, null);
		Jugador jugadorC = new Jugador(null, null, null, null, null, null, 2, 2, null);
		
		equipo.ingresarJugadorLista(jugadorA);
		equipo.ingresarJugadorLista(jugadorB);
		equipo.ingresarJugadorLista(jugadorC);
		
		//Comprobamos jugadores del equipo
		assertEquals(3, equipo.getListaJugadores().size());
	}
	
}
 