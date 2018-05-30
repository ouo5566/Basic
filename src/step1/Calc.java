package step1;

import java.util.Scanner;
/**
두 숫자와 산술연산자를 입력받아 식과 함께 결과를 출력하시오.
단, 산술연산자를 잘못 입력했을 때는 에러메세지를 출력하시오.
**/
public class Calc {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("0.Stop 1.Play");
			switch(scan.nextInt()) {
			case 0 : return;
			case 1 :
					System.out.println("Enter Number 1");
					int num1 = scan.nextInt();
					System.out.println("Enter OPCODE");
					String opcode = scan.next();
					System.out.println("Enter Number 2");
					int num2 = scan.nextInt();

					int num3 = 0;
					String result = "";
					switch(opcode){
						case "+" : num3 = num1 + num2; break;
						case "-" : num3 = num1 - num2; break;
						case "*" : num3 = num1 * num2; break;
						case "/" : num3 = num1 / num2; break;
						case "%" : num3 = num1 % num2; break;
						default : result = "OPCODE ERROR"; break;
					}
					if(!result.equals("OPCODE ERROR")){
						result = num1 + opcode + num2 + "=" + num3;
					}
					System.out.println(result);
					break;
			}
		}
	}
}
