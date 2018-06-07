package step2;

import java.util.Scanner;

public class GradeReport {
	public static int[] input(Scanner scan) {
		System.out.println("Korean?");
		int kor = scan.nextInt();
		System.out.println("English?");
		int eng = scan.nextInt();
		System.out.println("Math?");
		int math = scan.nextInt();

		int[] score = new int[3];
		score[0] = kor;
		score[1] = eng;
		score[2] = math;
		return score;
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
				
				int[] score = input(scan);
				int kor = score[0], eng = score[1], math = score[2];
				int total = kor + eng + math;
				int average = total / 3;
				int aver = average / 10;
				
				String grade = "F";
				switch (aver) {
				case 9: grade = "A"; break;
				case 8: grade = "B"; break;
				case 7: grade = "C"; break;
				case 6: grade = "D"; break;
				case 5: grade = "E"; break;
				}
				System.out.printf("******************************\n");
				System.out.printf("│   이   름     │ 총점  │ 평균  │ 학점  │\n");
				System.out.printf("│   %s     │ %d │ %d  │  %s  │\n",name,total,average,grade);
				System.out.printf("******************************\n");
				break;
			}
		}
	}
}