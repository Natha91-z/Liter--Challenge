package com.Liter__Challenge.Liter__Challenge.repositories;

import com.Liter__Challenge.Liter__Challenge.models.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LibrosRepository extends JpaRepository<Libro, Long> {
    Optional<Libro> toString(String title);

    Optional<Libro> findAll(Long idLibro);
}
