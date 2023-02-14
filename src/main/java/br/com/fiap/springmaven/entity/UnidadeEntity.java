package br.com.fiap.springmaven.entity;

import javax.persistence.*;

@Entity
@Table(name = "tbl_unidade")
public class UnidadeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idUnidade;

    @Column
    private String nomeUnidade;

    @Column
    private String enderecoUnidade;

    @Column
    private String telefoneUnidade;

    public Integer getIdUnidade() {
        return idUnidade;
    }

    public String getNomeUnidade() {
        return nomeUnidade;
    }

    public void setNomeUnidade(String nomeUnidade) {
        this.nomeUnidade = nomeUnidade;
    }

    public String getEnderecoUnidade() {
        return enderecoUnidade;
    }

    public void setEnderecoUnidade(String enderecoUnidade) {
        this.enderecoUnidade = enderecoUnidade;
    }

    public String getTelefoneUnidade() {
        return telefoneUnidade;
    }

    public void setTelefoneUnidade(String telefoneUnidade) {
        this.telefoneUnidade = telefoneUnidade;
    }
}
