/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author kunal
 */
abstract class animal
{
    abstract void sound();
}

class dog extends animal
{
   public void sound()
    {
        System.out.println("DOG IS BARKING");
    }
}

class lion extends animal
{
    public void sound()
    {
        System.out.println("Lion is roaring");
    }
}
public class MainJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        dog d = new dog();
        lion l=new lion();
        d.sound();
        l.sound();
    }
    
}
