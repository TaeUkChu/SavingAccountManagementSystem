package Member;		//¸â¹ö....

import java.util.Scanner;

public abstract class Member {
	protected MemberKind kind = MemberKind.Adult;
	
	protected String name;
	protected int age;
	protected String call_number;
	protected int password;
	protected int budget_money;		//°èÁÂ ÀÜ°í Ãß°¡
	protected int dept_money;		//ºúÁø µ· Ãß°¡
		
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
		//ÀÌ¸§ ³ªÀÌ ÀüÈ­¹øÈ£ ºñ¹Ğ¹øÈ£ °èÁÂÀÜ°í¸¦ ¹ŞÀ½
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
		
		public abstract void printInfo();
}
