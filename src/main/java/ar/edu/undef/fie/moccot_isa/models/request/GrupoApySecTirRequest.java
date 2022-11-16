package ar.edu.undef.fie.moccot_isa.models.request;

import ar.edu.undef.fie.moccot_isa.models.entities.*;

public class GrupoApySecTirRequest {
    private String nombre;
    private Personal jefe;
    private PelotonMorGpoApySecTir pelotonMorGpoApySecTir;
    private PelotonAmetGpoApySecTir pelotonAmetGpoApySecTir;
    private PelotonAtanGpoApySecTir pelotonAtanGpoApySecTir;

    public GrupoApySecTirRequest() { }

    public GrupoApySecTirRequest(String nombre, Personal jefe, PelotonMorGpoApySecTir pelotonMorGpoApySecTir, PelotonAmetGpoApySecTir pelotonAmetGpoApySecTir, PelotonAtanGpoApySecTir pelotonAtanGpoApySecTir) {
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

    public GrupoApySecTirRequest(String nombre) {
        this.nombre = nombre;
        this.jefe = new Personal("Jefe Grupo Apoyo");

        this.pelotonAmetGpoApySecTir = new PelotonAmetGpoApySecTir("Peloton Ametralladoras");
        this.pelotonMorGpoApySecTir = new PelotonMorGpoApySecTir("Peloton Morteros");
        this.pelotonAtanGpoApySecTir = new PelotonAtanGpoApySecTir("Peloton Antitanque");


    }
    public GrupoApySecTir toEntitie(){
        return new GrupoApySecTir("Grupo Apoyo Sec Tir");
    }
}
