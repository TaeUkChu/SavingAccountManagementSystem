
public class Member {
		
		String name;
		int age;
		String call_number;
		int password;
		
		int budget_money;		//���� �ܰ� �߰�
		
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
			public void printInfo() {
				System.out.println("�̸�: "+name+" ����: "+age+" ��ȭ��ȣ: "+call_number);
			
		}
}
