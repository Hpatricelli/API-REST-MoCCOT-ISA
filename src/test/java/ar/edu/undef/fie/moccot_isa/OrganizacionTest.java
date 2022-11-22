package ar.edu.undef.fie.moccot_isa;

import ar.edu.undef.fie.moccot_isa.models.entities.Organizacion;
import ar.edu.undef.fie.moccot_isa.models.entities.Persona;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static ar.edu.undef.fie.moccot_isa.models.entities.Grado.SG;
import static ar.edu.undef.fie.moccot_isa.models.entities.Grado.SV;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrganizacionTest {
    @Test
    @DisplayName("Creamos un peloton de tiradores a CO")
    void test1() {

        Organizacion organizacion = new Organizacion("1er Peloton Tiradores", 11D, null, null, 343427D, 582612D, true, 1L);

        var num = organizacion.getOrganizacionId();
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona(SG, "Ramon", "Baez", true, num));
        personas.add(new Persona(SV, "Juan", "Perez", true, num));
        personas.add(new Persona(SV, "Pedro", "Gomez", true, num));
        personas.add(new Persona(SV, "Jose", "Lopez", true, num));
        personas.add(new Persona(SV, "Carlos", "Gonzalez", true, num));
        personas.add(new Persona(SV, "Martin", "Rodriguez", true, num));
        personas.add(new Persona(SV, "Jorge", "Martinez", true, num));
        personas.add(new Persona(SV, "Luis", "Gutierrez", true, num));
        personas.add(new Persona(SV, "Alberto", "Sanchez", true, num));
        personas.add(new Persona(SV, "Raul", "Fernandez", true, num));
        personas.add(new Persona(SV, "Miguel", "Garcia", true, num));


        organizacion.setPersonal(personas);

        assertEquals(organizacion.getPersonal().size(), 11);

        assertEquals(organizacion.getPersonal().get(0).getNombre(), "Ramon");


    }
}
