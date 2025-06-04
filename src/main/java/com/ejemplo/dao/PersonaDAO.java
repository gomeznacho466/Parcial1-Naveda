package com.ejemplo.dao;

import com.ejemplo.modelo.Persona;
import java.util.List;

public interface PersonaDAO {
    void crear(Persona persona);
    Persona buscarPorId(int id);
    List<Persona> listarTodos();
    void actualizar(Persona persona);
    void eliminar(int id);
}
