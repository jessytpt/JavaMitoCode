package com.example.consola;

import com.example.service.IPersonaService;
import com.example.service.PersonaServiceImp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import static org.slf4j.LoggerFactory.*;

@SpringBootApplication(scanBasePackages = {"com.example.consola","com.example.repository","com.example.service"})
public class ConsolaApplication implements CommandLineRunner {

	private static Logger LOG = LoggerFactory.getLogger(ConsolaApplication.class);
	@Autowired
	private IPersonaService service;

	public static void main(String[] args) {
		SpringApplication.run(ConsolaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		service.registrar("Mitocode");
	}
}
