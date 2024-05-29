package it.marconi.provadb.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import it.marconi.provadb.entity.Atleta;
import it.marconi.provadb.service.AtletaService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class Olimpiadi {
    @Autowired
    AtletaService servizio;


    @GetMapping("/helloworld")
    public String prova() {
        return "sciao ragazzi";
    }


    @GetMapping("/atleti")
    public List<Atleta> stampaAtleti() {
        return servizio.getAtleti();
    }


    @GetMapping("/atleti/{id}")
    public Atleta stampaAtleta(@PathVariable("id") int n) {
        return servizio.getAtleta(n);
    }


    @GetMapping("/cercacognomi/{cognome}")
    public List<Atleta> getAtletaPerCognome(@PathVariable("cognome") String param) {
        return servizio.getAtletaPerCognome(param);
    }
}
