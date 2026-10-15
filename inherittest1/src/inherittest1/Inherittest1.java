/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author kunal
 */
class parent
{
    public void eat()
    {
        System.out.println("Parent are eating");
    }
}

class child extends parent
{
    public void play()
    {
        System.out.println("Child is Playing");
    }
}
public class Inherittest1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        child c= new child();
        c.eat();
        c.play();
    }
    
}
