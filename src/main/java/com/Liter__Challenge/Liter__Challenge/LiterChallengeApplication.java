package com.Liter__Challenge.Liter__Challenge;

import com.Liter__Challenge.Liter__Challenge.Service.ConsumoApi;
import com.Liter__Challenge.Liter__Challenge.Service.ConvierteDatos;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiterChallengeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LiterChallengeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoApi = new ConsumoApi();
		var json = consumoApi.obtenerDatos("https://gutendex.com/books/?page=2");
		ConvierteDatos conversor = new  ConvierteDatos();
		var datos = conversor.obtenerDatos(json, ConvierteDatos.class);

	}
}
