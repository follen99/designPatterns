/**
 * @author giuliano ranauro
 * Date: 18/07/2021 13:05
 * Ide: Intellij
 * JDK: 1.8
 * @version 1.0
 */
package com.ranauro;

/**
 * La classe concreta ESTENDE la classe template
 * siamo obbligati a fornire un'implementazione del metodo STEP3
 *
 * se ho la necessità di costruire 3 varianti dello stesso algoritmo, mi basterà creare un solo template
 * e poi specificare solo il metodo che implementa l'algoritmo in classi diverse
 */
public class ConcreteClass extends TemplateClass{
    public ConcreteClass() {}

    @Override
    protected void step3() {
        System.out.println("questo step è stato implementato\nnella classe concreta!");
    }
}
