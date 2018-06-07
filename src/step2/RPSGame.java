package step2;

import java.util.Scanner;
/**
가위바위보 rock, paper, scissors
입력 두 개 받아서 결과 도출.
A 승리, B 승리, 비김.
**/
public class RPSGame {
	public static String input(Scanner sc) {
		System.out.println("A : Choose between R P S");
		String a = sc.next();
		System.out.println("B : Choose between R P S");
		String b = sc.next();
		String rps = a + "," + b;
		return rps;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("0.Off 1.On");
			switch(sc.nextInt()) {
			case 0 : return;
			case 1 :
				String[] rps = input(sc).split(",");
				String a = rps[0];
				String b = rps[1];
				String result = "";
				switch(a) {
				case "R" : result = (b.equals("R"))?"DRAW":(b.equals("S"))?"A WIN":"B WIN"; break;
				case "P" : result = (b.equals("P"))?"DRAW":(b.equals("R"))?"A WIN":"B WIN"; break;
				case "S" : result = (b.equals("S"))?"DRAW":(b.equals("P"))?"A WIN":"B WIN"; break;
				default : return;
				}
				System.out.println(result);				
				break;
			default : return;
			}
		}
	}
}
