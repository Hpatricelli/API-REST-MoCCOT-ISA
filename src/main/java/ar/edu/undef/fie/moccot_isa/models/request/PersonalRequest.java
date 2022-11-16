package ar.edu.undef.fie.moccot_isa.models.request;

import ar.edu.undef.fie.moccot_isa.models.entities.GrupoApySecTir;
import ar.edu.undef.fie.moccot_isa.models.entities.GrupoTir;
import ar.edu.undef.fie.moccot_isa.models.entities.Personal;
import ar.edu.undef.fie.moccot_isa.models.entities.SeccionTir;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class PersonalRequest {

    private String RolCombate;

    public PersonalRequest() {    }

    public PersonalRequest(String rolCombate) {

        RolCombate = rolCombate;
    }



    public Personal toEntitie(String rol){
        return new Personal(rol);
    }
}
