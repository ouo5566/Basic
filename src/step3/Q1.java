package step3;

import javax.swing.JOptionPane;

public class Q1 {
	public static void main(String[] args) {
		while (true) {
			String name = JOptionPane.showInputDialog("이름 ? [OUT:종료]");
			if (name.equals("OUT")) {
				return;
			}
			String totalPay = JOptionPane.showInputDialog("출장비 지급액 ?");
			String pay = totalPay;
			String[] money = { "50000", "10000", "5000", "1000", "500", "100", "50", "10", "5", "1" };
			String[] unit = new String[money.length];
			String result = "";
			for (int i = 0; i < money.length; i++) {
				unit[i] = String.valueOf(Integer.parseInt(pay) / Integer.parseInt(money[i]));
				pay = String.valueOf(Integer.parseInt(pay) % Integer.parseInt(money[i]));
				if (!unit[i].equals("0")) {
					result += money[i] + "원 " + unit[i] + "장\n";
				}
			}
			JOptionPane.showMessageDialog(null, "이름:" + name + "\n출장비지급액:" + totalPay + "원\n" + result);
		}
	}
}
