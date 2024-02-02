/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong9;

/**
 *
 * @author phong
 */
class Animal {
    
    // method
    void display() {
        System.out.println("I am an animal");
    }
}

// inherit Dog class from Animal 
class Dog extends Animal {

    // override the display method 
    void display() {
        System.out.println("I am a dog");
    }
}

// inherit Cat class from Animal
class Cat extends Animal {

    // override the display method 
    void display() {
        System.out.println("I am a cat");
    }
}
public class nhieuLop02 {
        public static void main(String[] args) {

        // create objects of Dog and Cat
        Dog dog1 = new Dog();
        Cat cat1 = new Cat();

        // call display() using objects of Dog and Cat
        dog1.display();
        cat1.display();
    }
}
