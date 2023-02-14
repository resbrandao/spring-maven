package br.com.fiap.springmaven.entity;

import javax.persistence.*;

@Entity
@Table(name = "tbl_especialidade")
public class EspecialidadeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idEspecialidade;

    @Column
    private String nomeEspecialidade;

    public Integer getIdEspecialidade() {
        return idEspecialidade;
    }

    public void setIdEspecialidade(Integer idEspecialidade) {
        this.idEspecialidade = idEspecialidade;
    }

    public String getNomeEspecialidade() {
        return nomeEspecialidade;
    }

    public void setNomeEspecialidade(String nomeEspecialidade) {
        this.nomeEspecialidade = nomeEspecialidade;
    }
}
