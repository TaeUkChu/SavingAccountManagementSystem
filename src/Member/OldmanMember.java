package Member;

import java.util.Scanner;

public class OldmanMember extends Member{
	
	//���� ��� �޼ҵ� �����ε�
	public void heritage() {
		System.out.println(this.getName()+"���� ����� ���� ������ �ͼӵ� ���Դϴ�");
	}
	public void heritage(String name) {
		System.out.println(this.getName()+"���� ����� ���� " + name +" �� ��ӵ� ���Դϴ�");
	}
	
	public OldmanMember(MemberKind kind) {
		super(kind);
	}
	protected String S_call_number;
	protected String son;
	
	public String getS_call_number() {
		return S_call_number;
	}
	public void setS_call_number(String S_call_number) {
		this.S_call_number = S_call_number;
	}
	
	public void getUserInput(Scanner input) {		//�޼ҵ� �������̵�
		System.out.println("�߰��� (����)��� ������ �Է����ּ���");	
		setMemberName(input);
		age = this.getAge();	//age�� �տ� �������� �̹� ��������Ƿ� �����⸸ �ϸ� ��
		setMemberCall_number(input);
		char ans = 'x';		
		while (ans != 'y' && ans !='n') {			//�ڳ� ���θ� ��� �� �ڳడ ������ �ڳ� ��ȭ��ȣ�� ���� ����
			System.out.println("�ڳడ �����Ű���? (y/n)");
			ans = input.next().charAt(0);
			if (ans =='y') {
				System.out.println("�ڳ��� �̸���?");
				String son = input.next();
				System.out.print("�ڳ��� ��ȭ��ȣ : ");
				String S_call_number = input.next();
				this.setS_call_number(S_call_number);
				heritage(son);		//����� ���� ���� ���� �ڳ࿡�� ��ӵ� 
				break;
			}
			else if(ans =='n') {
				this.setCall_number(null);
				heritage();		//�ڳడ �����Ƿ� ����� ���� ������ �ͼӵ�
				break;
			}
			else {
				System.out.println("y,n �߿��� ����ּ���");
			}
		}
		setMemberPassword(input);
		System.out.println("���ϵ帳�ϴ�!! ���������� ��ϵǼ̽��ϴ�.");
	}
	public void printInfo() {		//�޼ҵ� �������̵�
		String skind = getKindString();
			System.out.println("���ɴ�: "+skind+"�̸�: "+name+" ����: "+age +"��ȭ ��ȣ:" + call_number + "�ڳ��� ��ȭ��ȣ:" + (S_call_number)+"\n���� �ܾ�:"+ budget_money);
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