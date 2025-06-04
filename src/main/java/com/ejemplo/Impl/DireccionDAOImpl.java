package com.ejemplo.Impl;

import com.ejemplo.dao.DireccionDAO;
import com.ejemplo.modelo.Direccion;
import com.ejemplo.conexion.ConexionBD;

import java.sql.*;
import java.util.*;

public class DireccionDAOImpl implements DireccionDAO {

    @Override
    public void crear(Direccion direccion) {
        String sql = "INSERT INTO direccion(ciudad, persona_id) VALUES(?, ?)";
        try (Connection con = ConexionBD.obtenerConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, direccion.getCiudad());
            ps.setInt(2, direccion.getPersonaId());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Direccion> listarPorPersona(int personaId) {
        List<Direccion> lista = new ArrayList<>();
        String sql = "SELECT * FROM direccion WHERE persona_id = ?";
        try (Connection con = ConexionBD.obtenerConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, personaId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                lista.add(new Direccion(rs.getInt("id"), rs.getString("ciudad"), rs.getInt("persona_id")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}












