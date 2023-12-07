/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cynthia Camacho
 */
class SistemaDeCuentas {
    Amigo[] amigos;
    Movimiento[] movimientos;

    SistemaDeCuentas(Amigo[] amigos, Movimiento[] movimientos) {
        this.amigos = amigos;
        this.movimientos = movimientos;
    }

    double obtenerDeudaAmigo(String nombre) {
        for (Amigo amigo : this.amigos) {
            if (amigo.obtenerNombre().equals(nombre)) {
                return amigo.obtenerDeuda();
            }
        }
        return 0;
    }
}


