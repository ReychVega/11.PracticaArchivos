package domain;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author reych
 */
public class Personas implements Serializable{

    private static final long serialVersionUID=1L;
    private String nombre, dni;
    private int edad;
    
    public Personas() {
    }

    public Personas(String nombre, String dni, int edad) {
        super(); 
        this.nombre = nombre;
        this.dni = dni;
        List <String>t;
        
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
