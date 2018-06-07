package step4;

import javax.swing.JOptionPane;
enum Butt{
	EXIT,
	LEFT_TRIANGLE,
	RIGHT_TRIANGLE,
	ZIGZAG,
	DIAMOND,
	SAND_GLASS,
	TRIANGLE,
	SNAIL,
	MAGIC_SQUARE,
	DIAGONAL,
	MATRIX_CONVERSION;
}
public class Matrix {
	public static String leftTriangle() {
		int[][] leftTriangle = new int[5][5];
		String result = "";
		int num = 1;
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				leftTriangle[i][j] = num;
				num++;
				result+=leftTriangle[i][j]+" ";
			}
			result+="\n";
		}
		return result;
	}
	public static int[][] rightTriangle(){
		int[][] rightTriangle = new int[5][5];
		int num = 1;
		int start = 4;
		for(int i=0;i<5;i++) {
			for(int j=start;j<=4;j++) {
				rightTriangle[i][j] = num ;
				num++;
			}
		start--;
		}
		return rightTriangle;
	}
	public static void main(String[] args) {
		Butt[] buttons = {
				Butt.EXIT,
				Butt.LEFT_TRIANGLE,
				Butt.RIGHT_TRIANGLE,
				Butt.ZIGZAG,
				Butt.DIAMOND,
				Butt.SAND_GLASS,
				Butt.TRIANGLE,
				Butt.SNAIL,
				Butt.MAGIC_SQUARE,
				Butt.DIAGONAL,
				Butt.MATRIX_CONVERSION
				};
		while(true) {
			Butt select = (Butt)JOptionPane.showInputDialog(
					null,// frame
					"MATRIC PAGE", // frame title
					"SELECT MATRIX MENU", // order
					JOptionPane.QUESTION_MESSAGE, // type
					null, //icon
					buttons, // Array of choices
					buttons[1] // default
					);
			switch(select) {
			case EXIT: 
				return;
			case LEFT_TRIANGLE:
				JOptionPane.showMessageDialog(null,leftTriangle());
				break;
			case RIGHT_TRIANGLE:
				int[][] case2 = rightTriangle();
				break;
			case ZIGZAG:
			case DIAMOND:
			case SAND_GLASS:
			case TRIANGLE:
			case SNAIL:
			case MAGIC_SQUARE:
			case DIAGONAL:
			case MATRIX_CONVERSION:
			default : return;
			}
		}
	}
}
