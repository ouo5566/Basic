package step4;

public class Diagonal2 {
	public static void main(String[] args) {
		int[][] diagonal = new int[5][5];
		int num = 1;
		int row = -1, column = 1;
		int end = 0;
		for (int i = 0; i < 9; i++) {
			if (i > 4) {
				column = 5;
				row = -5 + i;
				end--;
			} else {
				row = -1;
				column = i + 1;
				end = i;
			}
			for (int j = 0; j <= end; j++) {
				row++;
				column--;
				if (row > 4) {
					row = 0;
				}
				if (column < 0) {
					column = 4;
				}
				diagonal[row][column] = num;
				num++;
			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%02d ", diagonal[i][j]);
			}
			System.out.println();
		}
	}
}
