package Member;

import java.util.Scanner;
//Member Ŭ������ �ڽ� Ŭ������ ChildMember�� ����
public class AdultMember extends Member {

	public void getUserInput(Scanner input) {
		System.out.println("�߰��� (����)��� ������ �Է����ּ���");	
		System.out.print("�̸�:");
		String name = input.next();
		this.setName(name);
		System.out.print("����:");
		int age = input.nextInt();
		this.setAge(age);
		//���� �� ���̰� 30���̻��� ����� ���¿� 5000�� ����
		System.out.println("���̰� 30�� �̻��̽ö�� �ű� ���¿� 5000���� �Ա��ص帳�ϴ�.");	
		//���̰� 30�� �̻��̸� budget�� 5000�� �־��ִ� ������
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
}
