/**
 * @author giuliano ranauro
 * Date: 18/07/2021 12:03
 * Ide: Intellij
 * JDK: 1.8
 * @version 1.0
 */
package com.ranauro;

public class TestDriver {
    /**
     * il pattern builder è molto importante, perchè ci permette di andare a
     * configurare degli oggetti aventi un construttore complesso, con un elevato numero di variabili di istanza,
     * in un modo che sia il piu possibile leggibile e chiaro.*/
    public static void main(String[] args) {
        //Shop shop = new Shop(2345, "peppe biondo", "via roma 1, brescia", false);

        Shop shop = new Shop.Builder(2345)
                .setOwner("peppe biondo")
                .setAddress("via benevello")
                .setInMall(false)
                .build();                           //costruisco finalmente l'oggetto tramite il metodo build()

        // a mio avviso il pattern più bello
    }
}
