import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int age = sc.nextInt();

		if (age % 4 == 0 && age % 100 != 0 || age % 400 == 0) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}

	}
}
