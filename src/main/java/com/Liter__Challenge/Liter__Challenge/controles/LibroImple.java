package com.Liter__Challenge.Liter__Challenge.controles;


import com.Liter__Challenge.Liter__Challenge.models.Libro;
import com.Liter__Challenge.Liter__Challenge.repositories.LibrosRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class LibroImple implements LibroControles{

    @Autowired
    private LibrosRepository librosRepository;

    @Override
    public List<Libro> findAllLibros() {
        return librosRepository.findAll();
    }

    @Override
    public Optional<Libro> findLibroById(Long idLibro) {
        return librosRepository.findAll(idLibro);
    }

    @Override
    public Libro seveLibro(Libro libro) {
        return librosRepository.save(libro);
    }

    @Override
    public void updateLibro(Long idLibro, Libro libro) {
        Libro libro1 = findLibroById(idLibro).get();
        libro1.settitle(libro.getClass());
        libro1.setauthors(libro.getClass());
        libro1.Setlanguages(libro.getClass());
        librosRepository.save(libro);

    }

    @Override
    public Void deleteLibroById(Long idLibro) {
        librosRepository.deleteById(idLibro);
        return null;
    }
}
