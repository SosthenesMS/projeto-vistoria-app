package com.vistoria.app.vistoriaapp.model;

import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "vistoria")
public class Vistoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVistoria;

    @Column(name = "dataDaVistoria", nullable = false)
    @JsonFormat(pattern = "dd/MM/yyy")
    private LocalDate dataDaVistoria;

    @Column(name = "motorista", nullable = false, length = 45)
    private String motorista;

    @Column(name = "cpf", nullable = false, length = 45)
    private String cpf;

    @Column(name = "turno", nullable = false, length = 45)
    private String turno;

    @Column(name = "perfilDaCarga", nullable = false, length = 45)
    private String perfilDaCarga;

    @Column(name = "perfilDoVeiculo", nullable = false, length = 45)
    private String perfilDoVeiculo;

    @Column(name = "placaDoCavalo", nullable = false, length = 45)
    private String placaDoCavalo;

    @Column(name = "placaDaCarreta", length = 45)
    private String placaDaCarreta;

    @Column(name = "remessa", nullable = false, length = 45)
    private String remessa;

    @Column(name = "transportador", nullable = false, length = 45)
    private String transportador;

    @Column(name = "destinoDaCarga", nullable = false, length = 45)
    private String destinoDaCarga;

    @Column(name = "observacoes", columnDefinition = "TEXT")
    private String observacoes;

    @OneToOne
    @JoinColumn(name = "idAgenteVistoriador")
    private AgenteVistoriador agenteVistoriador;

    @OneToOne
    @JoinColumn(name = "idStatusVistoria")
    private StatusVistoria statusVistoria;

}
