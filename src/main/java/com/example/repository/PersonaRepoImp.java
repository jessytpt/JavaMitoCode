package com.example.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PersonaRepoImp implements IPersonaRepo {

    private static Logger LOG  = LoggerFactory.getLogger(PersonaRepoImp.class);

    @Override
    public void registrar(String name) {
        LOG.info("Se registra A: "+name);
    }
}
