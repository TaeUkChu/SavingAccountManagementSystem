package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Member.MemberInput;
import manager.MemberManager;

public class MemberViewer extends JPanel{
	WindowFrame frame;
	MemberManager membermanager;
	
	public MemberManager getMembermanager() {
		return membermanager;
	}
	public void setMembermanager(MemberManager membermanager) {
		this.membermanager = membermanager;
		this.removeAll();
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("나이");
		model.addColumn("이름");
		model.addColumn("전화번호");
		model.addColumn("계좌 잔고");
		model.addColumn("더보기 ...");
		
		for (int i =0; i<membermanager.size(); i++) {
			Vector row = new Vector();
			MemberInput mi= membermanager.get(i);
			row.add(mi.getAge());
			row.add(mi.getName());
			row.add(mi.getCall_number());
			row.add(mi.getBudget_money());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		
	}
	
	public MemberViewer(WindowFrame frame, MemberManager membermanager) {
		this.frame = frame;
		//String column[] = {"Age", "Name", "Phone", "PassWord"};
		this.membermanager = membermanager;
		//멤버 총 몇명(사이즈)인지 확인
		System.out.println("***"+membermanager.size() + "***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("나이");
		model.addColumn("이름");
		model.addColumn("전화번호");
		model.addColumn("계좌 잔고");
		model.addColumn("더보기 ...");
		
		for (int i =0; i<membermanager.size(); i++) {
			Vector row = new Vector();
			MemberInput mi= membermanager.get(i);
			row.add(mi.getAge());
			row.add(mi.getName());
			row.add(mi.getCall_number());
			row.add(mi.getBudget_money());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}
}
