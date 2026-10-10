/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.spring.mvc.arraytest6;
import java.util.Scanner;

/**
 *
 * @author kunal
 */
public class ArrayTest6 {

    public static void main(String[] args) {
        
        int arr[][][]= new int[2][2][2];
        Scanner sb = new Scanner(System.in);
                
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                for(int k=0;k<2;k++)
                {
                     System.out.println("Enter No...");
                    arr[i][j][k]=sb.nextInt();
                }
            }
        }
        System.out.println("Your 3D Array.....");
        
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                for(int k=0;k<2;k++)
                {
                      System.out.print(arr[i][j][k]+"\t");
                   
                }
                 System.out.println();
            }
             System.out.println();
        }
        sb.close();
    }
}