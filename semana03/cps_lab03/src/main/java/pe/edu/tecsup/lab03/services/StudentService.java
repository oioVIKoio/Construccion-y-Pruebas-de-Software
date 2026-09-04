package pe.edu.tecsup.lab03.services;

public class StudentService {

    public String getNombreCompleto(String nombre, String apellido) {
        return nombre + " " + apellido;
    }

    public boolean esMayorDeEdad(int edad) {
        return edad >= 18;
    }

    public double calcularPromedio(double nota1, double nota2) {
        return (nota1 + nota2) / 2.0;
    }
}