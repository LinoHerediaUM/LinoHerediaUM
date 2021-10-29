
package modelo.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Lino Heredia
 */
public class ContactoDTO implements Serializable {
    private String nombre;
    private String correo;
    private String mensaje;

    public ContactoDTO() {
    }

    public ContactoDTO(String nombre, String correo, String mensaje) {
        this.nombre = nombre;
        this.correo = correo;
        this.mensaje = mensaje;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return correo + " "+ mensaje;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.nombre);
        hash = 79 * hash + Objects.hashCode(this.correo);
        hash = 79 * hash + Objects.hashCode(this.mensaje);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ContactoDTO other = (ContactoDTO) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.correo, other.correo)) {
            return false;
        }
        if (!Objects.equals(this.mensaje, other.mensaje)) {
            return false;
        }
        return true;
    }
  
    
}
