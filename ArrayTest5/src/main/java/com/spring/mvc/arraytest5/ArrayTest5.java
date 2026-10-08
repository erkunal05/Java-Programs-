/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.spring.mvc.arraytest5;
import java.util.Scanner;


/**
 *
 * @author kunal
 */
public class ArrayTest5 {

    public static void main(String[] args) {
         
        Scanner sb = new Scanner(System.in);
        int arr[][]= new int[3][3];
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-1;j++)
            {
                 System.out.println("ENTER THE NO...");
                 arr[i][j]=sb.nextInt();
            }
        }
         for(int i=0;i<arr.length-1;i++)
        {   
            for(int j=0;j<arr.length-1;j++)
            {
                System.out.print(arr[i][j]+ " ");   
            }
            System.out.println();
        }  
    }
    }
    
    
    
