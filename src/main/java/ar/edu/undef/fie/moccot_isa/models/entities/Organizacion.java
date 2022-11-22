package ar.edu.undef.fie.moccot_isa.models.entities;

import ar.edu.undef.fie.moccot_isa.models.responses.OrganizacionResponse;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Entity
@Table(name = "organizacion")
public class Organizacion {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long organizacionId;

    @Column(unique = true, nullable = false, length = 40)
    private String nombre;

    private Double efectivoOrganico;

    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "elemento_superior_id")
    private List<Organizacion> elementos;

    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "organizacion_id")
    private List<Persona> personal;

    private Double latitud;
    private Double longitud;
    private Boolean status;
    private Long elemento_superior_id;

    public Organizacion() {
        this.elementos = new ArrayList<>();
        this.personal = new ArrayList<>();
    }

    public Organizacion(String nombre, Double efectivoOrganico, List<Organizacion> elementos,
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

    public Long getElemento_superior_id() {
        return elemento_superior_id;
    }

    public void setElemento_superior_id(Long elemento_superior_id) {
        this.elemento_superior_id = elemento_superior_id;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Long getOrganizacionId() {
        return organizacionId;
    }

    public void setOrganizacionId(Long organizacionId) {
        this.organizacionId = organizacionId;
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

    public OrganizacionResponse response() {
        return new OrganizacionResponse(organizacionId, nombre, efectivoOrganico, elementos, personal, latitud, longitud,status);
    }
    public String OrganizacionesInternas(Organizacion organizacion){
        String organizacionesInternas = "";
        for (Organizacion organizacionInterna : organizacion.getElementos()) {
            organizacionesInternas += organizacionInterna.getNombre() + " ";
        }
        return organizacionesInternas;

    }

    public List <Persona>getPersonas() {
        //funcion que devuelve una lista de personas que pertenecen a la organizacion
        List<Persona> personas = new ArrayList<>();
        for (Persona persona : personal) {
            personas.add(persona);
        }
        for (Organizacion organizacion : elementos) {
            personas.addAll(organizacion.getPersonas());
        }
        return personas;
    }
}
