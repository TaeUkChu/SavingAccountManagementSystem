package Member;

import java.util.Scanner;
//Member Ŭ������ �ڽ� Ŭ������ ChildMember�� ����
public class ChildMember extends Member {
	
	public ChildMember(MemberKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {	//�޼ҵ� �������̵�
		System.out.println("�߰��� (����)��� ������ �Է����ּ���");	
		setMemberName(input);
		age = this.getAge();	//age�� �տ� �������� �̹� ��������Ƿ� �����⸸ �ϸ� ��
		// ��ȭ��ȣ�� ������ ���� �����ϴ� ������
		char ans = 'x';
		while (ans != 'y' && ans !='n') {
			System.out.println("��ȭ��ȣ�� �����Ű���? (y/n)");
			ans = input.next().charAt(0);
			if (ans =='y') {
				setMemberCall_number(input);
				break;
			}
			else if(ans =='n') {
				this.setCall_number(null);
				break;
			}
			else {
				System.out.println("y,n �߿��� ����ּ���");
			}
		}
		setMemberPassword(input);
		System.out.println("���ϵ帳�ϴ�!! ���������� ��ϵǼ̽��ϴ�.");
	}
	public void printInfo() {
		String skind = getKindString();
			System.out.println("���ɴ�: "+skind+"�̸�: "+name+" ����: "+age+" ��ȭ��ȣ: "+call_number);
	}

	@Override
	public void SetAddMoney(MemberInput member, Scanner input) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SetMinusMoney(MemberInput member, Scanner input) {
		// TODO Auto-generated method stub
		
	}



	
}
