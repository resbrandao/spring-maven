package br.com.fiap.springmaven.entity;

import javax.persistence.*;

@Entity
@Table(name = "tbl_profissional")
public class ProfissionalEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idProfissional;

    @Column
    private String nomeProfissional;

    public Integer getIdProfissional() {
        return idProfissional;
    }

    public void setIdProfissional(Integer idProfissional) {
        this.idProfissional = idProfissional;
    }

    public String getNomeProfissional() {
        return nomeProfissional;
    }

    public void setNomeProfissional(String nomeProfissional) {
        this.nomeProfissional = nomeProfissional;
    }
}
