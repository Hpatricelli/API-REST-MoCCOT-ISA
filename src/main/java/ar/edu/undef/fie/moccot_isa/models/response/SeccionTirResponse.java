package ar.edu.undef.fie.moccot_isa.models.response;

import ar.edu.undef.fie.moccot_isa.models.entities.GrupoApySecTir;
import ar.edu.undef.fie.moccot_isa.models.entities.GrupoTir;
import ar.edu.undef.fie.moccot_isa.models.entities.PelotonCdoSecTir;
import ar.edu.undef.fie.moccot_isa.models.entities.Personal;


public class SeccionTirResponse {
    public SeccionTirResponse() {}

    private String name;
    private Personal jefe;
    private Personal encargado;
    private GrupoApySecTir grupoApySecTir;
    private GrupoTir grupoTir1;
    private GrupoTir grupoTir2;
    private GrupoTir grupoTir3;
    private PelotonCdoSecTir pelotonCdoSecTir;

    public SeccionTirResponse(String name, Personal jefe, Personal encargado, GrupoApySecTir grupoApySecTir, GrupoTir grupoTir1, GrupoTir grupoTir2, GrupoTir grupoTir3, PelotonCdoSecTir pelotonCdoSecTir) {
        this.name = name;
        this.jefe = jefe;
        this.encargado = encargado;
        this.grupoApySecTir = grupoApySecTir;
        this.grupoTir1 = grupoTir1;
        this.grupoTir2 = grupoTir2;
        this.grupoTir3 = grupoTir3;
        this.pelotonCdoSecTir = pelotonCdoSecTir;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
