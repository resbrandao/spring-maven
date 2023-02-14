package br.com.fiap.springmaven.entity;

import javax.persistence.*;

@Entity
@Table(name = "tbl_usuario")
public class UsuarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idUsuario;

    @Column
    private String nomeUsuario;

    @Column
    private String emailUsuario;

    @Column
    private String senhaUsuario;

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getSenhaUsuario() {
        return senhaUsuario;
    }

    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }
}
