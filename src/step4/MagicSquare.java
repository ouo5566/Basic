package step4;

public class MagicSquare {
	public static void main(String[] args) {
		int[][] msArr = new int[5][5];
		int row = 1;
		int column = 1;
		int num = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				row--;
				column++;
				if (column > 4) {
					column = 0;
				}
				if (row < 0) {
					row = 4;
				}
				msArr[row][column] = num;
				num++;
			}
			row += 2;
			column--;
			if (row > 4) {
				row = 0;
			}
			if (column < 0) {
				column = 4;
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%02d ", msArr[i][j]);
			}
			System.out.println();
		}
	}
}