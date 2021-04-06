
public class Member {
		
		String name;
		int age;
		String call_number;
		int password;
		
		int budget_money;		//계좌 잔고 추가
		
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
		public Member(String name, int age, String call_number, int password,int budget_money) {		//이름 나이 전화번호 비밀번호 계좌잔고를 받음
			this.name = name;
			this.age = age;
			this.call_number = call_number;
			this.password = password;
			this.budget_money = budget_money;
		}
			public void printInfo() {
				System.out.println("이름: "+name+" 나이: "+age+" 전화번호: "+call_number);
			
		}
}
