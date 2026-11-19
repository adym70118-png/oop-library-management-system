/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author EL-Mostwred
 */
package LibrarySystem;

public class Book extends Item {
    private String author;

    public Book(String title, int id, String author) {
        super(title, id);
        this.author = author;
    }

    @Override
    public void displayInfo() {
        System.out.println("[Book] ID: " + id + ", Title: " + title + ", Author: " + author);
    }
}
