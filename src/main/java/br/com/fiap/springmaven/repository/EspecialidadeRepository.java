package br.com.fiap.springmaven.repository;

import br.com.fiap.springmaven.entity.EspecialidadeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EspecialidadeRepository extends JpaRepository<EspecialidadeEntity, Integer> {
    List<EspecialidadeEntity> findAll();

    @Query(value = "from EspecialidadeEntity")
    List<EspecialidadeEntity> listar();

}
