package com.sanvalero.feedback2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Campeonato de F�tbol");

		Scanner sc = new Scanner(System.in);
		System.out.println("�Desea comenzar? Responda Si o No");
		String respuesta = sc.nextLine();

		switch (respuesta.toUpperCase()) {
		case "SI":
			System.out.println("Introduzca nombre de usuario y contrase�a, por favor");
			break;
		case "NO":
			System.out.println("Hasta pronto");
		
		sc.close();
		}

	}

}
