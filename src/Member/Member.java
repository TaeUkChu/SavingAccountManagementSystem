package Member;		//���

import java.util.Scanner;

public class Member {
	protected MemberKind kind = MemberKind.Adult;
	protected String name;
	protected int age;
	protected String call_number;
	protected int password;
	protected int budget_money;		//���� �ܰ� �߰�
		
		public Member() {
		}
		
		public Member(String name, int age, int password) {
			this.name = name;
			this.age = age;
			this.password = password;
		}
		
		public Member(String name, int age, String call_number, int password) {
			this.name = name;
			this.age = age;
			this.call_number = call_number;
			this.password = password;
		}
		public Member(String name, int age, String call_number, int password,int budget_money) {		//�̸� ���� ��ȭ��ȣ ��й�ȣ �����ܰ� ����
			this.name = name;
			this.age = age;
			this.call_number = call_number;
			this.password = password;
			this.budget_money = budget_money;
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
				System.out.println("�̸�: "+name+" ����: "+age+" ��ȭ��ȣ: "+call_number);
			
		}
			
		public void getUserInput(Scanner input) {
			System.out.println("�߰��� ��� ������ �Է����ּ���");	//�̸�,����,��ȭ��ȣ,���º�й�ȣ�� �Է¹���. �迭�� �����ϰ������ ���� x
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
