package step4;

/**
 *   1 2 3 4 5
 *     6 7 8
 *       9
 *    10 11 12
 * 13 14 15 16 17 
 */
public class SandGlass {
	public static void main(String[] args) {
		int[][] mtx = new int[5][5];
		int k = 0;
		int start = -1;
		int end = 5;
		for (int i = 0; i < 5; i++) {
			if(i<3) {
				start ++ ;
				end -- ;
			}else {
				start -- ;
				end ++;
			}
			for (int j = start; j <= end; j++) {
				k++;
				mtx[i][j] = k;
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%02d ",mtx[i][j]);
			}
			System.out.println();
		}
	}
}

