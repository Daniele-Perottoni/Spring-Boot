package it.marconi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.marconi.entity.Atleta;
import it.marconi.repository.AtletaRepository;

@Service
public class AtletiService {
    
    @Autowired
    AtletaRepository atletaRepo;

    public Atleta getAtleta(int id) {
        return atletaRepo.findById(id).orElse(other:null);
    }
}
