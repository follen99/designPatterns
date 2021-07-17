/**
 * @author giuliano ranauro
 * Date: 17/07/2021 15:53
 * Ide: Intellij
 * JDK: 1.8
 * @version 1.0
 */
package com.ranauro;

public class TestDriver {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        Singleton s1 = Singleton.getInstance();

        if (s == s1)
            System.out.println("same instance!");
    }
}
