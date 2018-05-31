
package step2;
import java.util.Scanner;
/**
 * [수열012] 홀수, 짝수의 합
 * */

public class Seq012 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("0.Stop 1.OddSum 2.EvenSum");
			switch (s.nextInt()) {
			case 0:
				return;
			case 1:
				System.out.println("First Value");
				int num1 = s.nextInt();
				System.out.println("Second Value");
				int num2 = s.nextInt();

				int start = 0;
				int end = 0;
				if (num1 > num2) {
					start = num2;
					end = num1;
				} else {
					start = num1;
					end = num2;
				}

				String result = "";
				String op = "";
				int sum = 0;
				int count = 0;
				int tcount = 0;

				for (int i = start; i <= end; i++) {
					if (i % 2 == 1) {
						tcount++;
					}
				}

				for (int i = start; i <= end; i++) {
					if (i % 2 == 1) {
						sum += i;
						count++;
						if (count == tcount) {
							op = i + "=";
						} else {
							op = i + "+";
						}
						result += op;
					}
				}
				System.out.println(result + sum);
				break;
			case 2:
				break;
			default:
				return;
			}
		}
	}
}