/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casoestudio2;

/**
 *
 * @author Cynthia Camacho
 */
 
import javax.swing.JOptionPane;

/**
 *
 * @author Cynthia Camacho
 */
public class CasoEstudio2 {
    public static void main(String[] args) {
        // Crear amigos
        Amigo joshua = new Amigo("Joshua");
        Amigo greivin = new Amigo("Greivin");
        Amigo guillermo = new Amigo("Guillermo");
        Amigo andres = new Amigo("Andres");
        Amigo tavo = new Amigo("Tavo");
        Amigo david = new Amigo("David");
        Amigo[] amigos = {joshua, greivin, guillermo, andres, tavo, david};

        // Crear movimientos
        String[] descripciones = {"Desayuno coffePrime", "Almuerzo Pig Factory", "Cena FastFood", "Pizza Hut", "Quicksilver store", "Apple store", "Desayuno chillis", "Almuerzo hooters"};
        Movimiento[] movimientos = new Movimiento[8];
        for (int i = 0; i < 8; i++) {
            movimientos[i] = new Movimiento(descripciones[i], 100.0, amigos);
            movimientos[i].calcularDeudas();
        }

        // Crear sistema de cuentas
        SistemaDeCuentas sistema = new SistemaDeCuentas(amigos, movimientos);

        // Imprimir la deuda de cada amigo
        for (Amigo amigo : amigos) {
            String mensaje = amigo.obtenerNombre() + " debe: " + sistema.obtenerDeudaAmigo(amigo.obtenerNombre());
            JOptionPane.showMessageDialog(null, mensaje);
        }

        // Agregar un nuevo movimiento
        String descripcionNueva = JOptionPane.showInputDialog("Ingrese la descripción del nuevo movimiento:");
        double montoNuevo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto del nuevo movimiento:"));
        Movimiento movimientoNuevo = new Movimiento(descripcionNueva, montoNuevo, new Amigo[0]);

        String participantesNuevos = JOptionPane.showInputDialog("Ingrese los nombres de los amigos que participarán en el nuevo movimiento, separados por comas:");
        String[] nombresParticipantes = participantesNuevos.split(",");
        Amigo[] amigosParticipantes = new Amigo[nombresParticipantes.length];
        for (int i = 0; i < nombresParticipantes.length; i++) {
            for (Amigo amigo : amigos) {
                if (amigo.obtenerNombre().equals(nombresParticipantes[i])) {
                    amigosParticipantes[i] = amigo;
                    break;
                }
            }
        }
        movimientoNuevo = new Movimiento(descripcionNueva, montoNuevo, amigosParticipantes);
        movimientoNuevo.calcularDeudas();

        // Imprimir la deuda de cada amigo después del nuevo movimiento
        for (Amigo amigo : amigos) {
            String mensaje = amigo.obtenerNombre() + " debe: " + sistema.obtenerDeudaAmigo(amigo.obtenerNombre());
            JOptionPane.showMessageDialog(null, mensaje);
        }
    }
}


