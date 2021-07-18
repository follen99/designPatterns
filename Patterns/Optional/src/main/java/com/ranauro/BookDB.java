/**
 * @author giuliano ranauro
 * Date: 18/07/2021 11:24
 * Ide: Intellij
 * JDK: 1.8
 * @version 1.0
 */
package com.ranauro;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookDB {
    private List<Book> books;

    public BookDB() {
        this.books = new ArrayList<>();
    }

    /**
     * il metodo optional entra in gioco quando posso ritornare o meno un valore*/
    public Optional<Book> getBookById(int id){
        for (Book book : books)
            if (book.getId() == id){
                return Optional.of(book);
            }
        return Optional.empty();
    }

    public void add(Book book) {
        books.add(book);
    }
}
