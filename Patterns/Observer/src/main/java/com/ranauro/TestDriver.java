/**
 * @author giuliano ranauro
 * Date: 17/07/2021 16:02
 * Ide: Intellij
 * JDK: 1.8
 * @version 1.0
 */
package com.ranauro;

public class TestDriver {
    public static void main(String[] args) {
        Sensor s = new Sensor();
        DataReader dr = new DataReader("reader 1");

        s.register(dr);

        s.readData();
    }
}
