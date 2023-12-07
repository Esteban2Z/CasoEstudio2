/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cynthia Camacho
 */
class Movimiento {
    String descripcion;
    double monto;
    Amigo[] participantes;

    Movimiento(String descripcion, double monto, Amigo[] participantes) {
        this.descripcion = descripcion;
        this.monto = monto;
        this.participantes = participantes;
    }

    void calcularDeudas() {
        double montoIndividual = this.monto / this.participantes.length;
        for (Amigo amigo : this.participantes) {
            amigo.agregarDeuda(montoIndividual);
        }
    }
}

