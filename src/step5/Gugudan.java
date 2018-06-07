package step5;

public class Gugudan {
	public static void main(String[] args) {
		String result = "";
		int a = 2, b = 1;
		for (int i = 0; i < 18; i++) {
			if (i > 8) {
				a = 6;
			}
			for (int j = 0; j < 4; j++) {
				result += a + "X" + b + "=" + (a * b) + " ";
				a++;
				if (a > 5 && i < 8) {
					a = 2;
				}
			}
			b++;
			if (b > 9) {
				b = 1;
				result += "\n";
			}
			result += "\n";
		}
		System.out.print(result);
	}
}
