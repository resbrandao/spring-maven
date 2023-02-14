package br.com.fiap.springmaven.service;

import br.com.fiap.springmaven.dto.CreateUpdateProfissionalDTO;
import br.com.fiap.springmaven.dto.ProfissionalDTO;

import java.util.List;

public interface ProfissionalService {

    List<ProfissionalDTO> getProfissionais ();
    ProfissionalDTO incluirProfissional(CreateUpdateProfissionalDTO createUpdateProfissionalDTO);
}
