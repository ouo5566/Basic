package step3;
import javax.swing.JOptionPane;

/**
 * 두 숫자와 산술연산자를 입력받아 식과 함께 결과를 출력하시오. 단, 산술연산자를 잘못 입력했을 때는 에러메세지를 출력하시오.
 **/
public class Calc {
	public static void main(String[] args) {
		String num1 = JOptionPane.showInputDialog("Enter Number 1");
		String result = num1;
		String num2 = "";
		int num3 = Integer.parseInt(num1);
		while (true) {
			String opcode = JOptionPane.showInputDialog("Enter OPCODE");
			switch (opcode) {
			case "+":
				num2 = JOptionPane.showInputDialog("Enter Number 2");
				num3 = num3 + Integer.parseInt(num2);
				result += opcode + num2;
				break;
			case "-":
				num2 = JOptionPane.showInputDialog("Enter Number 2");
				num3 = num3 - Integer.parseInt(num2);
				result += opcode + num2;
				break;
			case "*":
				num2 = JOptionPane.showInputDialog("Enter Number 2");
				num3 = num3 * Integer.parseInt(num2);
				result += opcode + num2;
				break;
			case "/":
				num2 = JOptionPane.showInputDialog("Enter Number 2");
				num3 = num3 / Integer.parseInt(num2);
				result += opcode + num2;
				break;
			case "%":
				num2 = JOptionPane.showInputDialog("Enter Number 2");
				num3 = Integer.parseInt(num1) % Integer.parseInt(num2);
				result += opcode + num2;
				break;
			case "=":
				JOptionPane.showMessageDialog(null, result + opcode + num3);
				return;
			default:
				JOptionPane.showMessageDialog(null,"OPCODE ERROR");
				return;
			}
		}
	}
}