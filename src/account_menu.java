import java.util.Scanner;

public class account_menu {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 0;
		
		while(num<4) {		
		System.out.println("");
		System.out.println("****���� ���� ���� �ý��ۿ� ���� ���� ȯ���մϴ�****"); 	//�⺻ �޴� ����
		
		System.out.println("1.��� �߰��ϱ�.");
		System.out.println("2.��� �����ϱ�.");
		System.out.println("3.��� ��ȸ�ϱ�.");
		System.out.println("4.�����ϱ�");
		
		System.out.println("*********���Ͻô� �޴��� ������ �ּ���*********");
		num = input.nextInt();		//�޴���ȣ�� �Է¹���
		
		switch(num) {
		case 1:	//1�� �޴��� ����� ��
			Addmember();  //��� ������ �߰�
			continue;
		
		case 2:	//2���� �� ��� �������� ����� �Է¹ް� ����������			
			Delmember();
			continue;
		
		case 3:		//3���� �� ��� ���� ��ϵ� ����� �����ְ� �����ϰ� ��. 
			Viewmember();
			Selectmember();  //(���� ��)
			System.out.println("�߰� �޴��� ����ּ���(1~3)");  //�ش� ����� ���� ���� ���� �޴��� �� �� ���� (���� ������)
			System.out.println("");
			System.out.println("3-1. ������ ����� �Ա��ϱ�");
			System.out.println("3-2. ������ ������� ����ϱ�");
			System.out.println("3-3. ����ϰ� �޴��� ���ư���.");
			continue;
		
		case 4:		//4���� �� ��� while ������ �����鼭 ���̹���~
			System.out.println("�ý����� ����Ǿ����ϴ�. ���̹���~");
			break;
		}
	}
	}
	public static void Addmember() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("�߰��� ��� ������ �Է����ּ���");	//�̸�,����,��ȭ��ȣ,���º�й�ȣ�� �Է¹���. �迭�� �����ϰ������ ���� x
		System.out.print("�̸�:");
		String name = input.next();
		System.out.print("����:");
		int age = input.nextInt();
		System.out.print("��ȭ��ȣ:");
		int call_num = input.nextInt();
		System.out.print("���� ��� ��ȣ:");
		int password = input.nextInt();
		System.out.println("���ϵ帳�ϴ�!! ���������� ��ϵǼ̽��ϴ�.");
	}
	public static void Delmember() {  
		Scanner input = new Scanner(System.in);
		System.out.println("");
		System.out.println("������ ����� �Է����ּ���");
		String del_member = input.next();
		System.out.println("��й�ȣ�� �Է��� �ּ���");
		int del_password = input.nextInt();
		System.out.println(del_member+"���� �����Ǿ����ϴ�.");
	}
	public static void Viewmember() { //������
		}
		
	public static void Selectmember() { //������
}

}