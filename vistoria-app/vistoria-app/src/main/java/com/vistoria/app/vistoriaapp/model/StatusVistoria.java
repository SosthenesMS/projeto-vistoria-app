package com.vistoria.app.vistoriaapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "StatusVistoria")
public class StatusVistoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idStatusVistoria;

    @Column(name = "descricao", length = 45)
    private String descricao;
}
