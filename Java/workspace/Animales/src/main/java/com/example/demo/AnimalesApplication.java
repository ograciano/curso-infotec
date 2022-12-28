package com.example.demo;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Animales.Animal;

@SpringBootApplication
public class AnimalesApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnimalesApplication.class, args);
		
		DateTimeFormatter formateador = DateTimeFormatter.ofPattern("HH:mm:ss");
		ArrayList<Animales> animales = new ArrayList<Animales>();
		
		
		int leones = 0;
		int gatos = 0;
		int perros = 0;
		int venados = 0;
		int elefantes = 0;
		
		for (int i = 1; i <= 10000; i++) {
			String hora = LocalDateTime.now().format(formateador);
			Animales animal = new Animales(i, Animales.getRandmonAnimal());
			animales.add(animal);
			if (animal.getAnimal() == Animal.Leon) leones += 1;
			if (animal.getAnimal() == Animal.Gato) gatos += 1;
			if (animal.getAnimal() == Animal.Perro) perros += 1;
			if (animal.getAnimal() == Animal.Venado) venados += 1;
			if (animal.getAnimal() == Animal.Elefante) elefantes += 1;
			
			if(animal.getIdAnimal() == 1000 || animal.getIdAnimal() == 2000 || animal.getIdAnimal() == 3000 || animal.getIdAnimal() == 4000 || animal.getIdAnimal() == 5000 || animal.getIdAnimal() == 6000 || animal.getIdAnimal() == 7000 || animal.getIdAnimal() == 8000 || animal.getIdAnimal() == 9000 || animal.getIdAnimal() == 10000) {
				Animales.setTimeout(() -> System.out.println(animal.toString() + "\nEsperando " + hora), 2000);
			}
		}
		
		System.out.println("Resumen: hay " + leones + " Leones, " + gatos + " Gatos, " + perros + " Perros, " + venados + " Venados, y " + elefantes + " Elefantes");
	}

}