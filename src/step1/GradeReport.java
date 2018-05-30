package step1;

import java.util.Scanner;
/**
이름, 국어점수, 영어점수, 수학점수
> 이름 ㅇㅇㅇ 평균 00 학점 ㅇ
> 평균 90이상 A, 80이상 B, 70이상 C, 60이상 D, 50이상 E, 50미만 F
> 비정상적인 점수면 에러메시지와 함께 종료
> 배우지 않은 개념이 들어가 일단 보류
**/
public class GradeReport {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	while(true) {
		System.out.println("0.Stop 1.Play");
		switch(scan.nextInt()) {
		case 0 :
				System.out.println("Bye");
				return;
		case 1 :
				System.out.println("Name?");
				String name = scan.next();
				System.out.println("Korean?");
				int kor = scan.nextInt();
				System.out.println("English?");
				int eng = scan.nextInt();
				System.out.println("Math?");
				int math = scan.nextInt();
				
				int average = (kor + eng + math)/3;
				int aver = average/10;
								String grade = "F";
				switch(aver){
					case 9 : grade = "A"; break;
					case 8 : grade = "B"; break;
					case 7 : grade = "C"; break;
					case 6 : grade = "D"; break;
					case 5 : grade = "E"; break;
				}
				System.out.println("이름 : "+ name + ", " + "평균 : " + average + ", " + "학점 : " + grade);
				break;
			}
	}
	}
}