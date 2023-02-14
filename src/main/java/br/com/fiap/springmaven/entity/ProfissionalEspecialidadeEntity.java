package br.com.fiap.springmaven.entity;

import javax.persistence.*;

@Entity
@Table(name = "tbl_profissional_especialidade")
public class ProfissionalEspecialidadeEntity {
    @Id
    @Column(name = "id_profissional_especialidade")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idProfissionalEspecialidade;

    @ManyToOne
    @JoinColumn (name = "id_profissional")
    private ProfissionalEntity Profissional;
    @ManyToOne
    @JoinColumn (name = "id_especialidade")
    private EspecialidadeEntity Especialidade;

    public Integer getIdProfissionalEspecialidade() {
        return idProfissionalEspecialidade;
    }

    public void setIdProfissionalEspecialidade(Integer idProfissionalEspecialidade) {
        this.idProfissionalEspecialidade = idProfissionalEspecialidade;
    }

    public ProfissionalEntity getProfissional() {
        return Profissional;
    }

    public void setProfissional(ProfissionalEntity profissional) {
        Profissional = profissional;
    }

    public EspecialidadeEntity getEspecialidade() {
        return Especialidade;
    }

    public void setEspecialidade(EspecialidadeEntity especialidade) {
        Especialidade = especialidade;
    }
}
