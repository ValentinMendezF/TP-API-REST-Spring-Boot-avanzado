package com.example.inicial1;

import com.example.inicial1.entities.*;
import com.example.inicial1.repositories.*;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@SpringBootApplication
public class inicial1Application {
//	private static final Logger logger = LoggerFactory.getLogger(inicial1Application.class);
//
//	@Autowired
//	private PersonaRepository personaRepository;
//	@Autowired
//	private AutorRepository autorRepository;
//	@Autowired
//	private DomicilioRepository domicilioRepository;
//	@Autowired
//	private LibroRepository libroRepository;
//	@Autowired
//	private LocalidadRepository localidadRepository;


	public static void main(String[] args) {
		SpringApplication.run(inicial1Application.class, args);

		System.out.println("funcionando");
	}

//	@Bean
//	@Transactional
//	CommandLineRunner init(PersonaRepository personaRepository) {
//		return args -> {
///*			// Creo un objeto persona
//*/
//
//			List<Persona> recuperadas = personaRepository.findAll();
//			System.out.println(recuperadas);
//
//			logger.info("Detalles de la persona: {}", recuperadas);
//
//
//			Optional<Persona> recuperada = personaRepository.findById(1L);
//			System.out.println(recuperada);
//
//			logger.info("Detalles de la persona: {}", recuperada);
//
//
//		/*	dom1.setCalle("Rodriguezaaaa");
//
//			personaRepository.save(per1);
//		*/
//
//		};
//
//	}
//
//	;
//

}
