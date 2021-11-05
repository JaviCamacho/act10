/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Javier Camacho
 */
public class Juego {

    private Deck baraja;
    private Scanner entrada;
    private Exception excepciones;

    public Juego() {
        excepciones = new Exception();
        baraja = new Deck();
        entrada = new Scanner(System.in);
        System.out.println("Bienvenido al menu de Poker");
        System.out.println("Creditos: Javier Eduardo Camacho Mejía ");
        System.out.println("Menu:");
        System.out.println("Mezclar Baraja: 1");
        System.out.println("Tomar carta: 2");
        System.out.println("Ver cara baraja: 3");
        System.out.println("Tomar mano: 4");
        System.out.println("Salir: 5");
        while (true) {
            try {
                System.out.print("\nRespuesta: ");
                int respuesta = entrada.nextInt();
                switch (respuesta) {
                    case 1:
                        baraja.shuffle();
                        break;
                    case 2:
                        baraja.pick();
                        break;
                    case 3:
                        baraja.head();
                        break;
                    case 4:
                        baraja.hand();
                        break;
                    case 5:
                        System.exit(0);
                        break;
                    default:
                        System.err.println("No es valida tu respuesta, vuelve a intentarlo");
                        break;
                }
            } catch (Exception ex) {
                Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
                System.exit(0);
            }
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Juego();
    }

}
