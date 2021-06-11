package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JButton;

import gui.MemberViewer;
import gui.WindowFrame;
import manager.MemberManager;

public class ButtonViewlistener implements ActionListener {

	WindowFrame frame;
	
	public ButtonViewlistener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		MemberViewer memberViewer = frame.getMemberViewer();
		MemberManager membermanager = getObject("membermanager.ser");
		memberViewer.setMembermanager(membermanager);
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(memberViewer);
		frame.revalidate();
		frame.repaint();
		
//		JButton b = (JButton)e.getSource();
//		MemberViewer viewer = frame.getMemberViewer();
//		frame.setupPanel(viewer);
	}
	
	public static MemberManager getObject(String fileName) {
		MemberManager membermanager = null;
		try {
			FileInputStream file = new FileInputStream(fileName);
			ObjectInputStream in = new ObjectInputStream(file);
			membermanager = (MemberManager) in.readObject();
			in.close();
			file.close();

		}catch (FileNotFoundException e) {
			return membermanager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return membermanager;
	}

}
