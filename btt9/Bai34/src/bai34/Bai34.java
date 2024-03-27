/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai34;

/**
 *
 * @author DELL
 */
interface GenericBehavior {
    void eat();
    void sound();
}

interface Swim {
    void swim();
}

interface Fly {
    void fly();
}

class Dog implements GenericBehavior {
    public void eat() {
        System.out.println("Dog is eating.");
    }

    public void sound() {
        System.out.println("Dog is barking.");
    }
    public void swim() {
        System.out.println("Dog is swimming");
    }
    public void fly() {
        System.out.println("Dog is flying .");
    }
}

class Fish implements GenericBehavior, Swim {
    public void eat() {
        System.out.println("Fish is eating.");
    }

    public void sound() {
        System.out.println("Fish is crying.");
    }

    public void swim() {
        System.out.println("Fish is swimming.");
    }
    public void fly() {
        System.out.println("Fish does not fly.");
    }
}

class Bird implements GenericBehavior, Fly {
    public void eat() {
        System.out.println("Bird is eating.");
    }

    public void sound() {
        System.out.println("Bird is chirping.");
    }

    public void fly() {
        System.out.println("Bird is flying.");
    }
    public void swim() {
        System.out.println("Bird is swiming.");
    }
}

class Bat implements GenericBehavior, Swim, Fly {
    public void eat() {
        System.out.println("Bat is eating.");
    }

    public void sound() {
        System.out.println("Bat is making funny sounds.");
    }

    public void swim() {
        System.out.println("Bat is swim in their dream.");
    }

    public void fly() {
        System.out.println("Bat is flying.");
    }
}

public class Bai34 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Fish fish = new Fish();
        Bird bird = new Bird();
        Bat bat = new Bat();

        dog.eat();
        dog.sound();
        dog.swim();
        dog.fly();

        fish.eat();
        fish.sound();
        fish.swim();
        fish.fly();

        bird.eat();
        bird.sound();
        bird.fly();
        bird.swim();
        
        bat.eat();
        bat.sound();
        bat.swim();
        bat.fly();
    }
}
