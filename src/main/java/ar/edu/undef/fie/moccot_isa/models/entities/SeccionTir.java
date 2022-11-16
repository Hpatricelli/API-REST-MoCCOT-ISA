package ar.edu.undef.fie.moccot_isa.models.entities;

import ar.edu.undef.fie.moccot_isa.models.response.SeccionTirResponse;


import javax.persistence.*;
@Entity
public class SeccionTir {
    private String nombre;
    @OneToOne(cascade = CascadeType.PERSIST)
    private Personal jefe;
    @OneToOne(cascade = CascadeType.PERSIST)
    private Personal encargado;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(cascade = CascadeType.PERSIST)
    private GrupoApySecTir grupoApySecTir;
    @OneToOne(cascade = CascadeType.PERSIST)
    private GrupoTir grupoTir1;
    @OneToOne(cascade = CascadeType.PERSIST)
    private GrupoTir grupoTir2;
    @OneToOne(cascade = CascadeType.PERSIST)
    private GrupoTir grupoTir3;
    @OneToOne(cascade = CascadeType.PERSIST)
    private PelotonCdoSecTir pelotonCdoSecTir;

    public SeccionTir(String nombre, Personal jefe_seccion, Personal encargado_seccion, PelotonCdoSecTir pelotonCdoSecTir, GrupoTir grupoTir, GrupoTir tir, GrupoTir toEntitie, GrupoApySecTir grupoApySecTir) {
    }

    public SeccionTir(String nombre, Personal jefe, Personal encargado, Long id, GrupoApySecTir grupoApySecTir, GrupoTir grupoTir1,GrupoTir grupoTir2,GrupoTir grupoTir3, PelotonCdoSecTir pelotonCdoSecTir) {
        this.nombre = nombre;
        this.jefe = jefe;
        this.encargado = encargado;
        this.id = id;
        this.grupoApySecTir = grupoApySecTir;
        this.grupoTir1 = grupoTir1;
        this.grupoTir2 = grupoTir2;
        this.grupoTir3 = grupoTir3;
        this.pelotonCdoSecTir = pelotonCdoSecTir;
    }

    public SeccionTir() {

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public GrupoApySecTir getGrupoApySecTir() {
        return grupoApySecTir;
    }

    public void setGrupoApySecTir(GrupoApySecTir grupoApySecTir) {
        this.grupoApySecTir = grupoApySecTir;
    }

    public GrupoTir getGrupoTir1() {
        return grupoTir1;
    }

    public void setGrupoTir1(GrupoTir grupoTir1) {
        this.grupoTir1 = grupoTir1;
    }

    public GrupoTir getGrupoTir2() {
        return grupoTir2;
    }

    public void setGrupoTir2(GrupoTir grupoTir2) {
        this.grupoTir2 = grupoTir2;
    }

    public GrupoTir getGrupoTir3() {
        return grupoTir3;
    }

    public void setGrupoTir3(GrupoTir grupoTir3) {
        this.grupoTir3 = grupoTir3;
    }

    public PelotonCdoSecTir getPelotonCdoSecTir() {
        return pelotonCdoSecTir;
    }

    public void setPelotonCdoSecTir(PelotonCdoSecTir pelotonCdoSecTir) {
        this.pelotonCdoSecTir = pelotonCdoSecTir;
    }
    /*
    public void removerElemento(ar.edu.undef.fie.moccotwebisa.models.entities.organizacion.Organizacion organizacion) {
        if (this.elementos.contains(organizacion))
            this.elementos.remove(organizacion);
        else {
            this.elementos.forEach(elemento -> elemento.removerElemento(organizacion));
        }
    }

    public void agregarElemento(ar.edu.undef.fie.moccotwebisa.models.entities.organizacion.Organizacion organizacion) {
        if (!this.elementos.contains(organizacion))
            this.elementos.add(organizacion);
    }
*/
    public void asigarJefe(Personal personal){
        this.jefe = personal;
    }
    public SeccionTir(String nombre) {
        //Agregar ENUM con roles de combate posibles
        this.setNombre(nombre);
        var jefeSeccion = new Personal("Jefe Seccion");
        this.asigarJefe(jefeSeccion);


        this.pelotonCdoSecTir = new PelotonCdoSecTir("Peloton Comando");
        this.grupoTir1 = new GrupoTir("1er Grupo Tiradores");
        this.grupoTir2 = new GrupoTir("2do Grupo Tiradores");
        this.grupoTir3 = new GrupoTir("3er Grupo Tiradores");
        this.grupoApySecTir = new GrupoApySecTir("Grupo Apoyo");


    }
    public SeccionTirResponse response() {
        return new SeccionTirResponse(nombre,jefe, encargado,grupoApySecTir,grupoTir1,grupoTir2,grupoTir3,pelotonCdoSecTir);
    }

}
