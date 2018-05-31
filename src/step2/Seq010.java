package step2;
import java.util.Scanner;

/**
 * 기사시험문제 : [수열010] 1+2+3+...+100 까지의 합계 
 * 추가요구사항 : 정수를 입력받아 두 수 사이의 합을 구하는 프로그램을 구현하시오
 * 출력 : 1+2+3+...+10=55
 */
public class Seq010 {
	public static void main(String[] args) {
		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("0.Stop 1.Play");
			switch (scan.nextInt()) {
			case 0:
				System.out.println("See you again.");
				return;
			case 1:
				System.out.println("First Number?");
				int num1 = scan.nextInt();
				System.out.println("Second Number?");
				int num2 = scan.nextInt();

				int start = 0;
				int end = 0;
				String result = "";
				
				if (num1 > num2) {
					start = num2;
					end = num1;
				} else {
					start = num1;
					end = num2;
				}

				int sum = 0;
				for (int i = start; i <= end; i++) {
					sum += i;
					result += (i == end) ? i + "=" : i + "+";
				}
				System.out.println(result + sum);
				break;
			}
		}
	}
}
