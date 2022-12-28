package com.example.demo;

import java.util.Random;

public class Animales {
	public int idAnimal;
	public enum Animal {
		Leon, Gato, Perro, Venado, Elefante;
		
		public static Animal getRandomAnimal() {
			Random random = new Random();
			return values()[random.nextInt(values().length)];
			
		}
	};
	private Animal animal;
	Animales(int idAnimal,  Animal animal) {
		this.idAnimal = idAnimal;
		this.animal = animal;
	}
	public int getIdAnimal() {
		return idAnimal;
	}
	public void setIdAnimal(int idAnimal) {
		this.idAnimal = idAnimal;
	}
	public Animal getAnimal() {
		return animal;
	}
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	
	public static Animal getRandmonAnimal() {
		return Animal.getRandomAnimal();
	}
	@Override
	public String toString() {
		return "Animales -> ID: " + idAnimal + ", Tipo: " + animal;
	}
	
	public static void setTimeout(Runnable runnable, int delay) {
		new Thread(() -> {
			try {
				Thread.sleep(delay);
				runnable.run();
			} catch (Exception e) {
				System.out.println(e);
			}
		}).start();
	}
	
}