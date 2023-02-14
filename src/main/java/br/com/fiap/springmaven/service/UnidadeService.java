package br.com.fiap.springmaven.service;

import br.com.fiap.springmaven.dto.CreateUpdateUnidadeDTO;
import br.com.fiap.springmaven.dto.UnidadeDTO;

import java.util.List;

public interface UnidadeService {

    List<UnidadeDTO> getUnidades ();
    UnidadeDTO incluirUnidade(CreateUpdateUnidadeDTO createUpdateUnidadeDto);
}
