/**
 * @author giuliano ranauro
 * Date: 17/07/2021 15:54
 * Ide: Intellij
 * JDK: 1.8
 * @version 1.0
 */
package com.ranauro;

class Singleton {
    private static Singleton instance;

    /**
     * empty constructor
     */
    private Singleton(){}

    /**
     * used to get the one and only instance of the classs
     * if it is called for the first time,
     * it creates a new instance of the class
     * @return the instance
     */
    static Singleton getInstance(){
        if (instance == null)
            instance = new Singleton();
        return instance;
    }
}
