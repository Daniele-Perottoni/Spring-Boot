package it.marconi.provadb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.marconi.provadb.entity.Atleta;

import java.util.List;


@Repository
public interface AtletaRepository extends JpaRepository<Atleta, Integer>{


    List<Atleta> findByCognome(String cognome);


    List<Atleta> findByNome(String nome);
}
