/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bài17;

class Animal{
    public void makeSound() {
        System.out.println("Animal make a sound");
    }
}
class Cat extends Animal{
    @Override  public void makeSound(){
        System.out.println("Cat meows");
    }
}

public class Bài17 {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeSound();
    }
    
}
