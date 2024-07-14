package com.Liter__Challenge.Liter__Challenge.models;

import com.Liter__Challenge.Liter__Challenge.controles.title;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;

import static jakarta.persistence.GenerationType.IDENTITY;


@Entity
@Data
@Table(name = "liter--challenge")
public class Libro {
    private long id;
    @Id
    @GeneratedValue(strategy = IDENTITY)


    @JsonProperty private   String title;
    @JsonProperty private  String authors;
    @JsonProperty private  String language;

    public void settitle(Class<? extends Libro> aClass) {
    }

    public void setauthors(Class<? extends Libro> aClass) {
    }

    public void Setlanguages(Class<? extends Libro> aClass) {
    }
}
