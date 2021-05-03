package Member;		//멤버....

import java.util.Scanner;

public class Member {
	protected MemberKind kind = MemberKind.Adult;
	
	protected String name;
	protected int age;
	protected String call_number;
	protected int password;
	protected int budget_money;		//계좌 잔고 추가
	protected int dept_money;		//빚진 돈 추가
		
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
		//이름 나이 전화번호 비밀번호 계좌잔고를 받음
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
				skind = "어른";
				break;
			case Child:
				skind = "아이";
				break;
			case Oldman:
				skind = "노인";
				break;
			default:
			}
				System.out.println("연령대:"+skind+"이름: "+name+" 나이: "+age+" 전화번호: "+call_number);
		}
		
		public void getUserInput(Scanner input) {
			System.out.println("추가할 멤버 정보를 입력해주세요");	
			System.out.print("이름:");
			String name = input.next();
			this.setName(name);
			System.out.print("나이:");
			int age = input.nextInt();
			this.setAge(age);
			System.out.print("전화번호:");
			String call_number = input.next();
			this.setCall_number(call_number);
			System.out.print("계좌 비밀 번호:");
			int password = input.nextInt();
			this.setPassword(password);
			System.out.println("축하드립니다!! 성공적으로 등록되셨습니다.");
			int budget_money = 0;
			this.setBudget_money(budget_money);
		}
}
