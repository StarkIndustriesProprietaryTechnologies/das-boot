/**
 * @author ashish.adhikari
 */
package com.boot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ashish.adhikari
 *
 */
@SpringBootApplication
public class MainClass implements CommandLineRunner{
	public static void main(String[] args) throws Exception {
		SpringApplication.run(MainClass.class, args).close();
	}
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello");
	}
}
