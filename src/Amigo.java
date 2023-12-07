/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cynthia Camacho
 */
class Amigo {
    String nombre;
    double deuda;

    Amigo(String nombre) {
        this.nombre = nombre;
        this.deuda = 0;
    }

    void agregarDeuda(double monto) {
        this.deuda += monto;
    }

    double obtenerDeuda() {
        return this.deuda;
    }

    String obtenerNombre() {
        return this.nombre;
    }
}
