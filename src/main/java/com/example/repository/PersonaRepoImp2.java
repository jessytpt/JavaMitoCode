package com.example.repository;

import com.example.service.IPersonaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("persona2")
public class PersonaRepoImp2 implements IPersonaRepo{
    private static Logger LOG  = LoggerFactory.getLogger(PersonaRepoImp.class);

    @Override
    public void registrar(String name) {
        LOG.info("No Se registra A: "+name);
    }
}
