package step2;
import java.util.Scanner;
/**
BMI = 체중/(키*키)
<2018년 기준>
18.5 미만이면 저체중
18.5∼23은 정상
23~25이면 비만 전단계
25∼30은 1단계 비만
30∼35는 2단계 비만
35 이상이면 3단계 비만
**/
public class BMI {
	public static boolean input(String ans) {
		return (Integer.parseInt(ans)>0);
	}
	public static String getBMI(String[] ans) {
		String bmi = String.valueOf(Double.parseDouble(ans[1])/(Double.parseDouble(ans[0])*0.01)*(Double.parseDouble(ans[0])*0.01));
		return bmi;
	}
	public static String getResult(String bmi) {
		String result = "정상";
		if(Integer.parseInt(bmi)>0) {
		}
		
		
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("0.Stop 1.Go");
			switch(sc.next()) {
				case "0" : return;
				case "1" :
					String[] q = {"Height?","Weight?"};
					String[] ans = new String[2];
					for(int i=0;i<q.length;i++) {
						ans[i]=sc.next();
						if(input(ans[i])) {
							i--;
						}
					}
										
					break;
				default : return;
			}
		}
	}
}

