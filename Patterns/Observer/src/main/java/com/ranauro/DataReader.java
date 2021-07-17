/**
 * @author giuliano ranauro
 * Date: 17/07/2021 16:09
 * Ide: Intellij
 * JDK: 1.8
 * @version 1.0
 */
package com.ranauro;

public class DataReader implements Observer{
    private String readerName;
    public DataReader(String readerName) {
        this.readerName = readerName;
    }

    @Override
    public void update() {
        System.out.println("recived data from sensor.");
    }
}
