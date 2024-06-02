package it.marconi.provadb.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

// importo delle classi di entità e del servizio
import it.marconi.provadb.entity.Atleta;
import it.marconi.provadb.service.AtletaService;

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
    public List<Atleta> getAtletaPerCognome(@PathVariable("cognome") String cognomeAtleta) {
        return servizio.getAtletaPerCognome(cognomeAtleta);
    }

    @GetMapping("/cercanomi/{nome}")
    public List<Atleta> getAtletaPerNome(@PathVariable("nome") String nomeAtleta) {
        return servizio.getAtletaPerNome(nomeAtleta);
    }

    @GetMapping("/cercatraid")
    public List<Atleta> getBetweenIDs(@RequestParam("idmin") int idMin,
                                      @RequestParam("idmax") int idMax) {
        return servizio.getAtletiFraId(idMin, idMax);
    }
    
}