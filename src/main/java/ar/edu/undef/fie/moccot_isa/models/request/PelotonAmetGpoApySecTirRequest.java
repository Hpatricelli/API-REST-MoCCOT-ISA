package ar.edu.undef.fie.moccot_isa.models.request;

import ar.edu.undef.fie.moccot_isa.models.entities.PelotonAmetGpoApySecTir;
import ar.edu.undef.fie.moccot_isa.models.entities.Personal;

import java.util.ArrayList;
import java.util.List;

public class PelotonAmetGpoApySecTirRequest {
    private String nombre;
    private List<Personal> personal;
    private Integer cantidadMaximaDePersonas;

    public PelotonAmetGpoApySecTirRequest(){}

    public PelotonAmetGpoApySecTirRequest(String nombre, List<Personal> personal, Integer cantidadMaximaDePersonas) {
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





    public PelotonAmetGpoApySecTirRequest(String nombre) {
        this.nombre = nombre;
        this.setCantidadMaximaDePersonas(9);
        List<Personal> listPersPelAmet = new ArrayList<>();

        var apAmet1 = new Personal ("Apuntador Ametralladora 1");
        var auxAmet1 = new Personal( "Auxiliar Ametralladora 1");
        var abAmet1 = new Personal( "Abastecedor Ametralladora 1");

        var apAmet2 = new Personal( "Apuntador Ametralladora 2");
        var auxAmet2 = new Personal( "Auxiliar Ametralladora 2");
        var abAmet2 = new Personal( "Abastecedor Ametralladora 2");

        var apAmet3 = new Personal( "Apuntador Ametralladora 3");
        var auxAmet3 = new Personal( "Auxiliar Ametralladora 3");
        var abAmet3 = new Personal( "Abastecedor Ametralladora 3");
        listPersPelAmet.add(apAmet1);
        listPersPelAmet.add(auxAmet1);
        listPersPelAmet.add(abAmet1);
        listPersPelAmet.add(apAmet2);
        listPersPelAmet.add(auxAmet2);
        listPersPelAmet.add(abAmet2);
        listPersPelAmet.add(apAmet3);
        listPersPelAmet.add(auxAmet3);
        listPersPelAmet.add(abAmet3);
        this.setPersonal(listPersPelAmet);
    }
    public PelotonAmetGpoApySecTir toEntitie(){
        return new PelotonAmetGpoApySecTir("Peloton Ametralladoras");
    }
}
