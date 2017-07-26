package fencepackage;

import java.util.Scanner;

public class CalculateFencingCost {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int length; // length of yard
		int width; // width of yard
		int perimeter; // perimeter of yard, gates are considered to have zero length, assume a perfect rectangle
		int numGates; // total number of gates, must be 1-3
		String fenceType = null; // wooden or chain link only
		int costPerFoot; // depends on fenceType
		int buildingPermitCost = 50; // always $50
		double taxRate = 0.06; // always 6%
		double taxAmount; // total tax, buildingPermitCost is not taxed
		double finalCost; //the grand total
		double subTotal; // cost of fencing before taxes, does not include buildingPermitCost
		
		System.out.println("Please enter yard width: ");
		width = scanner.nextInt();
		scanner.nextLine(); // consume the dangling \n
		
		System.out.println("Please enter yard length: ");
		length = scanner.nextInt();
		scanner.nextLine();
		
		do {
			System.out.println("What type of fencing? (W for wooden, C for chain link)");
			fenceType = scanner.nextLine();
			// check that user entered W, w, C, or c
			// if not, display message and re-prompt
			if(!fenceType.equalsIgnoreCase("w") && !fenceType.equalsIgnoreCase("c"))
				System.out.println("Please enter either W or C");
		} while(!fenceType.equalsIgnoreCase("w") && !fenceType.equalsIgnoreCase("c"));
		
		do {
			System.out.println("How many gates?");
			numGates = scanner.nextInt();
			scanner.nextLine();
			if(numGates < 1 || numGates > 3)
				System.out.println("You must have between 1 and 3 gates");
		} while(numGates < 1 || numGates > 3);
		
		
		// crunch the numbers
		perimeter = 2 * width + 2 * length;
		costPerFoot = fenceType.equalsIgnoreCase("w") ? 25 : 15; // $25 for wooden, $15 for chain link
		subTotal = costPerFoot * perimeter + numGates * 150;
		taxAmount = subTotal * taxRate;
		finalCost = subTotal + taxAmount + buildingPermitCost;
		
		// display a sales estimate
		System.out.println("SALES ESTIMATE");
		System.out.println("Perimeter of yard: " + perimeter);
		System.out.println("Number of gates: " + numGates);
		
		// get the full word for fence type, then display it as part of the sales report
		String fenceTypeForDisplay = fenceType.equalsIgnoreCase("w") ? "Wooden" : "Chain Link";
		System.out.println("Type of fencing: " + fenceTypeForDisplay);
		
		System.out.printf("Sales tax: $%.2f\n", taxAmount);
		System.out.printf("Final cost: $%.2f\n", finalCost);
		
	} // main
	
}
