package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuSelection extends JFrame{
	public MenuSelection() {
		this.setSize(100,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		JLabel label = new JLabel("MenuSelection");
		
		JButton button1 = new JButton("멤버 추가");
		JButton button2= new JButton("멤버 삭제");
		JButton button3 = new JButton("멤버 조회");
		JButton button4 = new JButton("계좌 입출금");
		JButton button5 = new JButton("프로그램 종료");
		
		panel1.add(label);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
	
		//this.setContentPane(panel);	//panel을 frame안에 넣음
		this.add(panel1, BorderLayout.NORTH);	//라벨 패널 북쪽 가운데 넣기
		this.add(panel2,BorderLayout.CENTER);		//버튼 패널 가운데 넣기
		this.setVisible(true);
	}
	
}
