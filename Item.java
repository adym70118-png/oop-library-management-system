/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author EL-Mostwred
 */

      package LibrarySystem;
public class Item {
    protected String title; 
    protected int id;
    public static int itemCount = 0; 
        public static final String LIBRARY_NAME = "Central Library";

    public Item() {
        this.title = "gcggfg";
        itemCount++;
    }

    public Item(String title, int id) {
        this.title = title; 
        this.id = id;
        itemCount++;
 
    }
//Method Overloading
    public void displayInfo() {
        System.out.println("ID: " + id + ", Title: " + title);
    }
//@Override
    public void displayInfo(String x) {
        System.out.println(x + "  ID: " + id + ", Title: " + title);
    }
}

