package com.ejemplo.dao;

import com.ejemplo.modelo.Direccion;
import java.util.List;

public interface DireccionDAO {
    void crear(Direccion direccion);
    List<Direccion> listarPorPersona(int personaId);
}
