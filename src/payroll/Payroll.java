/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

import java.util.Scanner;

/**
 *
 * @author Nande Mzantsi
 */
public class Payroll
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
       double rate;
       double hoursWorked;
       double regularPay;
       double overtimePay;
               final int FULL_WEEK = 40; // these are the hours in the week *5 
               final double OT_RATE = 1.5;
               
               Scanner keyboard = new Scanner(System.in);
               System.out.print("How many hours did you work this week?");
               
               hoursWorked = keyboard.nextDouble();
               System.out.println("What is your pay rate?");
               
               rate = keyboard.nextDouble(); //keyboard is a variable, to store a value
               if(hoursWorked > FULL_WEEK)
               {
                   regularPay = FULL_WEEK * rate;
                   overtimePay = (hoursWorked - FULL_WEEK) * OT_RATE * rate;
               }
               else
               {
                 regularPay = hoursWorked * rate;
                 overtimePay = 0.0;
               }
               System.out.println("Regular pay is " + regularPay + "\nOvertime pay is " + overtimePay);
    }
} // if the amount of hours worked is less than 40 then we did not work overtime, if it is more than 40 then we worked overtime 
    

