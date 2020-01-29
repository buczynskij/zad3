package com.example.zad3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.zad3.controller.GpsController;
import com.example.zad3.service.GpsService;

@SpringBootApplication
public class Zad3Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Zad3Application.class, args);
	}

}
