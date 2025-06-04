package com.ejemplo.main;
import java.sql.*;
import java.sql.Connection;
import java.sql.Statement;


import com.ejemplo.Impl.DireccionDAOImpl;
import com.ejemplo.dao.DireccionDAO;
import com.ejemplo.dao.PersonaDAO;
import com.ejemplo.modelo.Persona;
import com.ejemplo.modelo.Direccion;
import com.ejemplo.ConexionBD;
import com.ejemplo.modelo.Persona;
import com.ejemplo.dao.PersonaDAO;
import com.ejemplo.dao.DireccionDAO;
import com.ejemplo.Impl.PersonaDAOImpl;
import com.ejemplo.dao.DireccionDAO.*;


import java.util.List;

public class App {
    public static void main(String[] args) {
        PersonaDAO personaDAO = new PersonaDAOImpl();
        DireccionDAO direccionDAO = new DireccionDAOImpl();

        // Crear tabla
        crearTablas();

        // Crear persona
        Persona p = new Persona("Juan Pérez");
        personaDAO.crear(p);

        // Listar personas
        List<Persona> personas = personaDAO.listarTodos();
        for (Persona persona : personas) {
            System.out.println("ID: " + persona.getId() + ", Nombre: " + persona.getNombre());
        }

        // Agregar dirección
        Direccion d = new Direccion("Buenos Aires", 1);
        direccionDAO.crear(d);

        // Mostrar direcciones
        List<Direccion> direcciones = direccionDAO.listarPorPersona(1);
        for (Direccion dir : direcciones) {
            System.out.println("Dirección: " + dir.getCiudad());
        }
    }

    private static void crearTablas() {
        try (Connection con = ConexionBD.obtenerConexion();
             Statement stmt = con.createStatement()) {

            stmt.execute("CREATE TABLE IF NOT EXISTS persona (id IDENTITY PRIMARY KEY, nombre VARCHAR(255))");
            stmt.execute("CREATE TABLE IF NOT EXISTS direccion (id IDENTITY PRIMARY KEY, ciudad VARCHAR(255), persona_id INT, FOREIGN KEY (persona_id) REFERENCES persona(id))");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
