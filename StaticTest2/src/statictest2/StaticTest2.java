/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package statictest2;

/**
 *
 * @author kunal
 */
public class StaticTest2 {
    
 static int add(int a, int b )
 {
     return a+b;
 }
    public static void main(String[] args) {
       int result = StaticTest2.add(20,30);
       
       System.out.println("Addition>>" + result);
    }
}  
