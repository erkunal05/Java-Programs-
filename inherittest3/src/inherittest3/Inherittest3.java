/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author kunal
 */

class Animal
{
    void eat()
    {
        System.out.println("Animal is Eating");
    }
}
class Dog extends Animal
{
    void bark()
    {
        System.out.println("Dog is barking");
    }
}
class Cat extends Animal
{
    void meow()
    {
        System.out.println("Cat is meowing");
    }
}
public class Inherittest3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Dog d= new Dog();
        d.eat();
        d.bark();
        Cat c = new Cat();
        c.eat();
        c.meow();
        
        
        
    }
    
}
