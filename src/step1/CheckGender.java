package step1;

import java.util.Scanner;
/**
To.개발자님
주민번호를 입력하면 해당 학생이 남자인지, 여자인지, 외국인인지 자동으로 출력해 주는 프로그램
홍길동 : 800101 -1234567 : 남
입력값은 이름과 주민번호이고 남은 자동으로 출력되는 값입니다.

현행법상 1, 3으로 시작되면 남자, 2, 4로 시작되면 여자, 5,6 이면 외국인
실수로 0,7,8,9 로 시작 주민번호를 입력하면 "다시 입력하세요" 출력

* 주민등록번호 800101-1234567 에서 1 을 추출하는 문법
      String ssn = "800101-1234567";
      char ch = ssn.charAt(7); 하면 1 이 추출되어 ch 에 담긴다.
그러면 내부값은 '1' 이렇게 된다.
      if(ch=='0'||ch=='7'||ch=='8'||ch=='9'){...}
**/
public class CheckGender {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.println("0.STOP 1.PLAY");
			switch(scan.nextInt()){
				case 0 :
						System.out.println("POWER OFF");
					 	return;
				case 1 :
						System.out.println("NAME ?");
						String name = scan.next();
						System.out.println("ID ? ex:000000-0000000");
						String id = scan.next();

						String result = "";
						char c = id.charAt(7);
						switch(c){
							case '1' :
							case '3' : result = name + " : " + id + " : MALE"; break;
							case '2' :
							case '4' : result = name + " : " + id + " : FEMALE"; break;
							case '5' :
							case '6' : result = name + " : " + id + " : FOREIGNER"; break;
							default : result = "Enter Again"; break;
						}
						System.out.println(result);
						break;
			}
		}
	}
}
