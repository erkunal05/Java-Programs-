/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author kunal
 */

class Name
{
    String name = "Kunal";
}
class Surname extends Name
{
    String surname="Prajapati";
    void display()
    {
        System.out.println(super.name); // Using super keyword 
        System.out.println(surname);
    }
}

public class Supertest1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Surname ob= new Surname();
    ob.display();
    }
    
}
