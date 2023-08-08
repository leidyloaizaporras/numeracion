/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programagenero;

enum Genero {
    MASCULINO, FEMENINO, NO_BINARIO, PREFERIR_NO_DECIR
}

class Persona {
    String nombre;
    int edad;
    Genero genero;

    public Persona(String nombre, int edad, Genero genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Género: " + genero);
    }
}

public class ProgramaGenero {

  public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 30, Genero.MASCULINO);
        Persona persona2 = new Persona("María", 25, Genero.FEMENINO);
        Persona persona3 = new Persona("Alex", 28, Genero.NO_BINARIO);

        System.out.println("Persona 1:");
        persona1.mostrarInformacion();

        System.out.println("\nPersona 2:");
        persona2.mostrarInformacion();

        System.out.println("\nPersona 3:");
        persona3.mostrarInformacion();
    }
}
    