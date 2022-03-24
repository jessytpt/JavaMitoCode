package com.example.service;

import com.example.repository.IPersonaRepo;
import com.example.repository.PersonaRepoImp;

public class PersonaServiceImp implements IPersonaService{

    private IPersonaRepo repo;

    @Override
    public void registrar(String name) {
        repo  = new PersonaRepoImp();
        repo.registrar(name);
    }
}
