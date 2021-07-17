/**
 * @author giuliano ranauro
 * Date: 17/07/2021 15:39
 * Ide: Intellij
 * JDK: 1.8
 * @version 1.0
 */
package com.ranauro;

/**
 * THIS monster can attack in various ways
 */
public class Monster {
    private AttackStrategy strategy;

    /**
     * the constructor is used to initalize the attack strategy
     * package-private
     */
    Monster(){
        strategy = new SimpleAttackStrategy();
    }

    /**
     * the attack trigger
     * package-private
     */
    void attack() {
        strategy.attack();
    }

    /**
     * used to change the attack strategy
     * @param newStrategy the new strategy
     */
    void setAttackStrategy(AttackStrategy newStrategy) {
        this.strategy = newStrategy;
    }
}
