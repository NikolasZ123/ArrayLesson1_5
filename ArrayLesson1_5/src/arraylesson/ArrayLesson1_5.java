// **********************************************************************
// Programmer:	Nikolas Zbaraszewski
// Class:		CS30S
//
// Exercise:    1
//
// Description:	a brief description of the program goes here
//
//
//	Input:		describe any input from keyboard or file
//
//  Output:		describe the result of your program
// ***********************************************************************

import javax.swing.*;
import java.text.DecimalFormat;

public class ArrayLesson1_5/*CHANGE THIS TO THE NAME OF THE FILE*/
{  // begin class
	public static void main(String args[])
	{  // begin main
	// ***** declaration of constants *****
	
	// ***** declaration of variables *****
        int n = 0;
        int in = 0;
        
        int p = 0;
        int max = 0;
	// ***** create objects *****
	
            
        
	// ***** create input stream *****
	
		//ConsoleReader console = new ConsoleReader(System.in);
		
	// ***** Print Banner *****
	
		System.out.println("**********************************");
		System.out.println("NAME:        Nikolas Zbaraszewski");
		System.out.println("Class:       CS30S");
		System.out.println("Exercise:    1");
		System.out.println("**********************************");
		
	// ***** get input *****
	
                //user sets the size of the array
                n = Integer.parseInt(JOptionPane.showInputDialog(null, "How many numbers do you want in the array"));
        
                //creating the array
                int[] array = new int[n];
        
                //user enters a number for each spot in the array
		for (int i=0;i<n; i++) {
                
                in = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a value for array[" +(i)+"]"));
                array[i] = in;
                
            }
            
	// ***** processing *****
	
		
	// ***** output *****
	
                //printing each value in the array.
            System.out.println("*****Printing array values in order: *****");
                
            for (int i=0; i<n; i++) {
                
                System.out.println(array[i]);
            }
            
                
            //printing each value in the array backwards.
            System.out.println("*****Printing array values in reverse: *****");
            
            for (int i=0; i<n; i++) {
                
                System.out.println(array[(n-1)-i]);
            }

            
            in = Integer.parseInt(JOptionPane.showInputDialog(null, "Which one do you want to be printed?\n-1 to leave"));
            
            
            //print the value at the point the user selects
            while (in !=-1) {
                
                //checking to see if they enter a valid number
                if (in < n)
                    JOptionPane.showMessageDialog(null, "Number at array [" +in +"] = " +array[in]);
                else { 
                    JOptionPane.showMessageDialog(null, "Array[" +in +"] does not exist.");
                }
                in = Integer.parseInt(JOptionPane.showInputDialog(null, "which one you want to be printed sir.\n-1 to leave"));
            }
            
            
            in = Integer.parseInt(JOptionPane.showInputDialog(null, "Which one do you want to edit?\n-1 to leave"));
            
            
            //ask which value they want to edit, then they enter a new value
            while (in !=-1) {
                
                //checking to see if they enter a valid number
                if (in < n)
                    array[in] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter what you want array [" +in +"] to be."));
                else {
                    JOptionPane.showMessageDialog(null, "Array[" +in +"] does not exist.");
                }
                in = Integer.parseInt(JOptionPane.showInputDialog(null, "Which value do you want to edit?\n-1 to leave"));
            }
            
            
            System.out.println("*****Printing largest array value: *****");
            
            //while we have not checked each array
            while (p < n){
            
            //for each array
            for(int i=0; i<n; i++) {
                  
                //if the array is higher than the max value seen so far, it is the new max
                if(array[p]>max){
                max = array[p];
                }
                p++;
            }
            
            }
            
            System.out.println("Highest value = " +max);
                     
               
	// ***** closing message *****
	
		System.out.println("end of processing");
	
	}  // end main	
}  // end class