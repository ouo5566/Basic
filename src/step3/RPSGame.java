package step3;

import javax.swing.JOptionPane;

/**
 * 가위바위보 rock, paper, scissors 입력 두 개 받아서 결과 도출. A 승리, B 승리, 비김.
 **/
public class RPSGame {
	public static void main(String[] args) {
		String result = "";
		int count = 0;
		int draw = 0;
		int playerwin = 0;
		String totalcount = JOptionPane.showInputDialog("How many this game?");
		for (int i = 1; i <= Integer.parseInt(totalcount); i++) {
			int com = (int) (Math.random() * 10);
			if (com >= 1 && com <= 3) {
				int win = com - Integer.parseInt(JOptionPane.showInputDialog(i+"번째\n" + "Player : 1.R 2.P 3.S"));
				switch (win) {
				case 0:
					result = "DRAW";
					draw++;
					count++;
					break;
				case 1:
				case -2:
					result = "Computer WIN";
					count++;
					break;
				case -1:
				case 2:
					result = "Player WIN";
					playerwin++;
					count++;
					break;
				}
				JOptionPane.showMessageDialog(null, result);
			} else {
				i--;
			}
		}
		JOptionPane.showMessageDialog(null, count + "전" + playerwin + "승" + draw + "무");
	}
}
