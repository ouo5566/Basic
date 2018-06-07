package step4;
/**
 * 00 00 00 00 01 
 * 00 00 00 02 03 
 * 00 00 04 05 06 
 * 00 07 08 09 10 
 * 11 12 13 14 15
 **/

public class RightTriangle {
	public static void main(String[] args) {
		int[][] mtx = new int[5][5];
		int k = 0;
		int start = 4;
		int end = 4;
		for(int i=0;i<5;i++) {
			for(int j=start;j<=end;j++) {
				k++;
				mtx[i][j] = k;
			}
		start--;
		}
		for(int i =0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.printf("%02d ",mtx[i][j]);
			}
			System.out.println();
		}
	}
}