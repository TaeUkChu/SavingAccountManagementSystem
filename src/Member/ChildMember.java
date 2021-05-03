package Member;

import java.util.Scanner;
//Member Ŭ������ �ڽ� Ŭ������ ChildMember�� ����
public class ChildMember extends Member {
	
	public ChildMember(MemberKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {	//�޼ҵ� �������̵�
		System.out.println("�߰��� (����)��� ������ �Է����ּ���");	
		System.out.print("�̸�:");
		String name = input.next();
		this.setName(name);
		age = this.getAge();	//age�� �տ� �������� �̹� ��������Ƿ� �����⸸ �ϸ� ��
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
				System.out.println("y,n �߿��� ����ּ���");
			}
		}
		System.out.print("���� ��� ��ȣ:");
		int password = input.nextInt();
		this.setPassword(password);
		System.out.println("���ϵ帳�ϴ�!! ���������� ��ϵǼ̽��ϴ�.");
	}
}
