package com.sanvalero.feedback2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.sanvalero.feedback2.model.Jugador;
import com.sanvalero.feedback2.model.PersonalFederacion;

public class PersonalFederaciontest {
	
	private static PersonalFederacion secretario;
	
	@BeforeAll
	public static void setupAll() {
		secretario = new PersonalFederacion(null, null, null, null, null, null, 0, null, null);
	}
	
	@Test
	public void registrarJugador() {
		Jugador berta = new Jugador(null, null, null, null, null, null, 0, 0, null);
		Jugador isabel = new Jugador(null, null, null, null, null, null, 0, 0, null);
		Jugador pedro = new Jugador(null, null, null, null, null, null, 0, 0, null);
		Jugador eugenia = new Jugador(null, null, null, null, null, null, 0, 0, null);
		Jugador alberto = new Jugador(null, null, null, null, null, null, 0, 0, null);
		
		secretario.registrarJugador(berta);
		secretario.registrarJugador(isabel);
		secretario.registrarJugador(pedro);
		secretario.registrarJugador(eugenia);
		secretario.registrarJugador(alberto);
		
		//Comprobamos jugadores federados
		assertEquals(5, secretario.getJugadoresFederados().size());
		
		secretario.eliminarJugador(eugenia);
		secretario.eliminarJugador(alberto);
		
		//Comprobamos de nuevo la lista tras eliminar algunos
		assertEquals(3, secretario.getJugadoresFederados().size());
	}
	
}
