package ar.edu.undef.fie.moccot_isa.models.responses;

import ar.edu.undef.fie.moccot_isa.models.entities.Grado;

public class PersonaResponse {
    private Enum<Grado> grado;
    private String nombre;
    private String apellido;
    private Boolean status;


    public PersonaResponse(Grado grado, String nombre, String apellido,Boolean status) {
        this.grado = grado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.status = status;

    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Enum<Grado> getGrado() {
        return grado;
    }

    public void setGrado(Enum<Grado> grado) {
        this.grado = grado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


}
