package Member;

import java.util.Scanner;

public class AdultMember extends Member {
	
	public void getUserInput(Scanner input) {
		System.out.println("추가할 (성인)멤버 정보를 입력해주세요");	//이름,나이,전화번호,계좌비밀번호를 입력받음. 배열로 저장하고싶은데 실행 x
		System.out.print("이름:");
		String name = input.next();
		this.setName(name);
		System.out.print("나이:");
		int age = input.nextInt();
		this.setAge(age);
		System.out.println("나이가 30세 이상이시라면 신규 계좌에 5000원을 입금해드립니다.");
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
}
