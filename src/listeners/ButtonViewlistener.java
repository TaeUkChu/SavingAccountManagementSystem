package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.MemberViewer;
import gui.WindowFrame;

public class ButtonViewlistener implements ActionListener {

	WindowFrame frame;
	
	public ButtonViewlistener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		MemberViewer viewer = frame.getMemberViewer();
		frame.setupPanel(viewer);
	}

}
