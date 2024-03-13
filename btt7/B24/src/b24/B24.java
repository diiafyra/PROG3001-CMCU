/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b24;

class Animal{
    public void makeSound() {
        System.out.println("THÚ KÊU");
    }
}
class Dog extends Animal{
    @Override  public void makeSound(){
        System.out.println("GO GO");
    }
}

public class B24 {

    public static void main(String[] args) {
        Animal dog = new Animal();
        if(dog instanceof Dog){
            dog.makeSound();
        }
    }
    
}