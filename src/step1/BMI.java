package step1;

import java.util.Scanner;
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

