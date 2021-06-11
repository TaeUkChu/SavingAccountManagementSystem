package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JButton;
import javax.swing.JTextField;

import Member.AdultMember;
import Member.MemberInput;
import Member.MemberKind;
import exception.NameFormatException;
import exception.PasswordFormatException;
import gui.MemberAdder;
import gui.MemberViewer;
import gui.WindowFrame;
import manager.MemberManager;

public class MemberAdderListener implements ActionListener {
	JTextField fieldAge;
	JTextField fieldName;
	JTextField fieldPhone;
	JTextField fieldPW;
	
	MemberManager membermanager;
	
	public MemberAdderListener(
			JTextField fieldAge, 
			JTextField fieldName, 
			JTextField fieldPhone, 
			JTextField fieldPW,	MemberManager membermanager) {
		this.fieldAge = fieldAge;
		this.fieldName = fieldName;
		this.fieldPhone = fieldPhone;
		this.fieldPW = fieldPW;
		this.membermanager = membermanager;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println(fieldAge.getText());
//		System.out.println(fieldName.getText());
//		System.out.println(fieldPhone.getText());
//		System.out.println(fieldPW.getText());
//		
		MemberInput member = new AdultMember(MemberKind.Adult);
		try {
			member.setAge(Integer.parseInt(fieldAge.getText()));
			member.setName(fieldName.getText());
			member.setCall_number(fieldPhone.getText());
			member.setPassword(Integer.parseInt(fieldPW.getText()));
			membermanager.Addmember(member);
			putObject(membermanager, "membermanager.ser");
			member.printInfo();
			
		} catch (NameFormatException e1 ) {
			e1.printStackTrace();
		} catch (NumberFormatException e1  ) {
			e1.printStackTrace();
		} catch (PasswordFormatException e1) {
			e1.printStackTrace();
		}
		
	}
	public static void putObject(MemberManager membermanager, String fileName) {	
		try {
			FileOutputStream file = new FileOutputStream(fileName);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(membermanager);
			out.close();
			file.close();
			
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
