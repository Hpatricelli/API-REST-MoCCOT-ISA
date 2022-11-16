package ar.edu.undef.fie.moccot_isa.models.request;

import ar.edu.undef.fie.moccot_isa.models.entities.*;

public class SeccionTirRequest {
    private Long id;
    private String name;
    public SeccionTirRequest(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    /*
    private String nombre;
    private PersonalRequest jefe;
    private PersonalRequest encargado;

    private GrupoApySecTirRequest grupoApySecTir;
    private GrupoTirRequest grupoTir1;
    private GrupoTirRequest grupoTir2;
    private GrupoTirRequest grupoTir3;
    private PelotonCdoSecTirRequest pelotonCdoSecTir;

    public SeccionTirRequest(String nombre, PersonalRequest jefe, PersonalRequest encargado, GrupoApySecTirRequest grupoApySecTir, GrupoTirRequest grupoTir1, GrupoTirRequest grupoTir2, GrupoTirRequest grupoTir3, PelotonCdoSecTirRequest pelotonCdoSecTir) {
        this.nombre = nombre;
        this.jefe = jefe;
        this.encargado = encargado;
        this.grupoApySecTir = grupoApySecTir;
        this.grupoTir1 = grupoTir1;
        this.grupoTir2 = grupoTir2;
        this.grupoTir3 = grupoTir3;
        this.pelotonCdoSecTir = pelotonCdoSecTir;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public PersonalRequest getJefe() {
        return jefe;
    }

    public void setJefe(PersonalRequest jefe) {
        this.jefe = jefe;
    }

    public PersonalRequest getEncargado() {
        return encargado;
    }

    public void setEncargado(PersonalRequest encargado) {
        this.encargado = encargado;
    }

    public GrupoApySecTirRequest getGrupoApySecTir() {
        return grupoApySecTir;
    }

    public void setGrupoApySecTir(GrupoApySecTirRequest grupoApySecTir) {
        this.grupoApySecTir = grupoApySecTir;
    }

    public GrupoTirRequest getGrupoTir1() {
        return grupoTir1;
    }

    public void setGrupoTir1(GrupoTirRequest grupoTir1) {
        this.grupoTir1 = grupoTir1;
    }

    public GrupoTirRequest getGrupoTir2() {
        return grupoTir2;
    }

    public void setGrupoTir2(GrupoTirRequest grupoTir2) {
        this.grupoTir2 = grupoTir2;
    }

    public GrupoTirRequest getGrupoTir3() {
        return grupoTir3;
    }

    public void setGrupoTir3(GrupoTirRequest grupoTir3) {
        this.grupoTir3 = grupoTir3;
    }

    public PelotonCdoSecTirRequest getPelotonCdoSecTir() {
        return pelotonCdoSecTir;
    }

    public void setPelotonCdoSecTir(PelotonCdoSecTirRequest pelotonCdoSecTir) {
        this.pelotonCdoSecTir = pelotonCdoSecTir;
    }

    public SeccionTir toEntity() {
        return new SeccionTir(
                nombre,
                jefe.toEntitie("jefe Seccion"),
                encargado.toEntitie("Encargado Seccion"),
                pelotonCdoSecTir.toEntitie(),
                grupoTir1.toEntitie(),
                grupoTir2.toEntitie(),
                grupoTir3.toEntitie(),
                grupoApySecTir.toEntitie());
    }*/
}
