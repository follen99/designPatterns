/**
 * @author giuliano ranauro
 * Date: 18/07/2021 18:36
 * Ide: Intellij
 * JDK: 1.8
 * @version 1.0
 */
package com.ranauro;

public class TestDriver {
    /**
     * L'iterator potrebbe essere rappresentato da un buttafuori posto all'entrata di un locale.
     * Il suo compito è quello di far entrare nel locale una persona alla volta,
     * nel momento in cui c'è abbastanza spazio per farla entrare.
     *
     * Ci sarà quindi il suo capo che da dentro controlla, e gli urla "un altro!",
     * e solo a quel punto egli farà entrare il prossimo.
     *
     *
     *
     * */
    public static void main(String[] args) {
        NameRepository names = new NameRepository();
        for (Iterator iterator = names.getIterator(); iterator.hasNext();)
            System.out.println(iterator.next());
    }
}
