package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import listeners.ButtonAddListener;
import listeners.ButtonViewlistener;

public class MenuSelection extends JPanel{
	
	WindowFrame frame;
	
	public MenuSelection(WindowFrame frame) {
		this.frame = frame;
		this.setLayout(new BorderLayout());
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		JLabel label = new JLabel("MenuSelection");
		
		JButton button1 = new JButton("��� �߰�");
		JButton button2= new JButton("��� ����");
		JButton button3 = new JButton("��� ��ȸ");
		JButton button4 = new JButton("���� �����");
		JButton button5 = new JButton("���α׷� ����");
		
		button1.addActionListener(new ButtonAddListener(frame));
		button3.addActionListener(new ButtonViewlistener(frame));
		
		panel1.add(label);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
	
		//this.setContentPane(panel);	//panel�� frame�ȿ� ����
		this.add(panel1, BorderLayout.NORTH);	//�� �г� ���� ��� �ֱ�
		this.add(panel2,BorderLayout.CENTER);		//��ư �г� ��� �ֱ�
		
	}
	
}
