package step3;

import java.util.Scanner;

public class Starbucks {

	public static String getBill(String[] totalMenu) {
		String bill = "";
		int price = 0;
		for (int i = 0; i < totalMenu.length; i++) {
			int j = i + 1;
			if (i % 2 == 0) {
				switch (totalMenu[i]) {
				case "1":
					price = price + Integer.parseInt(totalMenu[j]) * 3000;
					break;
				case "2":
					price = price + Integer.parseInt(totalMenu[j]) * 3500;
					break;
				case "3":
					price = price + Integer.parseInt(totalMenu[j]) * 4000;
					break;
				}
			}
			bill = String.valueOf(price);
		}
		return bill;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("무엇으로 몇 잔 드릴까요 ?");
		System.out.println("0.주문종료\n" + " 1.아메리카노_3000\n" + " 2.라떼_3500\n" + " 3.카푸치노_4000\n");

		String order = "";
		String menu = "";
		int count = 0;
		int tcount = 10;
		for (int i = count; i < tcount; i++) {
			order = scan.next();
			if (order.charAt(0) == '0') {
				i = tcount + 1;
			} else {
				menu = menu + order + ",";
				count++;
			}
		}
		String[] totalMenu = menu.split(",");
		String bill = getBill(totalMenu);

		System.out.println("결제금액은 총" + bill + "원 입니다.");
	}
}
