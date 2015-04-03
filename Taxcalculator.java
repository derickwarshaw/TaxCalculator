/**
 * @(#)Taxcalculator.java
 *
 *
 * @Derick Warshaw // Lab 2 // COSC1337
 * @version 1.00 2014/2/6
 */


import java.util.Scanner; 		// so user can input data from the keyboard
import javax.swing.JOptionPane; // to display using message dialogue box
import java.text.DecimalFormat; // to format message dialogue box



public class Taxcalculator
{

    public static void main(String[] args)
    {
		double totalAcres; 		// to hold total acres
		double taxRate; 		// to hold tax rate
		double appraisedValue; 	// to hold appraised value
		double averageTPA; 		// to hold average tax per acre
		double totalTax;		// to hold total tax



		// scanner object to read input
		Scanner keyboard = new Scanner(System.in);


		// get total acres and put into totalAcres variable
    	System.out.print("Please enter the number of acres: ");
    	totalAcres = keyboard.nextDouble();


    	// input validation for value less than 1 for acre
    	if (totalAcres < 1)
    		{
    		System.out.println("Error: This response must be a positive" +
    		                   "number");
			System.exit(0);
    		}


    	// get the tax rate
    	System.out.print("Please enter the tax rate: ");
    	taxRate = keyboard.nextDouble();


    	// input validation for value of tax rate less than 0
    	if (taxRate < 0)
    		{
    		System.out.println("Error: This response must be no less than 0");
    		System.exit(0);
    		}


    	// get the appraised value
    	System.out.print("Please enter the appraised value: ");
    	appraisedValue = keyboard.nextDouble();


    	// input validation for value less than 0 for appraised value
    	if (appraisedValue < 0)
    		{
    		System.out.println("Error: This response must be no less than 0");
			System.exit(0);
    		}

    	// display input for verification in console
    	System.out.printf("Total Acres: " + "%,.2f\n", (totalAcres));
    	System.out.printf("Tax Rate: " + "%,.2f", (taxRate));
    	System.out.println("%");
    	System.out.printf("Appraised Value: $" + "%,.2f\n", (appraisedValue));


    	// calculate total tax
    	totalTax = (taxRate / 100) * appraisedValue;
		System.out.printf("Total Tax: $" + "%,.2f\n", (totalTax));


    	// calculate average tax per acre
    	averageTPA = totalTax / totalAcres;
		System.out.printf("Average Tax per Acre: $" + "%,.2f\n", (averageTPA));


		// create a DecimalFormat object
		DecimalFormat formatter = new DecimalFormat("#,##0.00");

		// display results in single message dialogue box
		JOptionPane.showMessageDialog(null, "Total acres: " +
		 	formatter.format(totalAcres) + "\nTax rate: " +
			formatter.format(taxRate) + "%" + "\nAppraised value: $" +
			formatter.format(appraisedValue) + "\nTotal tax calculation: $" +
			formatter.format(totalTax) + "\nAverage tax per acre: $" +
			formatter.format(averageTPA));


		// exit program
		System.exit(0);


    }


}