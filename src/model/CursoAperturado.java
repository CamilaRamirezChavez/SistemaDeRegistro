package model;

public class CursoAperturado {
    private int codCursoAperturado;
    private Docente docente;
    private Curso curso;
    private Fecha fechaInicio;

    public CursoAperturado(int codCursoAperturado, Docente docente, Curso curso, Fecha fechaInicio) {
        this.codCursoAperturado = codCursoAperturado;
        this.docente = docente;
        this.curso = curso;
        this.fechaInicio = fechaInicio;
    }

    @Override
    public String toString() {
        return "-----Datos del curso Aperturado------\n" + curso +
                "-----Datos del Docente confirmado-------\n" + docente +
                "Fecha Inicio del curso: " + fechaInicio + "\n";
    }
}