package step2;

import java.util.Scanner;

/**
 * 이름, 국어점수, 영어점수, 수학점수 > 이름 ㅇㅇㅇ 총점00 평균 00 학점 ㅇ > 평균 90이상 A, 80이상 B, 70이상 C,
 * 60이상 D, 50이상 E, 50미만 F > 비정상적인 점수면 에러메시지와 함께 종료
 **/
public class GradeReport_3 {
	public static boolean errorCheck(String answer) {
		return (Integer.parseInt(answer) >= 0 && Integer.parseInt(answer) <= 100);
	}

	public static String[] getTotal(String[] answer) {
		String[] total = new String[2];
		total[0] = String.valueOf(Integer.parseInt(answer[0]) + Integer.parseInt(answer[1]) + Integer.parseInt(answer[2]));
		total[1] = String.valueOf(Integer.parseInt(total[0]) / 3);
		return total;
	}

	public static String getGrade(String[] total) {
		String grade = "F";
		switch (Integer.parseInt(total[1]) / 10) {
		case 10:
		case 9: grade = "A"; break;
		case 8: grade = "B"; break;
		case 7: grade = "C"; break;
		case 6: grade = "D"; break;
		case 5: grade = "E"; break;
		default : break;
		}
		return grade;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("0.Stop 1.Go");
			switch (sc.next()) {
			case "0":
				return;
			case "1":
				System.out.println("Name?");
				String name = sc.next();
				String[] question = { "Korean?", "English?", "Math?" };
				String[] answer = new String[3];
				for (int i = 0; i < question.length; i++) {
					System.out.println(question[i]);
					answer[i] = sc.next();
					if (!errorCheck(answer[i])) {
						i--;
					}
				}
				String[] score = getTotal(answer);
				String grade = getGrade(getTotal(answer));
				
				System.out.printf("[NAME][TOTAL][AVER][GRADE]\n");
				System.out.printf("[%s][%s][%s][%s]\n",name,score[0],score[1],grade);
				break;
			default:
				return;
			}
		}
	}
}