package com.example.championship.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "game")
@Data
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    //@JsonIgnore
    @ManyToOne
    @JoinColumn(name = "team1_id")
    private Team team1;

    //@JsonIgnore
    @ManyToOne
    @JoinColumn(name = "team2_id")
    private Team team2;

    @Column(name = "score1")
    private int score1;

    @Column(name = "score2")
    private int score2;

    @Column(name = "type")
    private String type;



}
