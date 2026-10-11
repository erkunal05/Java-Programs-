/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.spring.mvc.stringtest5;
import java.util.Scanner;
/**
 *
 * @author kunal
 */
public class StringTest5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        String name="Kunal";
        String name1="Kunal Prajapati";  
        String para="Once upon a time, a mighty lion was fast asleep in the forest."
                + " A little mouse scuttled by, and in her rush, she accidentally ran right across the lion's nose.";
        
    
        System.out.println(" Is Both No Same->" + name.equals(name1));
      
        System.out.println(para.contains("lion")); // If you have to check this string in string 
        
                System.out.println("Index of particular character "+ name.indexOf('a')); // Particular character ka index batatyega
                
                System.out.println("Last index of string"+ name1.lastIndexOf("a")); // last index find karta hai
                
                System.out.println(para.replace("time","KUNAL"));// Use to replace the string 
                
                
                
                
                
        
       
    }
}
