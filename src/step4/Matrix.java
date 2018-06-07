package step4;

import javax.swing.JOptionPane;
enum Butt {
	EXIT, LEFT_TRIANGLE, RIGHT_TRIANGLE, ZIGZAG, DIAMOND, SAND_GLASS, TRIANGLE, SNAIL, MAGIC_SQUARE, DIAGONAL, MATRIX_CONVERSION;
}
public class Matrix {
	public static String leftTriangle() {
		int[][] leftTriangle = new int[5][5];
		String result = "";
		int num = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				leftTriangle[i][j] = num;
				num++;
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				result += leftTriangle[i][j] + " ";
			}
			result += "\n";
		}
		return result;
	}
	public static String rightTriangle() {
		int[][] rightTriangle = new int[5][5];
		String result = "";
		int num = 1;
		int start = 4;
		for (int i = 0; i < 5; i++) {
			for (int j = start; j <= 4; j++) {
				rightTriangle[i][j] = num;
				num++;
			}
			start--;
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				result += rightTriangle[i][j] + " ";
			}
			result += "\n";
		}
		return result;
	}
	public static String zigzag() {
		int[][] zigzag = new int[5][5];
		String result = "";
		int num = 1;
		for (int i = 0; i < 5; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j <= 4; j++) {
					zigzag[i][j] = num;
					num++;
				}
			} else {
				for (int j = 4; j >= 0; j--) {
					zigzag[i][j] = num;
					num++;
				}
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				result += zigzag[i][j] + " ";
			}
			result += "\n";
		}
		return result;
	}
	public static String diamond() {
		String result="";
		int[][] diamond = new int[5][5];
		int num = 1;
		int start = 3;
		int end = 1;
		for (int i = 0; i < 5; i++) {
			if(i<3) {
				start -- ;
				end ++ ;
			}else {
				start ++ ;
				end --;
			}
			for (int j = start; j <= end; j++) {
				diamond[i][j] = num;
				num++;
			}
		}		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				result += diamond[i][j] + " ";
			}
			result += "\n";
		}
		return result;
	}
	public static String sandGlass() {
		String result = "";
		int[][] sandGlass = new int[5][5];
		int num = 1;
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
				sandGlass[i][j] = num;
				num++;
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				result += sandGlass[i][j] + " ";
			}
			result += "\n";
		}
		return result;
	}
	public static String triangle() {
		String result = "";
		int[][] triangle = new int[7][4];
		int num = 1;
		int start = 3;
		int end = 3;
		for (int i = 0; i < 4; i++) {
			for (int j = start; j <= end; j++) {
				triangle[j][i] = num;
				num++;
			}
			start--;
			end++;
		}
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 4; j++) {
				result += triangle[i][j] + " ";
			}
			result += "\n";
		}
		return result;
	}
	public static String snail() {
		String result = "";
		int[][] snail = new int[5][5];
		int num = 1;
		int row = 0, column = -1;
		int op = 1;
		int count = 5;
		for(int i=count;i>0;i--) {
			for(int j = 0; j<count;j++) {
				column = column + op;
				snail[row][column] = num;
				num++;
			}
			count--;
			for(int j = 0;j<count;j++) {
				row = row + op;
				snail[row][column] = num;
				num++;
			}
			op = op * (-1);
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				result += snail[i][j] + " ";
			}
			result += "\n";
		}
		return result;
	}
	public static String magicSquare() {
		String result = "";
		int[][] magicSquare = new int[5][5];
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
				magicSquare[row][column] = num;
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
				result += magicSquare[i][j] + " ";
			}
			result += "\n";
		}
		return result;
	}
	public static String diagonal() {
		String result = "";
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
				result += diagonal[i][j] + " ";
			}
			result += "\n";
		}
		return result;
	}
	public static String matrixConversion() {
		String result = "";
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
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				result += bArr[i][j] + " ";
			}
			result += "\n";
		}
		return result;
	}
	public static void main(String[] args) {
		Butt[] buttons = { Butt.EXIT, Butt.LEFT_TRIANGLE, Butt.RIGHT_TRIANGLE, Butt.ZIGZAG, Butt.DIAMOND,
				Butt.SAND_GLASS, Butt.TRIANGLE, Butt.SNAIL, Butt.MAGIC_SQUARE, Butt.DIAGONAL, Butt.MATRIX_CONVERSION };
		while (true) {
			Butt select = (Butt) JOptionPane.showInputDialog(null, // frame
					"MATRIC PAGE", // frame title
					"SELECT MATRIX MENU", // order
					JOptionPane.QUESTION_MESSAGE, // type
					null, // icon
					buttons, // Array of choices
					buttons[1] // default
			);
			switch (select) {
			case EXIT:
				return;
			case LEFT_TRIANGLE:
				JOptionPane.showMessageDialog(null, leftTriangle());
				break;
			case RIGHT_TRIANGLE:
				JOptionPane.showMessageDialog(null, rightTriangle());
				break;
			case ZIGZAG:
				JOptionPane.showMessageDialog(null, zigzag());
				break;
			case DIAMOND:
				JOptionPane.showMessageDialog(null, diamond());
				break;
			case SAND_GLASS:
				JOptionPane.showMessageDialog(null, sandGlass());
				break;
			case TRIANGLE:
				JOptionPane.showMessageDialog(null, triangle());
				break;
			case SNAIL:
				JOptionPane.showMessageDialog(null, snail());
				break;
			case MAGIC_SQUARE:
				JOptionPane.showMessageDialog(null, magicSquare());
				break;
			case DIAGONAL:
				JOptionPane.showMessageDialog(null, diagonal());
				break;
			case MATRIX_CONVERSION:
				JOptionPane.showMessageDialog(null, matrixConversion());
				break;
			default:
				return;
			}
		}
	}
}
