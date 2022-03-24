package com.example.service;

import com.example.repository.IPersonaRepo;

public class PersonaServiceImp implements IPersonaService{

    private IPersonaRepo repo;

    @Override
    public void registrar(String name) {
        repo.registrar(name);
    }
}
