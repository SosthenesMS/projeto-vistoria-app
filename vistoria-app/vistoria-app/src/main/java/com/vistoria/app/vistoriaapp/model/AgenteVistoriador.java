package com.vistoria.app.vistoriaapp.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;

/**
 * AgenteVistoriador
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "agenteVistoriador")
public class AgenteVistoriador {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAgenteVistoriador;
    
    @Column(name = "nome", nullable = false, unique = true, length = 45)
    private String nome;

    @Column(name = "sobrenome", length = 45)
    private String sobrenome;

    @Column(name = "email", length = 45)
    private String email;

    @Column(name = "matricula", length = 45)
    private String matricula;
}