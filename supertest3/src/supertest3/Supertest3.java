/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package supertest3;

/**
 *
 * @author kunal
 */
class Animal
{
    Animal()
    {
        System.out.println("Animals Constructor");
    }
}
class Dog extends Animal
{
    Dog()
    {
        super();
        System.out.println("Dogs Constructor");
    }
}
        
public class Supertest3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dog obj = new Dog();  
    }
    
}
