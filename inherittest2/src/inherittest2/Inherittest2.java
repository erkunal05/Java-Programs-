/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author kunal
 */
class animal
{
    void eat()
    {
        System.out.println("Animal are eating");
    }
}

class dog extends animal
{
    void bark()
    {
        System.out.println("Dog is Barking");
    }
}

class puppy extends dog
{
    void weep()
    {
        System.out.println("Puppy is weeping");
    }
}

public class Inherittest2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        puppy p=new puppy();
        p.eat();
        p.bark();
        p.weep();
        
        
    }
    
}
