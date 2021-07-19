/**
 * @author giuliano ranauro
 * Date: 18/07/2021 11:21
 * Ide: Intellij
 * JDK: 1.8
 * @version 1.0
 */
package com.ranauro;

public class TestDriver {
    public static void main(String[] args) {
        BookDB books = new BookDB();
        /**
         * se il libro cercato viene trovato, si ritorna un optional "pieno"
         * altrimenti uno vuoto*/
        books.add(new Book(2,"titolo libro"));

        /**
        OLD
        if (books.getBookById(2).isEmpty()){
            System.out.println("no book found");
        }else System.out.println("book found");*/
        
        try{
            System.out.println(books.getById(2).orElseThrow().getTitle();
        }catch(Exception e){
            System.out.println("Book not found");
        }
    }
}
