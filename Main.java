/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author EL-Mostwred
 */
package LibrarySystem;

import java.util.ArrayList; // استيراد القائمة
import java.io.*;          // استيراد أد وات الملفات

class Main {
    public static void main(String[] args) {
        // 1. إنشاء القائمة لتخزين الكتب والعناصر
        ArrayList<Item> library = new ArrayList<>();

        try {
            // 2. إضافة بيانات (تعدد الأشكال Polymorphism)
            library.add(new Book("Java Programming", 101, "Dr. Ahmed"));
            library.add(new Item("General Magazine", 102));

            System.out.println("--- قائمه الكتب ---");
System.out.println(Item.LIBRARY_NAME);
            
for (int i = 0; i < library.size(); i++) {
    
    // جلب العنصر من القائمة باستخدام الـ index
    Item currentItem = library.get(i); 

    // التأكد من نوع الكائن باستخدام instanceof
    if (currentItem instanceof Book) {
        // لو كان كتاب، استدعي ميثود العرض الخاصة بالـ Book (Polymorphism)
        currentItem.displayInfo(); 
    } else {
        // لو كان Item عادي، استدعي ميثود العرض اللي بتاخد String (Method Overloading)
        currentItem.displayInfo("Generic Item");
    }
}

            // 4. حفظ الأسماء
            saveToFile(library);

        } catch (Exception e) {
          System.out.println("Something went wrong: " );
        } finally {
            System.out.println("Execution finished. Total items: " +Item.itemCount);
        }
    }

    // ميثود لحفظ البيانات في ملف خارجي
   public static void saveToFile(ArrayList<Item> items) throws IOException {
    // 1. بنعرف "القلم" اللي هيكتب وبنفتح الملف
    PrintWriter w= new PrintWriter(new FileWriter("library.txt"));
    
  
    for (int i = 0; i < items.size(); i++) {
        // بنجيب العنصر اللي عليه الدور ونخزنه في متغير مؤقت
        Item current = items.get(i);
        // بنكتب العنوان بتاعه في الملف
        w.println(current.title);
    }
    
    // 3. لازم نقفل الملف عشان البيانات تتحفظ
    w.close();
    
    System.out.println("Data saved to library.txt");
}
}
