/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constest2;

/**
 *
 * @author kunal
 */
public class ConsTest2 {
 
    ConsTest2()
    {
        System.out.println("CONSTRUCTOR NO >> 1");
    }
    ConsTest2(int a)
    {
        int b=20;
        int add;
        add = a+b;
        System.out.println("Sum of Two Numbers .." + add);
    }
    ConsTest2(int a , int b)
    {
        int mul=a*b;
        System.out.println("Multiplication of Two Numbers..." + mul);
    }
    ConsTest2(double a, double b)
    {
        double c;
        c=a+b;
        System.out.println("Addition of two Double Numbers..." + c);
    }
    
    public static void main(String[] args) {
        ConsTest2 obj = new ConsTest2();
        ConsTest2 obj2 = new ConsTest2(10);
        ConsTest2 obj3 = new ConsTest2(10,20);
        ConsTest2 obj4 = new ConsTest2(10.5,20.5);
    }
    
}
