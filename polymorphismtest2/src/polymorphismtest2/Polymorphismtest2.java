/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polymorphismtest2;

/**
 *
 * @author kunal
 */

class Animal
{
    void sound()
    {
        System.out.println("Animal Can Make Sound..");
    }
}
class Dog extends Animal
{
 @Override
 void sound()
 {
     System.out.println("Dog is Barking");
 }
}
class Cat extends Animal
{
    @Override
    void sound()
    {
        System.out.println("Cat is Meowing");
    }
}
public class Polymorphismtest2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Animal a = new Animal();
    a.sound();
    Dog d = new Dog();
    d.sound();
    Cat c = new Cat();
    c.sound();
    
    }
    
}
