package model;

public class Persona {
    protected String DNI, nombres, email;
    protected Fecha fecNac;

    public Persona(String DNI, String nombres) {
        this.DNI = DNI;
        this.nombres = nombres;
    }

    public Persona(String DNI, String nombres, Fecha fecNac, String email) {
        this.DNI = DNI;
        this.nombres = nombres;
        this.fecNac = fecNac;
        this.email = email;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public Fecha getFecNac() {
        return fecNac;
    }

    public void setFecNac(Fecha fecNac) {
        this.fecNac = fecNac;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getEdad() {
        Fecha fechaActual = new Fecha();
        return fechaActual.diferenciaFecha(fecNac);
    }

    @Override
    public String toString() {
        return "DNI: " + DNI + "\nNombre: " + nombres + "\nEdad: " + getEdad() + "\nEmail: " + email + "\n";
    }
}