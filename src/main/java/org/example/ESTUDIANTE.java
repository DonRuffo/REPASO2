package org.example;

public class ESTUDIANTE {
    String nombre, cedula;
    double nota1, nota2;
    public ESTUDIANTE() {}
    public ESTUDIANTE(String nombre, String cedula, double nota1, double nota2) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }


    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }


}
