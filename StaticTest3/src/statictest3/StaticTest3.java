/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author kunal
 */
public class StaticTest3 {
 static int num;
 
 static
 {
     num= 100;
     System.out.println("Static Block Executed");
 }

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(StaticTest3.num);
    }
  
}
