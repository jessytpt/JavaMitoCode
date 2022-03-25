package com.example.service;

import com.example.repository.IPersonaRepo;
import com.example.repository.PersonaRepoImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImp implements IPersonaService{

    @Autowired
    @Qualifier("persona2")
    private IPersonaRepo repo;

    @Override
    public void registrar(String name) {
        repo.registrar(name);
    }
}
