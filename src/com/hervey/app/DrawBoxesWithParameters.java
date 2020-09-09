package com.hervey.app;

public class DrawBoxesWithParameters {
	// When lines are too long to display on Eclipse, using Alt-Shift-Y will toggle
	// Word Wrap
	public static void drawSpecifiedNumberOfBoxes(int i) { // i is not a self documenting variable name, but it was automatic, so I left it for demonstration purposes. numBoxes, or numberOfBoxes would be better
		System.out.println("Now we will draw this many boxes: " + i);
		for (int j = 0; j < i; j++) {
			DrawBoxes3.drawbox();

		}
	}

	public static void drawBoxesThisHeightThisWidth(int height, int width) {
		// top and bottom or the same, so they could drawn using another method and
		// called twice in this method
		// draw top
		System.out.print("+");
		for (int i = 0; i < width - 2; i++) {
			System.out.print("-");
		}
		System.out.print("+\n");

		// draw middle

		for (int i = 0; i < height - 2; i++) {
			System.out.print("|");
			for (int j = 0; j < width - 2; j++) {
				System.out.print(" ");
			}
			System.out.print("|\n");
		}

		// draw bottom
		System.out.print("+");
		for (int i = 0; i < width - 2; i++) {
			System.out.print("-");
		}
		System.out.print("+\n");

	}

	public static void drawNumberWidthHeight(int quantity, int width, int height) {
		System.out.println("Now we will draw this many boxes: " + quantity + " ,with this width and height:  " + width
				+ " , " + height);
		for (int j = 0; j < quantity; j++) {
			drawBoxesThisHeightThisWidth(height, width);
			System.out.print("\n");
		}

	}

}
