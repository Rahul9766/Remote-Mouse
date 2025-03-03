package com.example.remotemouse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RemoteMouseApplication {
	public static void main(String[] args) {
		// Disable headless mode
		System.setProperty("java.awt.headless", "false");
		SpringApplication.run(RemoteMouseApplication.class, args);
	}
}