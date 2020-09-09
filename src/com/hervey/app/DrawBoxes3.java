package com.hervey.app;

public class DrawBoxes3 {

	public static void drawbox() {
		System.out.println("+-------+");
		System.out.println("|       |");
		System.out.println("|       |");
		System.out.println("+-------+");
	}

	public static void main(String[] args) {
		DrawBoxes3.drawbox(); // Note that Class designation DrawBoxes3 is optional because we are in that class
		System.out.println();
		DrawBoxes3.drawbox();
		System.out.println();
		drawbox();

		// More fun below
		// let's draw three boxes:
		DrawBoxesWithParameters.drawSpecifiedNumberOfBoxes(3); // I created this method before it existed, then let
																// Eclipse create the method header automatically

		// Let's draw 2 boxes with width 8, and height of 4
		// Note: height and width must be at least two, testing for this would make the
		// methods more complicated
		DrawBoxesWithParameters.drawNumberWidthHeight(2, 8, 4);
		DrawBoxesWithParameters.drawNumberWidthHeight(2, 32, 12);

	}

}
