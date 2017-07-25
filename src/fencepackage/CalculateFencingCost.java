package fencepackage;

import java.util.Scanner;

public class CalculateFencingCost {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int length; // length of yard
		int width; // width of yard
		int perimeter; // perimeter of yard, gates are considered to have zero length
		int numGates;
		String fenceType = null; // wooden or chain link only
		int costPerFoot; // depends on fenceType
		int buildingPermitCost = 50; // always $50
		double taxRate = 0.06; // always 6%
		double taxAmount; // total tax, buildingPermitCost is not taxed
		double finalCost; //the grand total
		double subTotal; // cost of fencing before taxes, does not include buildingPermitCost
		
		System.out.println("Please enter yard width: ");
		width = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Please enter yard length: ");
		length = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("What type of fencing? (W for wooden, C for chain link)");
		fenceType = scanner.nextLine();
		
		do {
			System.out.println("How many gates?");
			numGates = scanner.nextInt();
			scanner.nextLine();
			if(numGates < 1 || numGates > 3) {
				System.out.println("You must have between 1 and 3 gates");
			}
		} while(numGates < 1 || numGates > 3);
		
		
		
		
		perimeter = 2 * width + 2 * length; // always a rectangle
		
	}

}
