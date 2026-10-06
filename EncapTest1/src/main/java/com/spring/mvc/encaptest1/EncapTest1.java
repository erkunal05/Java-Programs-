/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.spring.mvc.encaptest1;

/**
 *
 * @author kunal
 */
public class EncapTest1 {
    private int age;
    
    public void setAge(int x)
    {
        age=x;
    }
    public int getAge()
    {
        return age;
    }
    

    public static void main(String[] args) {
        System.out.println("Hello World!");
        EncapTest1 ET = new EncapTest1();
        ET.setAge(23);
          System.out.println("Kunal's Age .." + ET.getAge());
    }
}
