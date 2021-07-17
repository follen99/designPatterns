/**
 * @author giuliano ranauro
 * Date: 17/07/2021 15:39
 * Ide: Intellij
 * JDK: 1.8
 * @version 1.0
 */
package com.ranauro;

public class TestDriver {
    public static void main(String[] args) {
        Monster monster = new Monster();    //creating a monster
        monster.attack();                   //attack with the default attack

        monster.setAttackStrategy(new PowerAttackStrategy());   //change the attack type wit "power attack"
        monster.attack();                                       //attack with the changed attack
    }
}
