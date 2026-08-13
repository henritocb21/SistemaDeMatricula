/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadematricula;

/**
 *
 * @author Student
 */
public class Profesor {

    private String nombre;
    private int cedula;
    private int edad;
    private int telefono;

    public Profesor(String nombre, int cedula, int edad, int telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.telefono = telefono;
    }

    public Profesor() {
        this.nombre = "";
        this.cedula = 0;
        this.edad = 0;
        this.telefono = 0;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
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
