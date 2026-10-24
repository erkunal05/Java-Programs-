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
    void sound()
    {
        System.out.println("Animal can make sound");
    }
}
class Dog extends Animal
{
    void sound()
    {
        super.sound();   //Parent class method call karna 
        System.out.println("Dogs are barking");
    }
}

public class Supertest2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Dog obj = new Dog();
        obj.sound();
    }
    
}
