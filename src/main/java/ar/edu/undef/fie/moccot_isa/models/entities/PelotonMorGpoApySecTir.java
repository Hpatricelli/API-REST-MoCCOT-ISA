package ar.edu.undef.fie.moccot_isa.models.entities;

import ar.edu.undef.fie.moccot_isa.models.entities.Personal;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity

public class PelotonMorGpoApySecTir {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Personal> personal;
    private Integer cantidadMaximaDePersonas;

    public PelotonMorGpoApySecTir(){}

    public PelotonMorGpoApySecTir(String nombre, List<Personal> personal, Integer cantidadMaximaDePersonas) {
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

    public PelotonMorGpoApySecTir(String nombre) {

        this.nombre = nombre;
        this.setCantidadMaximaDePersonas(4);
        List<Personal> listPerPelMor = new ArrayList<>();

        var apuntMort = new Personal( "Apuntador de Mortero");
        var auxMor1 = new Personal( "Auxiliar Mortero 1");
        var auxMor2 = new Personal( "Auxiliar Mortero 2");
        var auxMor3 = new Personal( "Auxiliar Mortero 3");
        listPerPelMor.add(apuntMort);
        listPerPelMor.add(auxMor1);
        listPerPelMor.add(auxMor2);
        listPerPelMor.add(auxMor3);
        this.setPersonal(listPerPelMor);
    }
    public PelotonMorGpoApySecTir toEntite(){
        return new PelotonMorGpoApySecTir("Peloton Mortero");
    }
}
