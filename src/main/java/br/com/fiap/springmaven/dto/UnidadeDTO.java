package br.com.fiap.springmaven.dto;

public class UnidadeDTO {
    private int idUnidade;
    private String nomeUnidade;
    private String enderecoUnidade;
    private String telefoneUnidade;

    public int getIdUnidade() {
        return idUnidade;
    }

    public void setIdUnidade(int idUnidade) {
        this.idUnidade = idUnidade;
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
