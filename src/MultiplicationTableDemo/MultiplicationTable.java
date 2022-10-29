/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiplicationTableDemo;

import java.util.Scanner;

/**
 *
 * @author nayeem
 */
public class MultiplicationTable {
    public static void main(String[]args)
    {
        //variable declaration area
        int Input,i;
        
    //Take input from user    
    Scanner input=new Scanner(System.in);
    System.out.print("Enter Your Number :");
    //Input variable holds the user input
    Input=input.nextInt();
    
    
    for(i=1;i<=10;i++)
    {
    
    System.out.println(Input+" x "+i+" = "+Input*i);
    
    }
    
    
    
    
    
    
    
    
    
    
    }
    
}
