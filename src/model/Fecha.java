package model;

public class Fecha {
    private int dia, mes, anio;

    //Lo uso en la creacion de los siguientes objetos alumno, cursoAperturado y fechaActual
    public Fecha() {
        this.dia = 26;
        this.mes = 1;
        this.anio = 2025;
    }

    //Lo uso para fechaNacimiento, fecTitulacion, fecRegistro, para crear a la personaDocente
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    public int getDia() {
        return dia;
    }

    //Metodo usado para calcular la edad del alumno
    public int diferenciaFecha(Fecha fecha) {
        return this.anio - fecha.anio;
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + anio;
    }
}