package com.aluracursos.desafio_Literalura;

import com.aluracursos.desafio_Literalura.Services.ConsumoApi;
import com.aluracursos.desafio_Literalura.Services.ConvierteDatos;
import com.aluracursos.desafio_Literalura.model.Datos;
import com.aluracursos.desafio_Literalura.model.DatosLibro;
import com.aluracursos.desafio_Literalura.principal.Principal;
import com.aluracursos.desafio_Literalura.repository.IAutorRepository;
import com.aluracursos.desafio_Literalura.repository.ILibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.*;

@SpringBootApplication
public class DesafioLiteraluraApplication implements CommandLineRunner {

	@Autowired
	ILibroRepository libroRepository;

	@Autowired
	IAutorRepository autorRepository;

	public static void main(String[] args) {
		SpringApplication.run(DesafioLiteraluraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(libroRepository,autorRepository);
principal.menu();
	}
}
