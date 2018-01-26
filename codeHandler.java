import java.util.ArrayList;
import java.util.Scanner;

public class codeHandler {
	public static ArrayList<cup> inventory = new ArrayList<cup>();

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		boolean running = true;
		while (running) {
			System.out.println("Welcome to Cups'R'Us\nMenu Options:\n1: Buy\n2: Sell\n3: Maintenance\n4: Inventory Report\n5: Logout");
			int input = scan.nextInt();
			if (input == 1) {
				System.out.println("What kind of cup would you like to buy?\n1: Mug\n2: Glass\n3: Tumbler");
				input = scan.nextInt();
				if (input == 1) {
					System.out.println("What would you like to name your cup?\nInput a name.\n");
					String name = scan.nextLine();
					System.out.println("What color would you like your cup to be?\nInput a color.");
					String color = scan.nextLine();
					System.out.println("What the cup's serial number?\nInput a number.");
					int serialNumber = scan.nextInt();
					System.out.println("Does your cup have a handle?\ntrue or false?");
					boolean handle = scan.nextBoolean();
					System.out.println("What is the maximum fluid?\nInput an amount.");
					double maxFluid = scan.nextDouble();
					System.out.println("What is the current fluid?\nInput an amount.");
					double currentFluid = scan.nextDouble();
					buyMug(name, color, serialNumber, handle, maxFluid, currentFluid);
					getInfo();
				} else if (input == 2) {
					System.out.println("");
				} else if (input == 3) {
					System.out.println("");
				}
			} else if (input == 2) {
				System.out.println("Which cup would you like to sell?");
			} else if (input == 3) {
				System.out.println("Which cup would you like to interact with?");
			} else if (input == 4) {
				System.out.println("Inventory report:");
			} else if (input == 5)
				running = false;
			else
				System.out.println("Please input a valid number");
		}
	}

	public static void buyGlass(String cupName, String cupColor, int cupSerialNumber, boolean cupHandle, double cupMaxFluid,double cupCurrentFluid) {
		inventory.add(new glass(cupName, cupColor, cupSerialNumber, cupHandle, cupMaxFluid, cupCurrentFluid));
	}
	public static void buyMug(String cupName, String cupColor, int cupSerialNumber, boolean cupHandle, double cupMaxFluid,double cupCurrentFluid) {
		inventory.add(new mug(cupName, cupColor, cupSerialNumber, cupHandle, cupMaxFluid, cupCurrentFluid));
	}
	public static void buyTumbler(String cupName, String cupColor, int cupSerialNumber , double cupMaxFluid,double cupCurrentFluid) {
		inventory.add(new tumbler(cupName, cupColor, cupSerialNumber, cupMaxFluid, cupCurrentFluid));
	}
	public void sellCup() {

	}

	public void maintenance() {

	}

	public void displayInventory() {

	}
	public static void getInfo() {
		System.out.println(inventory.get(0));
	}

}