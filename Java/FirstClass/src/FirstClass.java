/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jamesshaw
 */
public class FirstClass {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Interaction myController = new Interaction();
        myController.sayHelloFriend();
        
        Interaction Adding = new Interaction();
        Adding.addTwoNumbers();
        
        Interaction Multiplying = new Interaction ();
        Multiplying.multipyTwoNumbers();
        
        Interaction Dividing = new Interaction ();
        Dividing.divideTwoNumbers();
    }    
}