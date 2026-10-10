/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.spring.mvc.stringtest4;
import java.util.Scanner;
/**
 *
 * @author kunal
 */
public class StringTest4 {

    public static void main(String[] args) {
        Scanner sb = new Scanner (System.in);
        String name;
        String city;
        String state;
        
        System.out.println("Enter Your Name");
        name=sb.nextLine();
        System.out.println("Enter Your City ");
        city =  sb.nextLine();
        System.out.println("Enter Your State");
        state=sb.nextLine();
        
        int len=name.length();  //TO FIND THE STRING LENGTH 
         System.out.println("Length of Name ->" + len);
         
         char c = name.charAt(5);  // This function will find character of specified index 
          System.out.println("Which Charater is on 5 index ->"+ c);
          
          String Upper = city.toUpperCase(); // This will Coner String in Upper Case 
           System.out.println("In Upper Case ->" + Upper);
           
           String lower = name.toLowerCase(); // This will convert string in lower case 
            System.out.println("Name in lower case->" + lower);
            
          
    }
}
