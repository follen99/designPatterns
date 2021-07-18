/**
 * @author giuliano ranauro
 * Date: 18/07/2021 13:00
 * Ide: Intellij
 * JDK: 1.8
 * @version 1.0
 */
package com.ranauro;

abstract public class TemplateClass {
    private void step1(){
        System.out.println("Eseguo lo step 1");
    }
    private void step2(){
        System.out.println("Eseguo lo step 2");
    }

    //questo metodo può variare
    //deve essere implementato nella classe che estende la classe template
    protected abstract  void  step3();

    private void step4(){
        System.out.println("Eseguo lo step 4");
    }

    /**
     * Il template della classe stabilisce che ho dei vari step da eseguire
     * in un ordine ben specifico, e se dichiaro i vari step come "pubblici",
     * chi estende la classe può modificarne l'ordine
     *
     * è per questo che imposto i metodi come "privati" e creo un metodo specifico
     * che va ad eseguire gli step nell'ordine corretto
     *
     * bisogna notare che lo step 3 che viene eseguito sarà quello implementato
     * dalla classe chiamante!
     */
    public final void algorithm(){
        step1();
        step2();
        step3();
        step4();
    }
}
