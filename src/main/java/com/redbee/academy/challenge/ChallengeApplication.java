package com.redbee.academy.challenge;

import java.util.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


public class ChallengeApplication {

	public static void main(String[] args) {
		prueba();
	}
	
	public static void prueba() {
		int a=24;
		int b=6;
		int c=8;
		
		List<Integer> lista1 = new ArrayList<Integer>();
		lista1.add(110);
		lista1.add(200);
		lista1.add(60);
		
		List<Integer> lista2 = new ArrayList<Integer>();
		lista2.add(40);
		lista2.add(50);
		lista2.add(4000);
		lista2.add(-50);
		lista2.add(7000);
		
		/**
		 * Para visualizar mejor la respuesta del Compare Array Numbers:
		 * Lista1: [110, 200, 60]
		 * Lista2: [40, 50, 4000, -50, 7000]
		 */
		
		System.out.println("'Sum Two Numbers' Recibe 2 numeros y devuelve la suma de ellos:  " + SumTwoNumbers.sum(a,b));
		System.out.println("'Sum Array Numbers' Recibe una Lista y devuelve la suma de todos sus elementos: " + SumArrayNumbers.sum(lista2));
		
		System.out.println("'Compare Numbers' Recibe 3 numeros y devuelve el mayor de los 3: " + CompareNumbers.max(a, b, c));
		System.out.println("'Compare Array Numbers' Recibe 2 Listas y devuelve otra Lista con el maximo de cada indice"
				+ "			\n (OJO! En el caso de que tengan distintos tamaños se comparan igual, dejando los restantes): " + CompareArrayNumbers.max(lista1, lista2));

	}
}
