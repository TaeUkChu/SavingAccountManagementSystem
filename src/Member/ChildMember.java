package Member;

import java.util.Scanner;
//Member Ŭ������ �ڽ� Ŭ������ ChildMember�� ����
public class ChildMember extends Member {	

	public void getUserInput(Scanner input) {
		System.out.println("�߰��� (����)��� ������ �Է����ּ���");	
		System.out.print("�̸�:");
		String name = input.next();
		this.setName(name);
		System.out.print("����:");
		int age = input.nextInt();
		this.setAge(age);
		// ��ȭ��ȣ�� ������ ���� �����ϴ� ������
		char ans = 'x';
		while (ans != 'y' && ans !='n') {
			System.out.println("��ȭ��ȣ�� �����Ű���? (y/n)");
			ans = input.next().charAt(0);
			if (ans =='y') {
				System.out.print("��ȭ��ȣ : ");
				String call_number = input.next();
				this.setCall_number(call_number);
				break;
			}
			else if(ans =='n') {
				this.setCall_number("");
				break;
			}
			else {

			}
		}
		System.out.print("���� ��� ��ȣ:");
		int password = input.nextInt();
		this.setPassword(password);
		System.out.println("���ϵ帳�ϴ�!! ���������� ��ϵǼ̽��ϴ�.");
	}
}