package ar.edu.undef.fie.moccot_isa.models.Request;

import ar.edu.undef.fie.moccot_isa.models.entities.Organizacion;
import ar.edu.undef.fie.moccot_isa.models.entities.Persona;


import java.util.ArrayList;
import java.util.List;


public class OrganizacionRequest {






    private String nombre;

    private Double efectivoOrganico;

    private List<Organizacion> elementos;


    private List<Persona> personal;

    private Double latitud;
    private Double longitud;
    private Boolean status;
    private Long elemento_superior_id;

    public OrganizacionRequest() {
        this.elementos = new ArrayList<>();
        this.personal = new ArrayList<>();
    }

    public OrganizacionRequest(String nombre, Double efectivoOrganico, List<Organizacion> elementos,
                               List<Persona> personal, Double latitud, Double longitud, Boolean status, Long elemento_superior_id) {
        this.nombre = nombre;
        this.efectivoOrganico = efectivoOrganico;
        this.elementos = elementos;
        this.personal = personal;
        this.latitud = latitud;
        this.longitud = longitud;
        this.status = status;
        this.elemento_superior_id = elemento_superior_id;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Long getElemento_superior_id() {
        return elemento_superior_id;
    }

    public void setElemento_superior_id(Long elemento_superior_id) {
        this.elemento_superior_id = elemento_superior_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getEfectivoOrganico() {
        return efectivoOrganico;
    }

    public void setEfectivoOrganico(Double efectivoOrganico) {
        this.efectivoOrganico = efectivoOrganico;
    }

    public List<Organizacion> getElementos() {
        return elementos;
    }

    public void setElementos(List<Organizacion> elementos) {
        this.elementos = elementos;
    }

    public List<Persona> getPersonal() {
        return personal;
    }

    public void setPersonal(List<Persona> personal) {
        this.personal = personal;
    }

    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }


    public Organizacion toEntity() {
        return new Organizacion(
                nombre, efectivoOrganico,
                elementos,
                personal, latitud, longitud, status, elemento_superior_id);
    }

}
