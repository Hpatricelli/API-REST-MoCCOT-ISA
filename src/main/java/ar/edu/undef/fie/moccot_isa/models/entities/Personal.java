package ar.edu.undef.fie.moccot_isa.models.entities;

import ar.edu.undef.fie.moccot_isa.models.request.GrupoApySecTirRequest;
import ar.edu.undef.fie.moccot_isa.models.request.GrupoTirRequest;
import ar.edu.undef.fie.moccot_isa.models.request.SeccionTirRequest;

import javax.persistence.*;

@Entity

public class Personal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String RolCombate;

    public Personal() {    }

    public Personal( String rolCombate) {

        RolCombate = rolCombate;
    }



}
