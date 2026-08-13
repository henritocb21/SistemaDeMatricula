/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadematricula;

/**
 *
 * @author Student
 */
public class Matricula   {
    private String codigoCurso;
    private String nombreCurso;
    private Estudiante estudiante;
    private Profesor profesor;

    public Matricula(String codigoCurso, String nombreCurso, Estudiante estudiante, Profesor profesor) {
        this.codigoCurso = codigoCurso;
        this.nombreCurso = nombreCurso;
        this.estudiante = estudiante;
        this.profesor = profesor;
    }

    public String getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(String codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    
    
    
}
