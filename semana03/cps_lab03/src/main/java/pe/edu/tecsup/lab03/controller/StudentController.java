package pe.edu.tecsup.lab03.controller;

import pe.edu.tecsup.lab03.services.StudentService;

public class StudentController {

    private final StudentService studentService = new StudentService();

    public String saludar() {
        return "Hola estudiante - Sprint 2";
    }
}