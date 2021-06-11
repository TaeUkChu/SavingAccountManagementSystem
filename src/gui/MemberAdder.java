package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import listeners.MemberAdderCancelListener;
import listeners.MemberAdderListener;
import manager.MemberManager;

public class MemberAdder extends JPanel{
	
	WindowFrame frame;
	MemberManager membermanager;

	public MemberAdder(WindowFrame frame,	MemberManager membermanager) {
		this.frame = frame;
		this.membermanager = membermanager;
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
		
		JButton saveButton = new JButton("����");
		saveButton.addActionListener(new MemberAdderListener(fieldAge,fieldName,fieldPhone,fieldPW,	membermanager));
		JButton cancelButton = new JButton("���");
		cancelButton.addActionListener(new MemberAdderCancelListener(frame));
		
		panel.add(labelPW);
		panel.add(fieldPW);
		
		panel.add(saveButton);
		panel.add(cancelButton);
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		
		this.add(panel);
		this.setVisible(true);
	} 
}
