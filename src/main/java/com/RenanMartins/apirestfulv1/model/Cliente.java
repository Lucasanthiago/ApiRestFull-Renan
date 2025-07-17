package com.RenanMartins.apirestfulv1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Cliente { // Renomeado de Usuario

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String conta;
    private String senha;

    // Novo: Um cliente pode ter várias locações
    @JsonIgnore
    @OneToMany(mappedBy = "cliente")
    private List<Locacao> locacoes;

    public Cliente(String conta, String senha) {
        this.conta = conta;
        this.senha = senha;
    }
}

