package step1;

import java.util.Scanner;
/**
월을 입력해서 해당 월의 마지막 날을 알려주는 로직.
예를 들면, 3월이면 말일이 3월31일입니다.
9월이면 말일이 9월30일입니다.라고 알려줌.
단, 2월은 2월28일을 말일로 해서 "2월28일입니다. "라고 함.
**/
public class Calendar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.println("0.Stop 1.Play");
			switch(scan.nextInt()){
				case 0 :
						System.out.println("OFF");
						return;
				case 1 :
						System.out.println("Month?");
						int month = scan.nextInt();

						int day = 31;
						String result = "";
						switch(month){
							case 2 : day = 28; break;
							case 4 :
							case 6 :
							case 9 :
							case 11 : day = 30; break;
							default : result = "ERROR";
						}

						if(month>0 && month<=12){
							result = "Endday : " + month + " ." + day;
						}
						System.out.println(result);						
						break;
			}
		}
	}
}
