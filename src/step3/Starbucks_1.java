package step3;
import javax.swing.JOptionPane;
/**
 * 강사님 예시
 * */
public class Starbucks_1 {
	public static void main(String[] args) {
		String result = "";
		int totalPrice = 0;
		while(true){
			String option = JOptionPane.showInputDialog("0주문완료 \n"
					+ "1아메리카노3000\n"
					+ "2라떼3500\n"
					+ "3카푸치노4000\n");
			String count = "";
			String[] menu = {"아메리카노","라떼","카푸치노"};
			int[] prices = {3000,3500,4000};
			int price=0;
			switch(option){
			case "0" : 
				JOptionPane.showMessageDialog(null, result);
				return;
			case "1" :
				count = JOptionPane.showInputDialog("몇잔?");
				result = menu[0] + count + "잔";
				price = Integer.parseInt(count)*prices[0];
				totalPrice += price;
				result = "결재금액: "+totalPrice;
				break;
			case "2" : 
				count = JOptionPane.showInputDialog("몇잔?");
				result = menu[1] + count + "잔";
				price = Integer.parseInt(count)*prices[1];
				totalPrice += price;
				result = "결재금액: "+totalPrice;
				break;
			case "3" : 
				count = JOptionPane.showInputDialog("몇잔?");
				result = menu[2] + count + "잔";
				price = Integer.parseInt(count)*prices[2];
				totalPrice += price;
				result = "결재금액: "+totalPrice;
				break;
			}
		}
	}
}