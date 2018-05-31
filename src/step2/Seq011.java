package step2;
/**
 * [수열011] 1-2+3-4+5-...+100 = -50 (스캐너 없음)
 * */
public class Seq011 {
	public static void main(String[] args) {
		String result = "";
		String op = "";
		int sum = 0;
		int evensum = 0;
		int oddsum = 0;
		for(int i=1;i<=100;i++) {
			if(i==100) {
				evensum += i;
				op = i + "=";
			}else if(i%2==0) {
				evensum += i;
				op = i + "+";
			}else {
				oddsum += i;
				op = i + "-";
			}
			result += op;
			sum = oddsum - evensum;
		}
		System.out.println(result+sum);
	}
}
