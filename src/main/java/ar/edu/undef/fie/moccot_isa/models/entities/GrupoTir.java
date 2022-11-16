package ar.edu.undef.fie.moccot_isa.models.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity

public class GrupoTir {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    @OneToOne(cascade = CascadeType.PERSIST)
    private Personal jefe;
    @OneToOne(cascade = CascadeType.PERSIST)
    private Personal encargado;
    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Personal> personal;

    private Integer cantidadMaximaDePersonas;

    public GrupoTir(){}

    public GrupoTir(String nombre, Personal jefe, Personal encargado, List<Personal> personal, Integer cantidadMaximaDePersonas) {
        this.nombre = nombre;
        this.jefe = jefe;
        this.encargado = encargado;
        this.personal = personal;
        this.cantidadMaximaDePersonas = cantidadMaximaDePersonas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Personal getJefe() {
        return jefe;
    }

    public void setJefe(Personal jefe) {
        this.jefe = jefe;
    }

    public Personal getEncargado() {
        return encargado;
    }

    public void setEncargado(Personal encargado) {
        this.encargado = encargado;
    }

    public List<Personal> getPersonal() {
        return personal;
    }

    public void setPersonal(List<Personal> personal) {
        this.personal = personal;
    }

    public Integer getCantidadMaximaDePersonas() {
        return cantidadMaximaDePersonas;
    }

    public void setCantidadMaximaDePersonas(Integer cantidadMaximaDePersonas) {
        this.cantidadMaximaDePersonas = cantidadMaximaDePersonas;
    }

    public GrupoTir(String nombre) {
        this.nombre = nombre;
        this.jefe = new Personal("Jefe Grupo Tiradores");
        this.setCantidadMaximaDePersonas(5);
        //Gpo de 5 tiradores
        var tirador1 = new Personal( "Tirador 1");
        var tirador2 = new Personal( "Tirador 2");
        var tirador3 = new Personal( "Tirador 3");
        var tirador4 = new Personal( "Tirador 4");
        var tirador5 = new Personal( "Tirador 5");

        List<Personal> listPersGpoTir = new ArrayList<>();
        listPersGpoTir.add(tirador1);
        listPersGpoTir.add(tirador2);
        listPersGpoTir.add(tirador3);
        listPersGpoTir.add(tirador4);
        listPersGpoTir.add(tirador5);
        this.setPersonal(listPersGpoTir);

    }
    public GrupoTir toEntitie(){
        return new GrupoTir("Grupo de Tiradores");
    }
}
