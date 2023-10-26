package com.teena.assignment2.devops;

import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TeenaAbrahamAssignment2DevopsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TeenaAbrahamAssignment2DevopsApplication.class, args);
		String name = "Teena Abraham";
		String greeting = updateGreeting();
		System.out.println(greeting + ", " + name + ", Welcome to COMP367");
	}

	public static String updateGreeting() {
		LocalTime now = LocalTime.now();
		if (now.isBefore(LocalTime.NOON)) {
			return "Good morning";
		} else {
			return "Good afternoon";
		}
	}
}
