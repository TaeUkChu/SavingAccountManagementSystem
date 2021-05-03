package Member;		//���....

import java.util.Scanner;

public class Member {
	protected MemberKind kind = MemberKind.Adult;
	
	protected String name;
	protected int age;
	protected String call_number;
	protected int password;
	protected int budget_money;		//���� �ܰ� �߰�
	protected int dept_money;		//���� �� �߰�
		
		public Member() {
		}
		
		public Member(MemberKind kind) {
			this.kind = kind;
		}
		
		public Member(String name, int age, int password) {
			this.name = name;
			this.age = age;
			this.password = password;
		}
		
		public Member(MemberKind kind, String name, int age, String call_number, int password) {
			this.kind = kind;
			this.name = name;
			this.age = age;
			this.call_number = call_number;
			this.password = password;
		}
		//�̸� ���� ��ȭ��ȣ ��й�ȣ �����ܰ� ����
		public Member(MemberKind kind, String name, int age, String call_number, int password,int budget_money,int dept_money) {	
			this.kind = kind;
			this.name = name;
			this.age = age;
			this.call_number = call_number;
			this.password = password;
			this.budget_money = budget_money;
			this.dept_money = dept_money;
		}
		
		public MemberKind getKind() {
			return kind;
		}

		public void setKind(MemberKind kind) {
			this.kind = kind;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getCall_number() {
			return call_number;
		}

		public void setCall_number(String call_number) {
			this.call_number = call_number;
		}

		public int getPassword() {
			return password;
		}

		public void setPassword(int password) {
			this.password = password;
		}

		public int getBudget_money() {
			return budget_money;
		}

		public void setBudget_money(int budget_money) {
			this.budget_money = budget_money;
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
		
		public void getUserInput(Scanner input) {
			System.out.println("�߰��� ��� ������ �Է����ּ���");	
			System.out.print("�̸�:");
			String name = input.next();
			this.setName(name);
			System.out.print("����:");
			int age = input.nextInt();
			this.setAge(age);
			System.out.print("��ȭ��ȣ:");
			String call_number = input.next();
			this.setCall_number(call_number);
			System.out.print("���� ��� ��ȣ:");
			int password = input.nextInt();
			this.setPassword(password);
			System.out.println("���ϵ帳�ϴ�!! ���������� ��ϵǼ̽��ϴ�.");
			int budget_money = 0;
			this.setBudget_money(budget_money);
		}
}
