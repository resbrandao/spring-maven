package br.com.fiap.springmaven.dto;

public class ProfissionalEspecialidadeDTO {
    private int idProfissionalEspecialidade;
    private int idProfisional;
    private int idEspecialidade;

    public int getIdProfissionalEspecialidade() {
        return idProfissionalEspecialidade;
    }

    public void setIdProfissionalEspecialidade(int idProfissionalEspecialidade) {
        this.idProfissionalEspecialidade = idProfissionalEspecialidade;
    }

    public int getIdProfisional() {
        return idProfisional;
    }

    public void setIdProfisional(int idProfisional) {
        this.idProfisional = idProfisional;
    }

    public int getIdEspecialidade() {
        return idEspecialidade;
    }

    public void setIdEspecialidade(int idEspecialidade) {
        this.idEspecialidade = idEspecialidade;
    }
}
