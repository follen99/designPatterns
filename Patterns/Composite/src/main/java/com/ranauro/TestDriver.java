/**
 * @author giuliano ranauro
 * Date: 18/07/2021 11:45
 * Ide: Intellij
 * JDK: 1.8
 * @version 1.0
 */
package com.ranauro;

public class TestDriver {
    /**
     * Il pattern composite ci permette di trattare un singolo oggetto
     * ed una composizione di oggetti di quello stesso tipo, in modo uniforme
     *
     * Es: posso pensare ad un elemento come una linea, triangolo o cerchio;
     * posso pensare ad una composizione composta da una linea, un triangolo ed un cerchio
     *
     * L'obbiettivo è quello di stampare tutti gli oggetti, ovviamente non voglio controllare
     * per ogni singolo oggetto di che tipo è, ma ogni oggetto ha la responsabilità di "disegnarsi"
     * quindi io mi limiterò a chiamare per ogni oggetto il metodo "draw"
     *
     * come mi assicuro che oggetti di classi diverse implementino lo stesso metodo?
     * utilizzeremo un'interfaccia: "drawable"
     * */
    public static void main(String[] args) {
        Triangle triangle = new Triangle(); //creo gli oggetti
        Square square = new Square();

        Drawing drawing = new Drawing();    //classe composite
        drawing.draw();                     //stampo gli oggetti, non stampa nulla

        drawing.add(triangle);              //aggiungo gli oggetti
        drawing.add(square);
        drawing.draw();                     //DISEGNA I DUE Oggetti

        /** expected output:
            Disegno un triangolo!
            Disegno un quadrato!
        */

        System.out.println("\n\n##############################################\n\n");

        //struttura ad albero
        Drawing drawing1 = new Drawing();
        drawing1.add(triangle);

        drawing.add(drawing1);

        drawing.draw();

        /**
         * expected output:
         * Disegno un triangolo!
         * Disegno un quadrato!
         * Disegno un triangolo!*/


    }
}
