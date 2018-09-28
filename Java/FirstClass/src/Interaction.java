import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jamesshaw
 */
public class Interaction {
    
    public void sayHelloFriend() {
        Scanner sl = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String friendName = sl.nextLine();
        System.out.println("Hello your name is " + friendName);
    }
    
    public void addTwoNumbers() {
        Scanner sl = new Scanner(System.in);
        System.out.print("Please enter the two numbers you would like to add: ");
        int num1 = sl.nextInt();
        int num2 = sl.nextInt();
        int numAnswer = num1 + num2;
        System.out.println("Number one plus number two equals: " + numAnswer);
    }
    
   public void multipyTwoNumbers() {
	   Scanner sl = new Scanner(System.in);
	   System.out.print("Please enter the two numbers you would like to multiply: ");
	   int num1 = sl.nextInt();
	   int num2 = sl.nextInt();
	   int numAnswer = num1 * num2;
	   System.out.println("Number one times number two equals: " + numAnswer);
   }
   
   public void divideTwoNumbers() {
	   Scanner sl = new Scanner(System.in);
	   System.out.print("Please enter the two numbers you would like to divide: ");
	   int num1 = sl.nextInt();
	   int num2 = sl.nextInt();
	   int numAnswer = num1 / num2;
	   System.out.println("Number one divided by number two equals: " + numAnswer);	   
   }
            
}

