package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.MemberManager;

public class WindowFrame extends JFrame{
	
	MemberManager membermanager;
	
	MenuSelection menuSelection;
	MemberAdder memberAdder ;
	MemberViewer memberViewer;


	public WindowFrame(MemberManager membermanager) {
		this.membermanager = membermanager;
		menuSelection = new MenuSelection(this,this.membermanager);
		memberAdder = new MemberAdder(this,this.membermanager);
		memberViewer = new MemberViewer(this,this.membermanager);

		
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setupPanel(menuSelection);
		this.setVisible(true);
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuselection() {
		return menuSelection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuSelection = menuselection;
	}

	public MemberAdder getMemberadder() {
		return memberAdder;
	}

	public void setMemberadder(MemberAdder memberadder) {
		this.memberAdder = memberadder;
	}

	public MemberViewer getMemberViewer() {
		return memberViewer;
	}

	public void setMemberViewe(MemberViewer memberViewe) {
		this.memberViewer = memberViewe;
	}

}
