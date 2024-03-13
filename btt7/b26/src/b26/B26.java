/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b26;

class Animal{
    public void run() {
        System.out.println("THÚ CHẠY");
    }
}
class Dog extends Animal{
    @Override  public void run(){
        System.out.println("DOG IS RUNNING");
    }
}

public class B26 {

    public static void main(String[] args) {
        Animal animal = new Dog();
        if(animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.run();
        }
    }
    
}