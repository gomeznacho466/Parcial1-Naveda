package com.ejemplo.modelo;


public class Direccion {
    private int id;
    private String ciudad;
    private int personaId;

    public Direccion(int id, String ciudad, int personaId) {
        this.id = id;
        this.ciudad = ciudad;
        this.personaId = personaId;
    }

    public Direccion(String ciudad, int personaId) {
        this.ciudad = ciudad;
        this.personaId = personaId;
    }

    public int getId() { return id; }
    public String getCiudad() { return ciudad; }
    public int getPersonaId() { return personaId; }

    public void setId(int id) { this.id = id; }
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }
    public void setPersonaId(int personaId) { this.personaId = personaId; }
}

