package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MemberViewer extends JFrame{
	
	public MemberViewer() {
		//String column[] = {"Age", "Name", "Phone", "PassWord"};
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("나이");
		model.addColumn("이름");
		model.addColumn("전화번호");
		model.addColumn("계좌 잔고");
		model.addColumn("더보기 ...");
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
