package Member;

import java.util.Scanner;
//Member Ŭ������ �ڽ� Ŭ������ ChildMember�� ����
public class AdultMember extends Member {
	
	public AdultMember(MemberKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {	//�޼ҵ� �������̵�
		System.out.println("�߰��� (����)��� ������ �Է����ּ���");
		setMemberName(input);
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
		setMemberCall_number(input);
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
