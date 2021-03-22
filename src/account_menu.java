import java.util.Scanner;

public class account_menu {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 0;
		
		while(num<4) {
		System.out.println("");
		System.out.println("****저축 계좌 관리 시스템에 오신 것을 환영합니다****");
		
		System.out.println("1.멤버 추가하기.");
		System.out.println("2.멤버 삭제하기.");
		System.out.println("3.멤버 조회하기.");
		System.out.println("4.종료하기");
		
		System.out.println("*********원하시는 메뉴를 선택해 주세요*********");
		num = input.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("추가할 멤버 정보를 입력해주세요");
			System.out.print("이름:");
			String name = input.next();
			System.out.print("나이:");
			int age = input.nextInt();
			System.out.print("전화번호:");
			int call_num = input.nextInt();
			System.out.print("계좌 비밀 번호:");
			int password = input.nextInt();
			System.out.println("축하드립니다!! 성공적으로 등록되셨습니다.");
			continue;
		case 2:
			System.out.println("삭제할 멤버를 입력해주세요");
			String del_member = input.next();
			System.out.println(del_member+"님은 삭제되었습니다.");
			continue;
		case 3:
			System.out.println("추가 메뉴를 골라주세요(1~3)");
			System.out.println("");
			System.out.println("3-1. 선택한 멤버에 입금하기");
			System.out.println("3-2. 선택한 멤버에서 출금하기");
			System.out.println("3-3. 취소하고 메뉴로 돌아가기.");
			continue;
		case 4:
			System.out.println("시스템이 종료되었습니다. 바이바이~");
			break;
		}
	}
	}
}
