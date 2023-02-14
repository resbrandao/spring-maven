package br.com.fiap.springmaven.service;

import br.com.fiap.springmaven.dto.CreateUpdateEspecialidadeDTO;
import br.com.fiap.springmaven.dto.EspecialidadeDTO;

import java.util.List;

public interface EspecialidadeService {

    List<EspecialidadeDTO> getEspecialidades ();
    EspecialidadeDTO incluirEspecialidade(CreateUpdateEspecialidadeDTO createUpdateEspecialidadeDTO);
}
