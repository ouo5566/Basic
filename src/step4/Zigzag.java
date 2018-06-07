package step4;

/**
 *  1 2 3 4 5
 * 10 9 8 7 6
 * 11 ...
 */
public class Zigzag {
	public static void main(String[] args) {
		int[][] mtx = new int[5][5];
		int k = 0;
		for (int i = 0; i < 5; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j <= 4; j++) {
					k++;
					mtx[i][j] = k;
				}
			} else {
				for (int j = 4; j >= 0; j--) {
					k++;
					mtx[i][j] = k;
				}
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(mtx[i][j]);
			}
			System.out.println();
		}
	}
}