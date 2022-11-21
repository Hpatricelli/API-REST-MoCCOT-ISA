package ar.edu.undef.fie.moccot_isa.services;

import ar.edu.undef.fie.moccot_isa.models.entities.Sesion;
import ar.edu.undef.fie.moccot_isa.models.entities.Usuario;
import ar.edu.undef.fie.moccot_isa.repositories.SesionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;

@Service
public class SesionService {
    @Autowired
    private SesionRepository sesionRepository;

    public SesionService(SesionRepository sesionRepository) {
        this.sesionRepository = sesionRepository;
    }


    public Sesion getSesionActiva() {
        return sesionRepository.findSesionByActiva(true);
    }


    public void nuevaSesion(Usuario usuario) {
        cerrarSesion();
        Sesion sesionNueva = new Sesion();
        sesionNueva.setUsuario(usuario);
        sesionNueva.setInicioSesion(Calendar.getInstance());
        sesionNueva.setActiva(true);
        sesionRepository.save(sesionNueva);
    }


    public void cerrarSesion() {
        Sesion sesionActiva = getSesionActiva();
        if (sesionActiva != null){
            sesionActiva.setActiva(false);
            sesionActiva.setFinSesion(Calendar.getInstance());
            sesionRepository.save(sesionActiva);
        }

    }
}
