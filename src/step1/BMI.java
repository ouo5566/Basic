package step1;
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
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.println("0.Stop 1.Play");
			switch(scan.nextInt()){
				case 0 : 
						System.out.println("POWER OFF");
						return;
				case 1 :
						System.out.println("Height?");
						double h = scan.nextDouble() * 0.01;
						System.out.println("Weight?");
						double w = scan.nextDouble();

						double bmi = w/(h*h);
						String level = "NOMAL";

						if(bmi>=35.0){
							level = "LEVEL 3 OVERWEIGHT";
						}else if(bmi>=30.0){
							level = "LEVEL 2 OVERWEIGHT";
						}else if(bmi>=25.0){
							level = "LEVEL 1 OVERWEIGHT";
						}else if(bmi>=23.0){
							level = "BEFORE LEVEL OF OVERWEIGHT";
						}else if(bmi<18.5){
							level = "LOW BODY WEIGHT";
						}
						System.out.println(level);
						break;
			}		
		}
	}
}

