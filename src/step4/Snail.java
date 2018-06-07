package step4;

/**
 *  1 2 3 4 5
 * 16171819 6
 * 15    20 7
 * 14    21 8
 * 13121110 9
 */
public class Snail {
	public static void main(String[] args) {
		int[][] mtx = new int[5][5];
		int num = 1;
		int row = 0, column = -1;
		int op = 1;
		int count = 5;
		for(int i=count;i>0;i--) {
			for(int j = 0; j<count;j++) {
				column = column + op;
				mtx[row][column] = num;
				num++;
			}
			count--;
			for(int j = 0;j<count;j++) {
				row = row + op;
				mtx[row][column] = num;
				num++;
			}
			op = op * (-1);
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%02d ",mtx[i][j]);
			}
			System.out.println();
		}
	}
}

