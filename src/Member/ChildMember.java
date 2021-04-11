package Member;

import java.util.Scanner;

public class ChildMember extends Member {

	public void getUserInput(Scanner input) {
		System.out.println("추가할 (아이)멤버 정보를 입력해주세요");	//이름,나이,전화번호,계좌비밀번호를 입력받음. 배열로 저장하고싶은데 실행 x
		System.out.print("이름:");
		String name = input.next();
		this.setName(name);
		System.out.print("나이:");
		int age = input.nextInt();
		this.setAge(age);
		
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
