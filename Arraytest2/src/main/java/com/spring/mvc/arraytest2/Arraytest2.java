/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.spring.mvc.arraytest2;
import java.util.Scanner;
/**
 *
 * @author kunal
 */
public class Arraytest2 {

    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        int arr[]= new int[10];
        int sum=0;
       System.out.println("Enter You NO...."); 
       for(int i=0;i<arr.length;i++)
       {
           System.out.println("Enter Your No..");
           arr[i]=sb.nextInt();
       }
       System.out.println("Sum of Your No is");
       for(int i=0;i<arr.length;i++)
       {
           sum=sum+arr[i];
       }
       
        System.out.println(sum);
    }
}
