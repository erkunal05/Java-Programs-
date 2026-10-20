/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inherittest4;

/**
 *
 * @author kunal
 */


//This is Example of Multiple Inheritance 

interface A
{
    void show();
}

interface B
{
    void display();
}

class C implements A,B
{
    @Override
   public void show()
    {
        System.out.println("THIS IS FROM A");
    }
    
    @Override
    public void display()
    {
       System.out.println("THIS IS FROM B"); 
    }
}

public class Inherittest4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        C obj= new C();
        obj.show();
        obj.display();
    }
    
}
