package it.marconi.provadb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.marconi.provadb.entity.Atleta;
import it.marconi.provadb.repository.AtletaRepository;

import java.util.List;

@Service
public class AtletaService {


    @Autowired
    AtletaRepository atletaRepo;


    public Atleta getAtleta(int id) {
        return atletaRepo.findById(id).orElse(null);
    }


    public List<Atleta> getAtleti() {
        return atletaRepo.findAll();
    }


    public List<Atleta> getAtletaPerCognome(String cognome)
    {
        return atletaRepo.findByCognome(cognome);
    }  
}

