/**
 * @author giuliano ranauro
 * Date: 18/07/2021 11:52
 * Ide: Intellij
 * JDK: 1.8
 * @version 1.0
 */
package com.ranauro;

import java.util.ArrayList;
import java.util.List;

//la nostra classe composite
public class Drawing implements Drawable {
    private List<Drawable> drawables = new ArrayList<>(); //lista di oggetti disegnabili

    /**
     * @param drawable the drawable object {triangle, square, ecc}
     */
    public void add(Drawable drawable){
        this.drawables.add(drawable);
    }

    /**
     * metodo utilizzato per disegnare tutti gli oggetti della lista
     * ogni oggetto viene "disegnato" a seconda del suo tipo,
     * infatti il metodo draw è diverso per ogni tipo di oggetto disegnato
     */
    @Override
    public void draw() {
        for (Drawable drawable : drawables)
            drawable.draw();
    }
}
