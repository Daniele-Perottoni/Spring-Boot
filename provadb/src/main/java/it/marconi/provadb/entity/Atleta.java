package it.marconi.provadb.entity;

import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// annotazioni per lombok
@Data
@AllArgsConstructor
@NoArgsConstructor


// annotazioni per JPA
@Entity
@Table(name="atleti")
public class Atleta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;


    @Column(name="nome")
    private String nome;


    @Column(name="cognome")
    private String cognome;


    @Column(name="datanascita")
    private Date datanascita;


    @Column(name="fknazione")
    private int fknazione;
   
}
