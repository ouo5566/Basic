package step4;

public class MatrixConversion {
	public static void main(String[] args) {
		int[][] aArr = new int[5][3];
		int[][] bArr = new int[3][5];
		int num = 1;
	
		int row = 0, column = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				aArr[i][j]=num;
				num++;
				bArr[row][column] = aArr[i][j];
				column++;
				if(column>4) {
					column = 0;
					row++;
				}
			}
			
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("%02d ", aArr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%02d ", bArr[i][j]);
			}
			System.out.println();
		}
	}
}
