package ar.edu.undef.fie.moccot_isa.models.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity

public class PelotonCdoSecTir {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Personal> personal;
    private Integer cantidadMaximaDePersonas;

    public PelotonCdoSecTir(){}

    public PelotonCdoSecTir(String nombre, List<Personal> personal, Integer cantidadMaximaDePersonas) {
        this.nombre = nombre;
        this.personal = personal;
        this.cantidadMaximaDePersonas = cantidadMaximaDePersonas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public PelotonCdoSecTir(String nombre) {

        this.nombre = nombre;

        this.setCantidadMaximaDePersonas(3);
        //Personal
        var estafeta = new Personal( "Estafeta");
        var radioOperador = new Personal( "Radio Operador");
        var ObservadorMor81 = new Personal( "Observador Adelantado Mor 81");

        List<Personal> listPersPelCdo = new ArrayList<>();
        listPersPelCdo.add(estafeta);
        listPersPelCdo.add(radioOperador);
        listPersPelCdo.add(ObservadorMor81);
        setPersonal(listPersPelCdo);
    }
    public PelotonCdoSecTir toEntitie(){
        return new PelotonCdoSecTir("Peloton Comando");
    }
}
