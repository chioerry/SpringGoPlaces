package com.boot.GoPlaces;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//This is a special Annotation where Spring understands that main method is here
public class MainClass 
{
 public static void main( String[] args )
 {
 	// Default Method to run a spring Boot Application
     SpringApplication.run(MainClass.class, args);
 }
}