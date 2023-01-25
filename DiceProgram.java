import java.util.Scanner;
import java.lang.Math;

class DiceProgram {
	public static int fact(int n){
		if(n == 1){
			return Math.pow(6, n);
		}

		return fact((Math.pow(6, n)) - 15);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of dice : ");
		int n = scanner.nextInt();

		int dice = fact(n);
		System.out.println(dice);
	}
	
}