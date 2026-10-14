/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author kunal
 */
abstract class ATM
{
     abstract void withdraw(int balance);
      void checkbalance()
      {
          System.out.println("Checking Balance...");
      }
}
class unionbank extends ATM
{
    public void withdraw(int balance)
    {
        System.out.println("Amount Withdrawn." + balance);
    } 
}
public class Abstracttest2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    { // TODO code application logic here
      
        unionbank ub=new unionbank();
        ub.checkbalance();
        ub.withdraw(5000);
    }
    
}
