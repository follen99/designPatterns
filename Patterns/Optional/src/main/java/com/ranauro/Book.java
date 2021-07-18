/**
 * @author giuliano ranauro
 * Date: 18/07/2021 11:24
 * Ide: Intellij
 * JDK: 1.8
 * @version 1.0
 */
package com.ranauro;

public class Book {
    private int id;
    private String title;

    public Book(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
