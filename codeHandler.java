import java.util.ArrayList;
import java.util.Scanner;

public class codeHandler {
	public static ArrayList<cup> inventory = new ArrayList<cup>();

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		boolean running = true;
		while (running) {
			System.out.println(
					"Welcome to Cups'R'Us\nMenu Options:\n1: Buy\n2: Sell\n3: Maintenance\n4: Inventory Report\n5: Logout");
			int input = scan.nextInt();
			scan.nextLine();
			if (input == 1) {
				System.out.println("What kind of cup would you like to buy?\n1: Mug\n2: Glass\n3: Tumbler");
				input = scan.nextInt();
				if (input == 1) {
					System.out.println("What would you like to name your mug?\nInput a name.\n");
					String name = scan.next();
					System.out.println("What color would you like your mug to be?\nInput a color.");
					String color = scan.next();
					System.out.println("What the mug's serial number?\nInput a number.");
					int serialNumber = scan.nextInt();
					System.out.println("Does your mug have a handle?\ntrue or false?");
					boolean handle = scan.nextBoolean();
					System.out.println("What is the maximum fluid?\nInput an amount.\n");
					double maxFluid = scan.nextDouble();
					double currentFluid = 0;
					buyMug(name, color, serialNumber, handle, maxFluid, currentFluid);
				} else if (input == 2) {
					System.out.println("What would you like to name your glass?\nInput a name.\n");
					String name = scan.next();
					System.out.println("What color would you like your glass to be?\nInput a color.");
					String color = scan.next();
					System.out.println("What the glass' serial number?\nInput a number.");
					int serialNumber = scan.nextInt();
					System.out.println("Does your glass have a handle?\ntrue or false?");
					boolean handle = scan.nextBoolean();
					System.out.println("What is the maximum fluid?\nInput an amount.\n");
					double maxFluid = scan.nextDouble();
					double currentFluid = 0;
					buyGlass(name, color, serialNumber, handle, maxFluid, currentFluid);
				} else if (input == 3) {
					System.out.println("What would you like to name your tumbler?\nInput a name.\n");
					String name = scan.next();
					System.out.println("What color would you like your tumbler to be?\nInput a color.");
					String color = scan.next();
					System.out.println("What the tumbler's serial number?\nInput a number.");
					int serialNumber = scan.nextInt();
					System.out.println("What is the maximum fluid?\nInput an amount.\n");
					double maxFluid = scan.nextDouble();
					double currentFluid = 0;
					buyTumbler(name, color, serialNumber, maxFluid, currentFluid);
				}
			} else if (input == 2) {
				System.out.println("Which cup would you like to sell?");
				getInfo();
				String input2 = scan.nextLine();

				sellCup(input2);
				System.out.println("Cup Sold.");
			} else if (input == 3) {
				getInfo();
				System.out.println("\nWhich cup would you like to interact with?");
				String input3 = scan.nextLine();
				System.out.println("Would you like to: \n1: Empty\n2: Drop\n3: Break");
				int input4 = scan.nextInt();
				if (input4 == 1) {
					System.out.println("How much would you like to empty?");
					double amount = scan.nextDouble();
					for (int i = 0; i < inventory.size(); i++) {
						if (inventory.get(i).getName().equals(input3))
							inventory.get(i).emptyCup(amount);
					}
					System.out.println(input3 + " has been emptied by " + amount + "\n");
				} else if (input4 == 2) {
					for (int i = 0; i < inventory.size(); i++) {
						if (inventory.get(i).getName().equals(input3)) {
							inventory.get(i).dropCup();
							System.out.println(
									input3 + " has been dropped. \nIs broken: " + inventory.get(i).getBroken() + "\n");
						}
					}
				} else if (input4 == 3) {
					for (int i = 0; i < inventory.size(); i++) {
						if (inventory.get(i).getName().equals(input3) && input != 3) {
							inventory.get(i).breakCup();
							System.out.println(input3 + " has been broken.\n");
						} else if (input == 3) {
							System.out.println("Tumbler's cannot be broken.\n");
						} else {
							System.out.println("Please input a valid number");
						}
					}
				}
			}else if (input == 4) {
					getInfo();
				} else if (input == 5)
					running = false;
				else
					System.out.println("Please input a valid number");
			}
		scan.close();
	}


	public static void buyGlass(String cupName, String cupColor, int cupSerialNumber, boolean cupHandle,
			double cupMaxFluid, double cupCurrentFluid) {
		inventory.add(new glass(cupName, cupColor, cupSerialNumber, cupHandle, cupMaxFluid, cupCurrentFluid));
	}

	public static void buyMug(String cupName, String cupColor, int cupSerialNumber, boolean cupHandle,
			double cupMaxFluid, double cupCurrentFluid) {
		inventory.add(new mug(cupName, cupColor, cupSerialNumber, cupHandle, cupMaxFluid, cupCurrentFluid));
	}

	public static void buyTumbler(String cupName, String cupColor, int cupSerialNumber, double cupMaxFluid,
			double cupCurrentFluid) {
		inventory.add(new tumbler(cupName, cupColor, cupSerialNumber, cupMaxFluid, cupCurrentFluid));
	}

	public static void sellCup(String input2) {
		for (int i = 0; i < inventory.size(); i++) {
			if (inventory.get(i).getName().equals(input2))
				inventory.remove(i);
		}
	}

	public void maintenance() {

	}

	public static void getInfo() {
		System.out.println("Name\t\tColor\t\tSerial\t\tMax Fluid\tCurrent Fluid\t\tBroken");
		for (int i = 0; i < inventory.size(); i++) {
			System.out.println(inventory.get(i).getName() + "\t\t" + inventory.get(i).getColor() + "\t\t"
					+ inventory.get(i).getSerialNumber() + "\t\t" + inventory.get(i).getMaxFluid() + "\t\t"
					+ inventory.get(i).getCurrentFluid() + "\t\t\t" + inventory.get(i).getBroken());
		}
		System.out.println();
	}
}
