package Member;

import java.util.Scanner;

public class OldmanMember extends Member implements MemberInput{
	
	//유산 상속 메소드 오버로딩
	public void heritage() {
		System.out.println(this.getName()+"님의 재산은 차후 국가에 귀속될 것입니다");
	}
	public void heritage(String name) {
		System.out.println(this.getName()+"님의 재산은 차후 " + name +" 에 상속될 것입니다");
	}
	
	public OldmanMember(MemberKind kind) {
		super(kind);
	}
	protected String S_call_number;
	
	public String getS_call_number() {
		return S_call_number;
	}
	public void setS_call_number(String S_call_number) {
		this.S_call_number = S_call_number;
	}
	
	public void getUserInput(Scanner input) {		//메소드 오버라이딩
		System.out.println("추가할 (노인)멤버 정보를 입력해주세요");	
		System.out.print("이름:");
		String name = input.next();
		this.setName(name);
		age = this.getAge();	//age는 앞에 질문에서 이미 물어봤으므로 얻어오기만 하면 됨
		System.out.print("전화번호:");
		String call_number = input.next();
		this.setCall_number(call_number);
		char ans = 'x';		
		while (ans != 'y' && ans !='n') {			//자녀 여부를 물어본 뒤 자녀가 있으면 자녀 전화번호도 같이 기입
			System.out.println("자녀가 있으신가요? (y/n)");
			ans = input.next().charAt(0);
			if (ans =='y') {
				System.out.println("자녀의 이름은?");
				String son = input.next();
				System.out.print("자녀의 전화번호 : ");
				String S_call_number = input.next();
				this.setS_call_number(S_call_number);
				heritage(son);		//재산은 차후 위에 적은 자녀에게 상속됨 
				break;
			}
			else if(ans =='n') {
				this.setCall_number("");
				heritage();		//자녀가 없으므로 재산은 차후 국가에 귀속됨
				break;
			}
			else {
				System.out.println("y,n 중에서 골라주세요");
			}
		}
		System.out.print("계좌 비밀 번호:");
		int password = input.nextInt();
		this.setPassword(password);
		System.out.println("축하드립니다!! 성공적으로 등록되셨습니다.");
	}
	public void printInfo() {		//메소드 오버라이딩
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
			System.out.println("연령대"+skind+"이름: "+name+" 나이: "+age +"전화 번호: "+ call_number +"자녀의 전화번호: "+ (S_call_number));
	}
	
	
}