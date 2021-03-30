import java.util.Scanner;

public class account_menu {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 0;
		
		while(num<4) {		
		System.out.println("");
		System.out.println("****저축 계좌 관리 시스템에 오신 것을 환영합니다****"); 	//기본 메뉴 세팅
		
		System.out.println("1.멤버 추가하기.");
		System.out.println("2.멤버 삭제하기.");
		System.out.println("3.멤버 조회하기.");
		System.out.println("4.종료하기");
		
		System.out.println("*********원하시는 메뉴를 선택해 주세요*********");
		num = input.nextInt();		//메뉴번호를 입력받음
		
		switch(num) {
		case 1:	//1번 메뉴를 골랐을 때
			Addmember();  //멤버 정보를 추가
			continue;
		
		case 2:	//2번을 고를 경우 삭제받을 멤버를 입력받고 삭제시켜줌			
			Delmember();
			continue;
		
		case 3:		//3번을 고를 경우 현재 등록된 멤버를 보여주고 선택하게 함. 
			Viewmember();
			Selectmember();  //(구상 중)
			System.out.println("추가 메뉴를 골라주세요(1~3)");  //해당 멤버에 계좌 세부 내용 메뉴를 고를 수 있음 (현재 구상중)
			System.out.println("");
			System.out.println("3-1. 선택한 멤버에 입금하기");
			System.out.println("3-2. 선택한 멤버에서 출금하기");
			System.out.println("3-3. 취소하고 메뉴로 돌아가기.");
			continue;
		
		case 4:		//4번을 고를 경우 while 루프가 끝나면서 바이바이~
			System.out.println("시스템이 종료되었습니다. 바이바이~");
			break;
		}
	}
	}
	public static void Addmember() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("추가할 멤버 정보를 입력해주세요");	//이름,나이,전화번호,계좌비밀번호를 입력받음. 배열로 저장하고싶은데 실행 x
		System.out.print("이름:");
		String name = input.next();
		System.out.print("나이:");
		int age = input.nextInt();
		System.out.print("전화번호:");
		int call_num = input.nextInt();
		System.out.print("계좌 비밀 번호:");
		int password = input.nextInt();
		System.out.println("축하드립니다!! 성공적으로 등록되셨습니다.");
	}
	public static void Delmember() {  
		Scanner input = new Scanner(System.in);
		System.out.println("");
		System.out.println("삭제할 멤버를 입력해주세요");
		String del_member = input.next();
		System.out.println("비밀번호를 입력해 주세요");
		int del_password = input.nextInt();
		System.out.println(del_member+"님은 삭제되었습니다.");
	}
	public static void Viewmember() { //구상중
		}
		
	public static void Selectmember() { //구상중
}

}