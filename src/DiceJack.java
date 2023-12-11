import java.util.Scanner;

public class DiceJack {

	public static void main(String[] args) {

		// The user has to choose 3 numbers (and add them together exp. = (4,3,5))
		// The user has to roll the dice 3 times (and roles are exp. = 3,3,5)

		// The user wins if dice roll smaller then 3 chosen numbers
		// Differences between 2 numbers is less then 5

		Scanner scanner = new Scanner(System.in);

		int roll1 = rollDice();
		int roll2 = rollDice();
		int roll3 = rollDice();

		System.out.println("Please enter 3 number between 1 and 6: ");

		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		int number3 = scanner.nextInt();
		
		if(isLessThan1(number1,number2,number3) || (isMoreThan6(number1,number2,number3))) {
			System.out.println("You have enter an invaled number");
			System.exit(0);
		}
		
		
		int sumOfNumbers = number1+ number2+number3;
		int sumRollDice = roll1+roll2+roll3;
		
		System.out.println("Your sum of number is :"+sumOfNumbers+"\nComputer sum of number is :"+sumRollDice);
		
		
		if(userWon(sumOfNumbers,sumRollDice)) {
			System.out.println("Congrats you won!");
		}
		else {
			System.out.println("Better luck next time!");
		}

	}

	public static int rollDice() {
		double randomNumber = Math.random() * 6 + 1;
		return (int) randomNumber;

	}
	
	public static boolean isLessThan1(int number1, int number2, int number3) {
		return (number1 <1 || number2<1 || number3 < 1);
		
		
	}
	public static boolean isMoreThan6(int number1, int number2, int number3) {
		return (number1 >6 || number2>6 || number3 >6);
		
}
	public static boolean userWon(int sumOfNumbers,int sumRollDice) {
		return(sumOfNumbers>sumRollDice && (sumOfNumbers-sumRollDice)<5);
		
	}
}







