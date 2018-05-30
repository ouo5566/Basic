package step1;

import java.util.Scanner;
/**
두 숫자를 입력받아 작은 수에서 부터 큰 수까지의 범위 합을 구하시오.
두 번째 숫자가 첫 번째 숫자보다 작을 경우,
자동으로 두 번째 숫자가 시작점에 위치한다.
**/
public class Series {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.println("0.Stop 1.Play");
			int flag = scan.nextInt();
			switch(flag){
				case 0 :
						System.out.println("BYE");
						return;
				case 1 :
						System.out.println("First Number?");
						int start = scan.nextInt();
						System.out.println("Second Number?");
						int end = scan.nextInt();
						
						int sum = 0, temp = 0;
						if(start>end){
							temp = start;
							start = end;
							end = temp;
						}
						for(;start<end+1;start++){
							sum += start;
						}
						System.out.println("sum : " + sum);
						break;
			}
		}
	}
}
