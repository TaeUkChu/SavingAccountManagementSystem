import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import log.EventLogger;

public class Account_menu {
	static EventLogger logger = new EventLogger("log.txt");
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		MemberManager membermanager = getObject("membermanager.ser");
		if (membermanager ==null) {
			membermanager = new MemberManager(input);
		} 
			SelectMenu(input,membermanager);
			putObject(membermanager, "membermanager.ser");
			
	}
	
		public static void SelectMenu(Scanner input, MemberManager membermanager) {
			int num = 0;
			while(num<5) {
			Showmenu();
			num = input.nextInt();		//�޴���ȣ�� �Է¹���

			switch(num) {
			case 1:	//1�� �޴��� ����� ��
				membermanager.Addmember();  //��� ������ �߰�
				logger.log("��� �߰�.");
				continue;
			
			case 2:	//2���� �� ��� �������� ����� �Է¹ް� ����������	
				logger.log("��� ���� �õ�.");
				membermanager.Viewmembers();
				membermanager.Delmember();
				continue;
			
			case 3:
				logger.log("��ϵ� ���.");
				membermanager.Viewmembers();
				continue;
			case 4:		//3���� �� ��� ���� ��ϵ� ����� �����ְ� �����ϰ� ��. 
				logger.log("�����.");
				membermanager.Viewmembers();
				membermanager.Selectmember();  
				continue;
			
			case 5:		//4���� �� ��� while ������ �����鼭 ���̹���~
				logger.log("�ý��� ����.");
				System.out.println("�ý����� ����Ǿ����ϴ�. ���̹���~");
				break;
			}
			}
			
			
			
		}
		
	public static void Showmenu() {
		System.out.println("");
		System.out.println("****���� ���� ���� �ý��ۿ� ���� ���� ȯ���մϴ�****"); 	//�⺻ �޴� ����
		
		System.out.println("1.��� �߰��ϱ�.");
		System.out.println("2.��� �����ϱ�.");
		System.out.println("3.��� ��ȸ�ϱ�");
		System.out.println("4.��� ������ϱ�.");
		System.out.println("5.�����ϱ�");
		
		System.out.println("*********���Ͻô� �޴��� ������ �ּ���*********");
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