/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author kunal
 */
public class StaticTest1 {
        static int a = 10;
  void sum()
  {
      int b=20;
      int sum = a+b;
      System.out.println("Addition of Two No>>>"+ sum);
  }
    public static void main(String[] args) {
        // TODO code application logic here
        StaticTest1 obj= new StaticTest1();
        obj.sum();
    }
    
}
