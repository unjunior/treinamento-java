package br.com.devsuperior.evento.entities;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_participante")
public class Participante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;

    @Column(unique = true)
    private String email;

    @ManyToMany
    @JoinTable(name = "tb_participante_atividade",
    joinColumns = @JoinColumn(name = "participante_id"),
    inverseJoinColumns = @JoinColumn(name = "atividade_id"))
    Set<Atividade> atividades = new HashSet<>();
}
