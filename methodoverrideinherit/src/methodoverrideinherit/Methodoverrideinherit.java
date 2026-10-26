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
        System.out.println("Animal Makes sound");
    }
}
class Dog extends Animal
{
    @Override
    public void sound()
    {
        System.out.println("Dog is Barking");
    }
}


public class Methodoverrideinherit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Animal a = new Animal();
         a.sound();
         Dog d = new Dog();
         d.sound();
    }
    
}
