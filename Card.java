/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker;

/**
 *
 * @author Javier Camacho
 */
public class Card {

    private String palo, valor, color;

    public Card(String palo, String valor, String color) {
        this.palo = palo;
        this.valor = valor;
        this.color = color;
    }

    public String getPalo() {
        return palo;
    }

    public String getValor() {
        return valor;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return "{Palo: " + getPalo() + "}, {Color: " + getColor() + "}, {Valor: " + getValor() + "}";
    }

}
