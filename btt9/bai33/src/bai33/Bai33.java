/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai33;

/**
 *
 * @author DELL
 */
abstract class LibraryResource {
    public abstract void borrow();
    public abstract void returnItem();
}
class Book extends LibraryResource {
    @Override
    public void borrow() {
        System.out.println("Book borrowed.");
    }

    @Override
    public void returnItem() {
        System.out.println("Book returned.");
    }
}

class Magazine extends LibraryResource {
    @Override
    public void borrow() {
        System.out.println("Magazine borrowed.");
    }

    @Override
    public void returnItem() {
        System.out.println("Magazine returned.");
    }
}
public class Bai33 {
    public static void main(String[] args) {
        Book book = new Book();
        book.borrow(); 
        book.returnItem(); 

        Magazine magazine = new Magazine();
        magazine.borrow();
        magazine.returnItem();
    }
}
