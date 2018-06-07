package step2;
import java.util.Scanner;
public class GradeReport_2 {
	public static int[] getTotal(String str) {
		String[] score = str.split(" ");
		int kor = Integer.parseInt(score[0]);
		int eng = Integer.parseInt(score[1]);
		int math = Integer.parseInt(score[2]);
		
		int[] total = new int[2];
		total[0] = kor + eng + math;
		total[1] = total[0]/3;
		
		return total;
	}
	public static String getGrade(int[] total) {
				
		int[] arr = total;
		String grade = "F";
		
		switch (arr[1]/10) {
		case 10 :
		case 9 : grade = "A"; break;
		case 8 : grade = "B"; break;
		case 7 : grade = "C"; break;
		case 6 : grade = "D"; break;
		case 5 : grade = "E"; break;
		}
		
		return grade;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("0.Stop 1.Play");
			switch (scan.nextInt()) {
			case 0:
				System.out.println("Bye");
				return;
			case 1:
				System.out.println("Name?");
				String name = scan.next();
				System.out.println("Korean?");
				String kor = scan.next();
				System.out.println("English?");
				String eng = scan.next();
				System.out.println("Math?");
				String math = scan.next();
				
				String str = kor + " " + eng + " " + math;
						
				int[] score = getTotal(str);
				String grade = getGrade(getTotal(str));
				
				System.out.printf("******************************\n");
				System.out.printf("│   이   름     │ 총점  │ 평균  │ 학점  │\n");
				System.out.printf("│   %s     │ %s │ %s  │  %s  │\n",name,score[0],score[1],grade);
				System.out.printf("******************************\n");
				break;
			}
		}
	}
}