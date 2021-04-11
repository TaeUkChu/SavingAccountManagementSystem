package Member;

import java.util.Scanner;
//Member 클래스의 자식 클래스를 ChildMember로 정함
public class ChildMember extends Member {	

	public void getUserInput(Scanner input) {
		System.out.println("추가할 (아이)멤버 정보를 입력해주세요");	
		System.out.print("이름:");
		String name = input.next();
		this.setName(name);
		System.out.print("나이:");
		int age = input.nextInt();
		this.setAge(age);
		// 전화번호를 받을지 말지 선택하는 루프문
		char ans = 'x';
		while (ans != 'y' && ans !='n') {
			System.out.println("전화번호가 있으신가요? (y/n)");
			ans = input.next().charAt(0);
			if (ans =='y') {
				System.out.print("전화번호 : ");
				String call_number = input.next();
				this.setCall_number(call_number);
				break;
			}
			else if(ans =='n') {
				this.setCall_number("");
				break;
			}
			else {

			}
		}
		System.out.print("계좌 비밀 번호:");
		int password = input.nextInt();
		this.setPassword(password);
		System.out.println("축하드립니다!! 성공적으로 등록되셨습니다.");
	}
}
