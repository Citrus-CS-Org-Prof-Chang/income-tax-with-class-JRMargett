package edu.pasadena.cs.cs03b;

import java.util.Scanner;
import edu.pasadena.cs.cs03b.TaxTableTools;

public class Dummy {

	private static final int[] incomeBounds = {0, 11601, 47151, 100526, 191951, 243726, 609351};

	private static final double[] taxRateBounds = {0.1, 0.12, 0.22, 0.24, 0.32, 0.35, 0.37};


	public static void main(String[] args) {

		TaxTableTools taxtools = new TaxTableTools();
		taxtools.setTaxTable(incomeBounds, taxRateBounds);
		
		Scanner input = new Scanner(System.in);

		int userIncome = 0;
		int userTaxedIncome = 0;
		double userTaxRate = 0.0;


		while(true){
			System.out.println("Enter annual income (-1 to exit)");

			userIncome = input.nextInt();

			if(userIncome == -1){
				break;
			}

			userTaxRate = taxtools.getTaxRate(userIncome);
			userTaxedIncome = (int)(userIncome * userTaxRate);

			System.out.println("Annual Income : " + userIncome + " Tax rate: " + userTaxRate + " Tax to pay: " + userTaxedIncome);

		
		}
		input.close();
	}

	public static int dummy() {
		
		
		// TOOD: add your logic here

		return 1;
	}

}
