package ar.edu.undef.fie.moccot_isa.models.entities;

import javax.persistence.*;

@Entity

public class GrupoApySecTir {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    @OneToOne(cascade = CascadeType.PERSIST)
    private Personal jefe;
    @OneToOne(cascade = CascadeType.PERSIST)
    private PelotonMorGpoApySecTir pelotonMorGpoApySecTir;
    @OneToOne(cascade = CascadeType.PERSIST)
    private PelotonAmetGpoApySecTir pelotonAmetGpoApySecTir;
    @OneToOne(cascade = CascadeType.PERSIST)
    private PelotonAtanGpoApySecTir pelotonAtanGpoApySecTir;

    public GrupoApySecTir() { }

    public GrupoApySecTir(String nombre, Personal jefe, PelotonMorGpoApySecTir pelotonMorGpoApySecTir, PelotonAmetGpoApySecTir pelotonAmetGpoApySecTir, PelotonAtanGpoApySecTir pelotonAtanGpoApySecTir) {
        this.nombre = nombre;
        this.jefe = jefe;
        this.pelotonMorGpoApySecTir = pelotonMorGpoApySecTir;
        this.pelotonAmetGpoApySecTir = pelotonAmetGpoApySecTir;
        this.pelotonAtanGpoApySecTir = pelotonAtanGpoApySecTir;
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

    public PelotonMorGpoApySecTir getPelotonMorGpoApySecTir() {
        return pelotonMorGpoApySecTir;
    }

    public void setPelotonMorGpoApySecTir(PelotonMorGpoApySecTir pelotonMorGpoApySecTir) {
        this.pelotonMorGpoApySecTir = pelotonMorGpoApySecTir;
    }

    public PelotonAmetGpoApySecTir getPelotonAmetGpoApySecTir() {
        return pelotonAmetGpoApySecTir;
    }

    public void setPelotonAmetGpoApySecTir(PelotonAmetGpoApySecTir pelotonAmetGpoApySecTir) {
        this.pelotonAmetGpoApySecTir = pelotonAmetGpoApySecTir;
    }

    public PelotonAtanGpoApySecTir getPelotonAtanGpoApySecTir() {
        return pelotonAtanGpoApySecTir;
    }

    public void setPelotonAtanGpoApySecTir(PelotonAtanGpoApySecTir pelotonAtanGpoApySecTir) {
        this.pelotonAtanGpoApySecTir = pelotonAtanGpoApySecTir;
    }

    public GrupoApySecTir(String nombre) {
        this.nombre = nombre;
        this.jefe = new Personal("Jefe Grupo Apoyo");

        this.pelotonAmetGpoApySecTir = new PelotonAmetGpoApySecTir("Peloton Ametralladoras");
        this.pelotonMorGpoApySecTir = new PelotonMorGpoApySecTir("Peloton Morteros");
        this.pelotonAtanGpoApySecTir = new PelotonAtanGpoApySecTir("Peloton Antitanque");


    }

}
