/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.spring.mvc.stringtest3;
import java.util.Scanner;
/**
 *
 * @author kunal
 */
public class StringTest3 {

    public static void main(String[] args) {
        
        Scanner sb = new Scanner (System.in);
        String name;
        String city;
        String age;
        System.out.println("Enter Your Name :");
        name=sb.nextLine();
         System.out.println("Enter The City You Living :");
        city=sb.nextLine();
          System.out.println("Enter Your Age :");
        age=sb.nextLine();
        System.out.println("My Name is ->"+name);
        System.out.println("I am living in->"+city);
        System.out.println("My Age is->"+age);
    }
}
