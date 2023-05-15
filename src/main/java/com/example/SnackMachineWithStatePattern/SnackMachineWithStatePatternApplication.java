package com.example.SnackMachineWithStatePattern;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SnackMachineWithStatePatternApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SnackMachineWithStatePatternApplication.class, args);

		Menu menu = new Menu();
		menu.printMenu();

	}

}
