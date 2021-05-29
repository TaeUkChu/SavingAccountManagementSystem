package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class MemberAdder extends JFrame{
	
	public MemberAdder() {
		JPanel panel = new JPanel(new SpringLayout());
		panel.setLayout(new SpringLayout());
		
		JLabel labelAge = new JLabel("����: ", JLabel.TRAILING);
		JTextField fieldAge = new JTextField(10);
		labelAge.setLabelFor(fieldAge);
		panel.add(labelAge);
		panel.add(fieldAge);
		
		JLabel labelName = new JLabel("�̸�: ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelPhone = new JLabel("��ȭ��ȣ: ", JLabel.TRAILING);
		JTextField fieldPhone = new JTextField(10);
		labelPhone.setLabelFor(fieldPhone);
		panel.add(labelPhone);
		panel.add(fieldPhone);
		
		JLabel labelPW = new JLabel("��й�ȣ: ", JLabel.TRAILING);
		JTextField fieldPW = new JTextField(10);
		labelPW.setLabelFor(fieldPW);
		panel.add(labelPW);
		panel.add(fieldPW);
		
		panel.add(new JButton("����"));
		panel.add(new JButton("���"));
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		this.setContentPane(panel);
		this.setVisible(true);
	} 
}
