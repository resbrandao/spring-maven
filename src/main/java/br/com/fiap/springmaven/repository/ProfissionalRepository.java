package br.com.fiap.springmaven.repository;

import br.com.fiap.springmaven.entity.ProfissionalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProfissionalRepository extends JpaRepository<ProfissionalEntity, Integer> {
    List<ProfissionalEntity> findAll();

    @Query(value = "from ProfissionalEntity")
    List<ProfissionalEntity> listar();

}
