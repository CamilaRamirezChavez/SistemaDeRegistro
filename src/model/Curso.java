package model;

public class Curso {
    private int codCurso;
    private String nombre;
    private boolean cursoVigente = true;
    private int aniosExperiencia;//anios de experienca del docente necesarios para dictar el curso

    public Curso(int codCurso, String nombre, int aniosExperiencia) {
        this.codCurso = codCurso;
        this.nombre = nombre;
        this.aniosExperiencia = aniosExperiencia;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    @Override
    public String toString() {
        return "Código Curso: " + codCurso + "\n" +
                "Nombre del Curso: " + nombre + "\n" +
                "Años de Experiencia requeridos del docente: " + aniosExperiencia + " anios "+"\n";
    }
}