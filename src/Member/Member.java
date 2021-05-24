package Member;		//멤버....

import java.io.Serializable;
import java.util.Scanner;

import exception.NameFormatException;
import exception.PasswordFormatException;

public abstract class Member implements MemberInput, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -240069854623819954L;

	protected MemberKind kind = MemberKind.Adult;
	
	protected String name;
	protected int age;
	protected String call_number;
	protected int password;
	protected int budget_money;		//계좌 잔고 추가
		
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
		public Member(MemberKind kind, String name, int age, String call_number, int password,int budget_money) {	
			this.kind = kind;
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

		public void setName(String name) throws NameFormatException{
				int num = name.length();
				if (num<2 || num >4 ){
					throw new NameFormatException();
				}
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

		public void setPassword(int password) throws PasswordFormatException {
			if(password <1000 || password > 10000) {
				throw new PasswordFormatException();
			}
			this.password = password;
		}

		public int getBudget_money() {
			return budget_money;
		}

		public void setBudget_money(int budget_money) {
			this.budget_money = budget_money;
		}
		
		public abstract void printInfo();
		
		public String getKindString() {
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
			return skind;
		}
/*public int IndexName(String name) {
	String a = "";
	int sum=0;
	for (int i = 0; i<name.length(); i++ ) {
		a = name.substring(i,i+1);
		for(int j = 0 ; j<10; j++) {
			if(a.equals("i")) {
				sum+=1;
		}
		}
	}z
	return sum;
}*/
		
		public void setMemberName(Scanner input) {
			String name = "0";
			int num = name.length();
			while(num<2 || num >4) {
				System.out.println("이름을 입력해 주세요:");
				name = input.next();
				num = name.length();
				try {
					this.setName(name);
				}catch(NameFormatException e) {
					System.out.println("!(이름 설정 오류)!");
					System.out.println("이름은 최대 두자리부터 네자리 까지입니다..");
				}
			}
		}

public void setMemberCall_number(Scanner input) {
	System.out.print("전화번호:");
	String call_number = input.next();
	this.setCall_number(call_number);
}
public void setMemberPassword(Scanner input) {
	int password = 0;
	while(password <1000 || password > 10000 ) {
			System.out.print("계좌 비밀 번호:");
		  password = input.nextInt();
		try { 
			this.setPassword(password);
		} catch (PasswordFormatException e) {
			System.out.println("!(비밀번호 설정 오류)!");
			System.out.println("숫자를 4자리 수로만 입력해주세요.");
		}
	}
}
	
}
