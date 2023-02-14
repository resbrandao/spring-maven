package br.com.fiap.springmaven.controller;

import br.com.fiap.springmaven.dto.CreateUpdateEspecialidadeDTO;
import br.com.fiap.springmaven.dto.EspecialidadeDTO;
import br.com.fiap.springmaven.service.EspecialidadeService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("especialidades")
public class EspecialidadeController {

    private EspecialidadeService especialidadeService;

    public EspecialidadeController(EspecialidadeService especialidadeService){
        this.especialidadeService = especialidadeService;
    }

    @GetMapping
    public List getEspecialidades(){
        return (List<EspecialidadeDTO>) especialidadeService.getEspecialidades();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public EspecialidadeDTO incluirEspecialidade (@RequestBody CreateUpdateEspecialidadeDTO createUpdateEspecialidadeDTO){
        return especialidadeService.incluirEspecialidade(createUpdateEspecialidadeDTO);
    }

}

