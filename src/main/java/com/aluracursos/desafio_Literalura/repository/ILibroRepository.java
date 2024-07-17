package com.aluracursos.desafio_Literalura.repository;

import com.aluracursos.desafio_Literalura.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ILibroRepository extends JpaRepository<Libro, Long> {

    Libro findByTituloIgnoreCase(String titulo);

    List<Libro> findByIdioma(String idioma);
}

