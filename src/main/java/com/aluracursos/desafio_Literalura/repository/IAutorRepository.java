package com.aluracursos.desafio_Literalura.repository;

import com.aluracursos.desafio_Literalura.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IAutorRepository extends JpaRepository<Autor,Long> {
    List<Autor> findByFechaNacimientoLessThanEqualAndFechaFallecimientoGreaterThanEqual(Integer aNo,Integer aNo2);

       Optional<Autor> findByNombreAndFechaNacimiento(String nombre, Integer nacimiento);
}
