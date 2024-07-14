package com.Liter__Challenge.Liter__Challenge.controles;

import com.Liter__Challenge.Liter__Challenge.models.Libro;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface LibroControles {

    List<Libro> findAllLibros();
    Optional<Libro> findLibroById(Long idLibro);
   Libro seveLibro(Libro libro);
   void updateLibro(Long idLibro, Libro libro);
   Void deleteLibroById(Long idLibro);

}
