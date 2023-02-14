package br.com.fiap.springmaven.entity;

import javax.persistence.*;

@Entity
@Table(name = "tbl_agendamento")
public class AgendamentoEntity {
    @Id
    @Column(name = "id_agendamento")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idAgendamento;

    @ManyToOne
    @JoinColumn (name = "id_usuario")
    private UsuarioEntity Usuario;
    @ManyToOne
    @JoinColumn (name = "id_profissional_especialidade")
    private ProfissionalEspecialidadeEntity ProfissionalEspecialidade;
    @Column (name = "data_hora_agendamento")
    private String dataHoraAgendamento;
    @ManyToOne
    @JoinColumn (name = "id_unidade")
    private UnidadeEntity Unidade;

    public Integer getIdAgendamento() {
        return idAgendamento;
    }

    public void setIdAgendamento(Integer idAgendamento) {
        this.idAgendamento = idAgendamento;
    }

    public UsuarioEntity getUsuario() {
        return Usuario;
    }

    public void setUsuario(UsuarioEntity usuario) {
        Usuario = usuario;
    }

    public ProfissionalEspecialidadeEntity getProfissionalEspecialidade() {
        return ProfissionalEspecialidade;
    }

    public void setProfissionalEspecialidade(ProfissionalEspecialidadeEntity profissionalEspecialidade) {
        ProfissionalEspecialidade = profissionalEspecialidade;
    }

    public String getDataHoraAgendamento() {
        return dataHoraAgendamento;
    }

    public void setDataHoraAgendamento(String dataHoraAgendamento) {
        this.dataHoraAgendamento = dataHoraAgendamento;
    }

    public UnidadeEntity getUnidade() {
        return Unidade;
    }

    public void setUnidade(UnidadeEntity unidade) {
        Unidade = unidade;
    }
}
