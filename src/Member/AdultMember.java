package Member;

import java.util.Scanner;
//Member 클래스의 자식 클래스를 ChildMember로 정함
public class AdultMember extends Member implements MemberInput {
	
	public AdultMember(MemberKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {	//메소드 오버라이딩
		System.out.println("추가할 (성인)멤버 정보를 입력해주세요");
		System.out.print("이름:");
		String name = input.next();
		this.setName(name);
		//성인 중 나이가 20세이상 60세 미만인 사람은 계좌에 5000원 쏴줌
		System.out.println("나이가 20세 이상 60세 미만 성인이시라면 신규 계좌에 5000원을 입금해드립니다.");	
		//나이가 30세 이상이면 budget에 5000원 넣어주는 루프문
		age = this.getAge();	//age는 앞에 질문에서 이미 물어봤으므로 얻어오기만 하면 됨
		if(age >= 30) {
			System.out.println("나이가 "+ age +" 로 30세 이상이시군요");
			
			int budget_money = 5000;
			this.setBudget_money(budget_money);
			System.out.println("현재 잔고: "+ this.getBudget_money());
		}
		else {
			int budget_money = 0;
			this.setBudget_money(budget_money);
		}
		System.out.print("전화번호:");
		String call_number = input.next();
		this.setCall_number(call_number);
		System.out.print("계좌 비밀 번호:");
		int password = input.nextInt();
		this.setPassword(password);
		System.out.println("축하드립니다!! 성공적으로 등록되셨습니다.");
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
}
