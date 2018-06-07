package step4;
/**
 * 1
 * 2  3
 * 4  5  6
 * 7  8  9  10
 * 11 12 13 14 15
 **/
public class LeftTriangle {
	public static void main(String[] args) {
		int[][] mtx = new int[5][5];
		int k = 0;
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				k++;
				mtx[i][j] = k;
			}
		}
		for(int i =0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(mtx[i][j]);
			}
			System.out.println();
		}
	}
}
