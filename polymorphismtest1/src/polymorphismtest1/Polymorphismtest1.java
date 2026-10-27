/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polymorphismtest1;

/**
 *
 * @author kunal
 */

class calc
{
    int add(int a , int b)
    {
        return a+b;
    }
    
    int add(int a, int b, int c)
    {
        return a+b+c;
    }
    double add(double a , double b)
    { 
        return a+b;
    }
    
}
public class Polymorphismtest1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        calc obj = new calc();
        System.out.println(" Addition of 2 No.." + obj.add(10,20));
        System.out.println(" Addition of 3  No.." +  obj.add(10,20,30));
        System.out.println("Addition of 2  Double No..."+ obj.add(11.5,15.5));
    }
    
}
