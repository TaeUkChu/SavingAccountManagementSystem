import java.util.Scanner;

public class MemberManager {
	Member member;
	Scanner input;
	
	MemberManager(Scanner input){
		this.input = input;
	}	
	
	public void Addmember() {
		member = new Member();
		System.out.println("�߰��� ��� ������ �Է����ּ���");	//�̸�,����,��ȭ��ȣ,���º�й�ȣ�� �Է¹���. �迭�� �����ϰ������ ���� x
		System.out.print("�̸�:");
		member.name = input.next();
		System.out.print("����:");
		member.age = input.nextInt();
		System.out.print("��ȭ��ȣ:");
		member.call_number = input.next();
		System.out.print("���� ��� ��ȣ:");
		member.password = input.nextInt();
		System.out.println("���ϵ帳�ϴ�!! ���������� ��ϵǼ̽��ϴ�.");
		member.budget_money = 0;
	}
	public void Delmember() {  

		System.out.println("");		//����� �迭�� ���� ����� ���� x
		System.out.println("������ ����� �Է����ּ���");
		System.out.println("���� ��ϵ� �̸�:"+member.name);
		String del_member = input.next();
		if (del_member == null) {
			System.out.println("����� �������� �ʽ��ϴ�.");
			return;
		}
		else if (member.name.equals(del_member)) {
		System.out.println(del_member+"�� �����ϽǰŶ��");
		System.out.println("��й�ȣ�� �Է��� �ּ���");
			int del_password = input.nextInt();
			if (member.password ==del_password) {
				System.out.println(del_member+"���� �����Ǿ����ϴ�.");
				member = null;
				return;
		}
			else {
			System.out.println("��й�ȣ�� �ٸ��ϴ�. ���� ����");
		}
	}
	}
	
	public void Viewmember() { 
			System.out.println(member.name);
		}
	public void Selectmember() { 
		System.out.println("���� ������ ��������� �̸��� �ٽ� �Է����ּ���");
		String Select_name = input.next();
		member.printInfo();
}
	public void trade() {
		System.out.println("�߰� �޴��� ����ּ���(1~3)");  //�ش� ����� ���� ���� ���� �޴��� �� �� ���� (���� ������)
		System.out.println("");
		System.out.println("3-1. ������ ����� �Ա��ϱ�");
		System.out.println("3-2. ������ ������� ����ϱ�");
		System.out.println("3-3. ����ϰ� �޴��� ���ư���.");
	}

}
