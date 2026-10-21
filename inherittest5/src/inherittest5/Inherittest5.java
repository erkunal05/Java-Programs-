/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inherittest5;

/**
 *
 * @author kunal
 */
interface Animal
{
     void sound();
}
class dog implements Animal
{
    public void sound()
    {
        System.out.println("Dog is barking");
    }
}
class cat implements Animal
{
    public void sound()
    {
       System.out.println("Cat is meowing");
    }
}
class pet extends dog
{
    void play()
    {
        System.out.println("Pets are playing");
    }
    public void sound()
    {
        System.out.println("Pet can make Sound");
    }
}
public class Inherittest5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        dog d = new dog();
        d.sound();
        cat c = new cat();
        c.sound();
        pet p = new pet();
        p.sound();
        p.play();
    }
    
}
