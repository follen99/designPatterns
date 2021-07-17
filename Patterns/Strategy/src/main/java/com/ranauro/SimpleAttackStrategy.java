/**
 * @author giuliano ranauro
 * Date: 17/07/2021 15:42
 * Ide: Intellij
 * JDK: 1.8
 * @version 1.0
 */
package com.ranauro;

/**
 * a simple attack strategy
 */
public class SimpleAttackStrategy implements AttackStrategy{

    /**
     * the attack strategy
     */
    @Override
    public void attack() {
        System.out.println("ATTACK!");
    }
}
