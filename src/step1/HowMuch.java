package step1;

import java.util.Scanner;
/**
얼마에요 ? 100 원입니다.
몇개 드릴까요 ? 5개 주세요.
총 금액은 500원 입니다.
비싸요 깎아주세요.
몇 퍼센트 DC할까요 ?
안 팔아요(10% 이상)
475원 입니다.(10% 미만)
**/
public class HowMuch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("0.Stop 1.Play");
			switch(scan.nextInt()) {
			case 0 :
					System.out.println("OFF");
					break;
			case 1 :
					System.out.println("얼마에요?");
					int price = scan.nextInt();
					System.out.println(price + "원입니다.");
					System.out.println("몇 개 드릴까요?");
					int many = scan.nextInt();
					System.out.println(many + "개주세요.");
					price = price * many;
					System.out.println("총 금액은 "+ price +"원입니다.");
					System.out.println("비싸요. 깎아주세요.");
					System.out.println("몇 퍼센트 DC할까요?");
					int dc = scan.nextInt();

					String sell = "안 팔아요.";
					if(dc < 10){
						price = price - (price * dc / 100);
						sell = price +"원입니다.";			
					}
					System.out.println(sell);
					break;
			}
		}
	}
}
