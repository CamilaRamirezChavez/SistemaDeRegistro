package controller;

import model.Alumno;
import model.Fecha;
import model.Persona;
import model.Curso;
import model.Matricula;
import model.Docente;
import model.CursoAperturado;

public class TestSistemaDeRegistro {

    public static void main(String[] args) {
        // Crear el curso
        System.out.println("------------CARGANDO SISTEMA-----------");
        Curso curso = new Curso(1, "Programación", 2);
        System.out.println(curso);

        // Crear docente
        System.out.println("-----------COMPROBANDO LA EXPERIENCIA DEL DOCENTE------------ ");
        Fecha fecTitulacion = new Fecha(15, 6, 2018);
        Fecha fecRegistro = new Fecha(1, 1, 2019);
        Persona personaDocente = new Persona("87654321", "Ana Gomez", new Fecha(25, 12, 1990), "ana@gmail.com");
        Docente docente = new Docente(personaDocente, fecTitulacion, fecRegistro, "912345678");


        // Validar la experiencia del docente para poder abrir curso
        if (docente.getTiempoExperiencia() >= curso.getAniosExperiencia()) {
            System.out.println("El docente tiene suficiente experiencia para el curso.");
            CursoAperturado cursoAperturado = new CursoAperturado(1, docente , curso, new Fecha());
            System.out.println();
            System.out.println("Curso APERTURADO, contamos con docente");
            System.out.println();
            System.out.println(cursoAperturado);
        } else {
            docente.setDocenteVigente(false);
            System.out.println("El docente no cumple con los años de experiencia requeridos, matricula no procede.");
        }

        // Crear fecha de nacimiento para personaAlumno
        Fecha fechaNacimiento = new Fecha(10, 5, 2000);

        // Crear a alumno
        Persona personaAlumno = new Persona("12345678", "Juan Perez", fechaNacimiento, "juan@gmail.com");
        Alumno alumno = new Alumno(personaAlumno, new Fecha(), "987654321");

        // Validar la edad para matricularse
        System.out.println("-----------LA MATRICULA DEL ALUMNO---------------------------- ");
        System.out.println();
        System.out.println("-----------COMPROBANDO LA EDAD DEL ALUMNO--------------------- ");
        if (alumno.getEdad() >= 18) {
            System.out.println("1. El alumno es mayor de edad puede matricularse.");

        } else {
            alumno.setAlumnoVigente(false);
            System.out.println("1. El alumno no cumple con la edad mínima por ello la matricula no procede.");
        }

        System.out.println();
        // Matricula exitosa del alumno solo si cumplen la condicion
        if(alumno.isAlumnoVigente() == true && docente.getDocenteVigente() == true) {
            CursoAperturado cursoAperturado = new CursoAperturado(101, docente, curso, new Fecha());
            Matricula matricula = new Matricula(cursoAperturado, alumno, true);
            System.out.println("---------DATOS DE LA MATRICULA------------");
            System.out.println(matricula);
            System.out.println("El alumno fue matriculado de manera EXITOSA ");
        }
    }
}
