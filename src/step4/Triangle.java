package step4;

/**
 *       10
 *     5 11
 *   2 6 12
 * 1 3 7 13 
 *   4 8 14
 *     9 15
 *       16
 */
public class Triangle {
	public static void main(String[] args) {
		int[][] mtx = new int[7][4];
		int k = 0;
		int start = 3;
		int end = 3;
		for (int i = 0; i < 4; i++) {
			for (int j = start; j <= end; j++) {
				k++;
				mtx[j][i] = k;
			}
			start--;
			end++;
		}

		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(mtx[i][j]);
			}
			System.out.println();
		}
	}
}

