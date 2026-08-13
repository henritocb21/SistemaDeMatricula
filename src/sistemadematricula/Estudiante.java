/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadematricula;

/**
 *
 * @author Student
 */
public class Estudiante {
    private int cedula;
    private String nombre;
    private int edad;
    private int telefono;

    public Estudiante(int cedula, String nombre, int edad, int telefono) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
    }
    
    public Estudiante() {
        this.cedula = 0;
        this.nombre = "";
        this.edad = 0;
        this.telefono = 0;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
}
