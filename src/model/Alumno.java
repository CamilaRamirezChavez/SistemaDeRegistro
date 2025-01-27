package model;

public class Alumno extends Persona {
    private Fecha fecRegistro;
    private boolean alumnoVigente = true;
    private String telefono;

    public Alumno(Persona persona, Fecha fecRegistro, String telefono) {
        super(persona.DNI, persona.nombres, persona.fecNac, persona.email);
        this.fecRegistro = fecRegistro;
        this.telefono = telefono;
    }

    public void setAlumnoVigente(boolean alumnoVigente) {
        this.alumnoVigente = alumnoVigente;
    }

    public boolean isAlumnoVigente() {
        return alumnoVigente;
    }

    public int getAntiguedad() {
        Fecha fechaActual = new Fecha();
        return fechaActual.diferenciaFecha(fecRegistro);
    }

    @Override
    public String toString() {
        return super.toString() +
                "Teléfono: " + telefono + "\n" +
                "Antigüedad: " + getAntiguedad() + " años\n";
    }
}