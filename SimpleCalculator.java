import java.util.Scanner;

public class SimpleCalculator{
	
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to The Calculator !");
		double num1, num2,result;
			while(true) {

            System.out.println("\nSelect an option:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");
			
	
            System.out.print("Enter your option (1-5): ");
            int option = sc.nextInt();
			
	
            
		switch (option) {
			case 1:
				num1 = getInput(sc, "Enter First Number: ");
                num2 = getInput(sc, "Enter Second Number: ");
				result = num1 + num2;
				System.out.println("Result " +result);
				break;
				
			case 2:
				num1 = getInput(sc, "Enter First Number: ");
                num2 = getInput(sc, "Enter Second Number: ");
				result = num1 - num2;
				System.out.println("Result " +result);
				break;
				
			case 3:
				num1 = getInput(sc, "Enter First Number: ");
                num2 = getInput(sc, "Enter Second Number: ");
				result = num1 * num2;
				System.out.println("Result " +result);
				break;
				
			case 4:
				num1 = getInput(sc, "Enter First Number: ");
                num2 = getInput(sc, "Enter Second Number: ");
				if(num2 == 0)
				{
					System.out.println("Error: Cannot be divided by zero !");
				} else{
					result = num1 / num2;
					System.out.println("Result " +result);
				}
				break;
				
			case 5:
				System.out.println("Exiting the calculator. Goodbye!");
				//Scanner.close();
                    return;
					
			default:
                    System.out.println("Invalid option! Please select a valid option (1-5).");
			}	
			
		}
			
	}
	
 
    private static double getInput(Scanner sc, String prompt) {
        double num;
        while (true) {
            System.out.print(prompt);
            if (sc.hasNextDouble()) {
                num = sc.nextDouble();
                return num;
            } else {
                System.out.println("Invalid input! Please enter a valid number.");
                sc.next(); 
            }
        }
    }
}