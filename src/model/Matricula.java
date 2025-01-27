package model;

public class Matricula {
    private CursoAperturado cursoMatriculado;
    private Alumno alumno;
    private boolean pagado;
    private Fecha fechaPago;

    public Matricula(CursoAperturado cursoMatriculado, Alumno alumno, boolean pagado) {
        this.cursoMatriculado = cursoMatriculado;
        this.alumno = alumno;
        this.pagado = pagado;
    }

    @Override
    public String toString() {
        return "--------Datos del Alumno Matrículado-------\n" + alumno + cursoMatriculado + "--------Estado del Pago--------\n" +
                "Pagado: " + (pagado ? "Sí" : "No") + "\n";
    }
}