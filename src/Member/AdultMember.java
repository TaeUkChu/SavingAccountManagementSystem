package Member;

import java.util.Scanner;
//Member Ŭ������ �ڽ� Ŭ������ ChildMember�� ����
public class AdultMember extends Member implements MemberInput {
	
	public AdultMember(MemberKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {	//�޼ҵ� �������̵�
		System.out.println("�߰��� (����)��� ������ �Է����ּ���");
		System.out.print("�̸�:");
		String name = input.next();
		this.setName(name);
		//���� �� ���̰� 20���̻� 60�� �̸��� ����� ���¿� 5000�� ����
		System.out.println("���̰� 20�� �̻� 60�� �̸� �����̽ö�� �ű� ���¿� 5000���� �Ա��ص帳�ϴ�.");	
		//���̰� 30�� �̻��̸� budget�� 5000�� �־��ִ� ������
		age = this.getAge();	//age�� �տ� �������� �̹� ��������Ƿ� �����⸸ �ϸ� ��
		if(age >= 30) {
			System.out.println("���̰� "+ age +" �� 30�� �̻��̽ñ���");
			
			int budget_money = 5000;
			this.setBudget_money(budget_money);
			System.out.println("���� �ܰ�: "+ this.getBudget_money());
		}
		else {
			int budget_money = 0;
			this.setBudget_money(budget_money);
		}
		System.out.print("��ȭ��ȣ:");
		String call_number = input.next();
		this.setCall_number(call_number);
		System.out.print("���� ��� ��ȣ:");
		int password = input.nextInt();
		this.setPassword(password);
		System.out.println("���ϵ帳�ϴ�!! ���������� ��ϵǼ̽��ϴ�.");
	}
	
	public void printInfo() {
		String skind = "none";
		switch(this.kind) {
		case Adult:
			skind = "�";
			break;
		case Child:
			skind = "����";
			break;
		case Oldman:
			skind = "����";
			break;
		default:
		}
			System.out.println("���ɴ�:"+skind+"�̸�: "+name+" ����: "+age+" ��ȭ��ȣ: "+call_number);
	}
}
