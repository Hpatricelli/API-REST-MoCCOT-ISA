package ar.edu.undef.fie.moccot_isa.models.Request;

import ar.edu.undef.fie.moccot_isa.models.entities.Persona;
import ar.edu.undef.fie.moccot_isa.models.entities.Usuario;

public class UsuarioRequest {
    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private String password;

    public UsuarioRequest(String nombre, String apellido, String email, String telefono, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.password = password;

    }

    public UsuarioRequest() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Usuario toEntity() {
        return new Usuario(nombre, apellido,email,telefono,password);
    }

    public Usuario construct() {
        Usuario usuario = new Usuario(nombre,apellido,email,telefono,password);
        usuario.setId(id);
        return usuario;
    }
}
