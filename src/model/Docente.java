package model;

public class Docente extends Persona {
    private Fecha fecRegistro, fecTitulacion;
    private boolean docenteVigente = true;
    private String telefono;

    public Docente(Persona persona, Fecha fecTitulacion, Fecha fecRegistro, String telefono) {
        super(persona.DNI, persona.nombres, persona.fecNac, persona.email);
        this.fecTitulacion = fecTitulacion;
        this.fecRegistro = fecRegistro;
        this.telefono = telefono;
    }

    public boolean getDocenteVigente() {
        return docenteVigente;
    }

    public void setDocenteVigente(boolean docenteVigente) {
        this.docenteVigente = docenteVigente;
    }

    public int getAntiguedad() {
        Fecha fechaActual = new Fecha();
        return fechaActual.diferenciaFecha(fecRegistro);
    }

    public int getTiempoExperiencia() {
        Fecha fechaActual = new Fecha();
        return fechaActual.diferenciaFecha(fecTitulacion);
    }

    @Override
    public String toString() {
        return super.toString() +
                "Antigüedad: " + getAntiguedad() + " años\n" +
                "Experiencia: " + getTiempoExperiencia() + " años\n" +
                "Teléfono: " + telefono + "\n";
    }
}
