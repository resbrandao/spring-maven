package br.com.fiap.springmaven.service;

import br.com.fiap.springmaven.dto.CreateUpdateProfissionalDTO;
import br.com.fiap.springmaven.dto.ProfissionalDTO;
import br.com.fiap.springmaven.entity.ProfissionalEntity;
import br.com.fiap.springmaven.repository.ProfissionalRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProfissionalServiceImpl implements ProfissionalService {

    private ProfissionalRepository profissionalRepository;

    public ProfissionalServiceImpl(ProfissionalRepository profissionalRepository){
        this.profissionalRepository = profissionalRepository;
    }

    public List<ProfissionalDTO> getProfissionais() {
        return profissionalRepository.findAll()
                .stream()
                .map(entity -> {
                    ProfissionalDTO dto = new ProfissionalDTO();
                    dto.setIdProfissional(entity.getIdProfissional());
                    dto.setNomeProfissional(entity.getNomeProfissional());
                    return dto;
                }).collect(Collectors.toList());
    }

    @Override
    public ProfissionalDTO incluirProfissional(CreateUpdateProfissionalDTO createUpdateProfissionalDTO) {
        ProfissionalEntity entity = new ProfissionalEntity();
        entity.setNomeProfissional(createUpdateProfissionalDTO.getNomeProfissional());

        ProfissionalEntity savedEntity = profissionalRepository.save(entity);

        ProfissionalDTO dto = new ProfissionalDTO();
        dto.setIdProfissional(savedEntity.getIdProfissional());
        dto.setNomeProfissional(savedEntity.getNomeProfissional());

        return dto;
    }
}

