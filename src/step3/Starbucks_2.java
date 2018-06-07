package step3;
import javax.swing.JOptionPane;

public class Starbucks_2 {
	public static void main(String[] args) {
		String list = "";
		int totalPrice = 0;
		while (true) {
			String[] menu = { "0_주문완료", "1_아메리카노_3000", "2_카페라떼_3500", "3_카푸치노_4000" };
			String order = JOptionPane.showInputDialog(
					"[주문내역]\n" + list + "\n주문하시겠습니까?\n" + menu[0] + "\n" + menu[1] + "\n" + menu[2] + "\n" + menu[3]);
			if (!order.equals("0")) {
				String[] countmenu = menu[Integer.parseInt(order)].split("_");
				String count = JOptionPane.showInputDialog(countmenu[1] + " 몇 잔 주문하시겠습니까?");
				list += countmenu[1] + " " + count + "잔\n";
				totalPrice += Integer.parseInt(countmenu[2]) * Integer.parseInt(count);
			} else {
				JOptionPane.showMessageDialog(null, list + "\n 총 결제 금액 : " + totalPrice + " 원 입니다.");
				return;
			}
		}
	}
}
