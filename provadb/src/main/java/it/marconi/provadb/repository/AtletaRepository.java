package it.marconi.provadb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import it.marconi.provadb.entity.Atleta;

import java.util.List;


@Repository
public interface AtletaRepository extends JpaRepository<Atleta, Integer>{


    List<Atleta> findByCognome(String cognome);


    List<Atleta> findByNome(String nome);

    @Query(value = "SELECT * FROM atleti WHERE id > :idmin AND id < :idmax", nativeQuery = true)
    List<Atleta> findBetweenIDs(@Param(value="idmin") int min,
                                @Param(value="idmax") int max);

    @Query(value = "SELECT nome FROM atleti WHERE year(datanascita) > :annoMin AND year(datanascita) < :annoMax", nativeQuery = true)
    List<String> findBetweenYears(@Param(value="annoMin") int min,
                                  @Param(value="annoMax") int max);
}
