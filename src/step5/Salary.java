package step5;

import javax.swing.JOptionPane;
enum Butt{
	EXIT,
	INPUT,
	LIST
}
public class Salary {
	public static String getList(String[][] arrList, String[] option) {
		String result = "";
		String[] sum = getSum(arrList);
		for(int i = 0 ; i < 3 ; i++ ) {
			for(int j = 0 ; j < option.length ; j++) {
				result += arrList[i][j] + "/";
			}
			result+= sum[i] + "\n";
		}
		return result;
	}
	public static String[] getSum(String[][] sum) {
		String[] sumarr = new String[3];
		for(int i = 0 ; i < 3 ; i++) {
			sumarr[i] = String.valueOf(Integer.parseInt(sum[i][2]) + Integer.parseInt(sum[i][3]));
		}
		return sumarr;
	}
	public static void main(String[] args) {
		Butt[] buttons = {
				Butt.EXIT,
				Butt.INPUT,
				Butt.LIST};
		String[] option = {"부서","성명","본봉","수당"};
		String[][] arrSalary = new String[3][option.length];
		while(true) {
			Butt select = (Butt)JOptionPane.showInputDialog(
					null,// frame
					"SALARY PAGE", // frame title
					"SELECT MENU", // order
					JOptionPane.QUESTION_MESSAGE, // type
					null, //icon
					buttons, // Array of choices
					buttons[1] // default
					);
			
			switch(select) {
			case EXIT : return;
			case INPUT :
				for(int i = 0;i<arrSalary.length;i++) {
					for(int j = 0;j<option.length;j++) {
						String dept = JOptionPane.showInputDialog(option[j]);
						arrSalary[i][j] = dept;
					}
				}
			break;
			case LIST :
				JOptionPane.showMessageDialog(null,"[사원 급여표]\n"
						+ "부서/성명/본봉/수당/합계 \n"+getList(arrSalary,option));
			}
		}
	}
}
