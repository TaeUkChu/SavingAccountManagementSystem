import java.util.Scanner;

public class MemberManager {
	Member member;
	Scanner input;
	
	MemberManager(Scanner input){
		this.input = input;
	}	
	
	public void Addmember() {
		member = new Member();
		System.out.println("추가할 멤버 정보를 입력해주세요");	//이름,나이,전화번호,계좌비밀번호를 입력받음. 배열로 저장하고싶은데 실행 x
		System.out.print("이름:");
		member.name = input.next();
		System.out.print("나이:");
		member.age = input.nextInt();
		System.out.print("전화번호:");
		member.call_number = input.next();
		System.out.print("계좌 비밀 번호:");
		member.password = input.nextInt();
		System.out.println("축하드립니다!! 성공적으로 등록되셨습니다.");
		member.budget_money = 0;
	}
	public void Delmember() {  

		System.out.println("");		//멤버의 배열이 없어 제대로 실행 x
		System.out.println("삭제할 멤버를 입력해주세요");
		System.out.println("현재 등록된 이름:"+member.name);
		String del_member = input.next();
		if (del_member == null) {
			System.out.println("멤버가 존재하지 않습니다.");
			return;
		}
		else if (member.name.equals(del_member)) {
		System.out.println(del_member+"를 삭제하실거라면");
		System.out.println("비밀번호를 입력해 주세요");
			int del_password = input.nextInt();
			if (member.password ==del_password) {
				System.out.println(del_member+"님은 삭제되었습니다.");
				member = null;
				return;
		}
			else {
			System.out.println("비밀번호가 다릅니다. 삭제 실패");
		}
	}
	}
	
	public void Viewmember() { 
			System.out.println(member.name);
		}
	public void Selectmember() { 
		System.out.println("세부 정보를 보고싶으면 이름을 다시 입력해주세요");
		String Select_name = input.next();
		member.printInfo();
}
	public void trade() {
		System.out.println("추가 메뉴를 골라주세요(1~3)");  //해당 멤버에 계좌 세부 내용 메뉴를 고를 수 있음 (현재 구상중)
		System.out.println("");
		System.out.println("3-1. 선택한 멤버에 입금하기");
		System.out.println("3-2. 선택한 멤버에서 출금하기");
		System.out.println("3-3. 취소하고 메뉴로 돌아가기.");
	}

}
