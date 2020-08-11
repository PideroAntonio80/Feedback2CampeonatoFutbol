package com.sanvalero.feedback2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.sanvalero.feedback2.model.DetallesJugador;
import com.sanvalero.feedback2.model.Jugador;

public class JugadorTest {
	
	private static Jugador jugador;
	
	@BeforeAll
	public static void setupAll() {
		jugador = new Jugador(null, null, null, null, null, null, 0, 0, null);
	}
	
	@Test
	public void editarDetallesJugador() {
		DetallesJugador detalleSemana1 = new DetallesJugador(8, 1, 3);
		DetallesJugador detalleSemana2 = new DetallesJugador(5, 0, 4);
		
		jugador.editarDetallesJugador(13, 1, 7);
		
		assertEquals(1, jugador.getDetalles().size());
		
		assertEquals(8, detalleSemana1.getGoles());
		assertEquals(1, detalleSemana1.getTarjetasRojas());
		assertEquals(3, detalleSemana1.getTarjetasAmarillas());
		
		assertEquals(5, detalleSemana2.getGoles());
		assertEquals(0, detalleSemana2.getTarjetasRojas());
		assertEquals(4, detalleSemana2.getTarjetasAmarillas());
		
	}
	
	
	  @Test 
	  public void totalFaltas() { 
		  DetallesJugador penalizaciones = new DetallesJugador(13, 1, 7);
	  
		  assertEquals(8, penalizaciones.totalFaltas(1, 7)); }

}
