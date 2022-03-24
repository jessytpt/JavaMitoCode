package com.example.consola;

import com.example.service.IPersonaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import static org.slf4j.LoggerFactory.*;

@SpringBootApplication
public class ConsolaApplication implements CommandLineRunner {

	private static Logger LOG = LoggerFactory.getLogger(ConsolaApplication.class);
	private IPersonaService service;

	public static void main(String[] args) {
		SpringApplication.run(ConsolaApplication.class, args);
		System.out.println("Holi");
	}

	@Override
	public void run(String... args) throws Exception {
		LOG.info("Ya entendí porque se usa este IDE");
		service.registrar("Mitocode");
	}
}
