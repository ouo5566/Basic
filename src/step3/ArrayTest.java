package step3;
import javax.swing.JOptionPane;

public class ArrayTest {
	public static int getTotal(String[] arr) {
		return Integer.parseInt(arr[1]) + Integer.parseInt(arr[2]) + Integer.parseInt(arr[3]);
	}
	public static String getGrade(String[] arr) {
		String grade = "F";
		switch ((getTotal(arr) / 3) / 10) {
		case 10:
		case 9:grade = "A";break;
		case 8:grade = "B";break;
		case 7:grade = "C";break;
		case 6:grade = "D";break;
		case 5:grade = "E";break;
		}
		return grade;
	}
	public static String[] getList(String[] list, String[] arr, int i) {
		list[i] = arr[0] + "/" + arr[1] + "/" + arr[2] + "/" + arr[3] + "/" + getTotal(arr) + "/"
				+ String.valueOf(getTotal(arr) / 3) + "/" + getGrade(arr);
		return list;
	}
	public static void main(String[] args) {
		String score = "";
		String[] lists = new String[5];
		String[] ranks = new String[5];
		int count = 0;
		while (true) {
			String menu = JOptionPane.showInputDialog("0.종료 1.성적입력 2.전체보기 3.순위출력");
			switch (menu) {
			case "0":
				return;
			case "1":
				score = JOptionPane.showInputDialog("이름/국어/영어/수학");
				String[] arr = score.split("/");
				lists = getList(lists, arr, count);
				count++;
				break;
			case "2":
				JOptionPane.showMessageDialog(null, "이름/국어/영어/수학/총점/평균/학점\n" + lists[0] + "\n" + lists[1] + "\n"
						+ lists[2] + "\n" + lists[3] + "\n" + lists[4]);
				break;
			case "3":
/*				String[] temp = lists[0].split("/");
				int list1 = Integer.parseInt(temp[4]);
				temp = lists[1].split("/");
				int list2 = Integer.parseInt(temp[4]);
				temp = lists[2].split("/");
				int list3 = Integer.parseInt(temp[4]);
				if( list1 > list2 && list1 > list3 ) {
					if( list2 > list3 ) {
						ranks[0]="1등/" + lists[0];
						ranks[1]="2등/" + lists[1];
						ranks[2]="3등/" + lists[2];
					}else {
						ranks[0]="1등/" + lists[0];
						ranks[1]="2등/" + lists[2];
						ranks[2]="3등/" + lists[1];
					}
				}else if( list2 > list3 ) {
					if(list1>list3) {
						ranks[0]="1등/" + lists[1];
						ranks[1]="2등/" + lists[0];
						ranks[2]="3등/" + lists[2];
					}else {
						ranks[0]="1등/" + lists[1];
						ranks[1]="2등/" + lists[2];
						ranks[2]="3등/" + lists[0];
					}
				}
				JOptionPane.showMessageDialog(null, "순위/이름/국어/영어/수학/총점/평균/학점\n" + ranks[0] + "\n" + ranks[1] + "\n"
						+ ranks[2] );
				break;*/
				 for(int k = 0; k<ranks.length;k++){
				 	for(int i = 0; i<ranks.length;i++) {
				 		int j = i + 1;
						if(j<ranks.length) {
							String[] temp = new String[1];
							String[] unitI = lists[i].split("/");
							int unit1 = Integer.parseInt(unitI[4]);
							String[] unitJ = lists[j].split("/");
							int unit2 = Integer.parseInt(unitJ[4]);
							if(unit1<unit2) {
								temp[0] = lists[j];
								lists[j] = lists[i];
								lists[i] = temp[0];
							}
						}
					}
				 }
				 for(int i = 0 ; i < ranks.length ; i++) {
					 ranks[i] = (i + 1) + "등 /"+ lists[i];
				 }
				 JOptionPane.showMessageDialog(null, "순위/이름/국어/영어/수학/총점/평균/학점\n" + ranks[0] + "\n" + ranks[1] + "\n"
						+ ranks[2]+ "\n" + ranks[3] + "\n"+ ranks[4] );
				 return;
			}
		}
	}
}
