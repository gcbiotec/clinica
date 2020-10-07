package br.com.fundatec.clinica.domain;

import java.time.LocalDate;
import javax.persistence.*;

@Entity
@Table(name = "consulta")
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_veterinario")
    private String nomeVeterinario;

    @Column(name = "data")
    private LocalDate data;

    public Consulta(Long id, String nomeVeterinario, LocalDate data) {
        this.id = id;
        this.nomeVeterinario = nomeVeterinario;
        this.data = data;
    }

    public Consulta(String nomeVeterinario, LocalDate data) {
        this.nomeVeterinario = nomeVeterinario;
        this.data = data;
    }

    public Consulta() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeVeterinario() {
        return nomeVeterinario;
    }

    public void setNomeVeterinario(String nomeVeterinario) {
        this.nomeVeterinario = nomeVeterinario;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}
