import java.util.ArrayList;
import java.util.Scanner;

import Member.AdultMember;
import Member.ChildMember;
import Member.Member;

public class MemberManager {
	ArrayList<Member> members = new ArrayList<Member>();
	Scanner input;
	
	MemberManager(Scanner input){
		this.input = input;
	}
	
	public void Addmember() {
		int kind =0;
		Member member;	
		//멤버를 받음
		int n = 0;
		//나이 값을 입력받아 0~20 이면 kind = 1 그 외는 kind=2로 저장
		System.out.println("나이를 입력해주세요");
		n = input.nextInt();
		if (n < 20 && n>0) {
			kind = 1;
		}
		else {
			kind = 2 ;
		}
		//kind = 1 이면 아이 , kind = 2이면 어른으로 저장
			if (kind == 1) {
				member = new ChildMember();
				member.getUserInput(input);
				members.add(member);
		}
			else if (kind ==2) {
				member = new AdultMember();
				member.getUserInput(input);
				members.add(member);
		}
			else {
		}
		}
	
	//멤버를 삭제하는 메소드
	public void Delmember() {  
		//삭제할 멤버를 고른 뒤
		System.out.println("");		
		System.out.println("삭제할 멤버를 입력해주세요");
		String del_member = input.next();
		//비밀번호를 입력받고 비밀번호가 맞으면 멤버 삭제
		for (int i=0 ; i<members.size(); i++) {
			if (members.get(i).getName().equals(del_member)) {
					System.out.println("삭제 하기 위해 비밀번호를 입력해 주세요");
						int del_password = input.nextInt();
						if (members.get(i).getPassword() ==del_password) {
							members.remove(i);
							System.out.println("멤버 "+del_member +"는 삭제되었습니다.");
							return ;
						}
						else {
							System.out.println("비밀번호가 다릅니다. 삭제 실패");
							break;
						}
			}
			else {		//멤버가 등록되지 않았으면 다시 돌아감
				System.out.println("찾으시는 멤버는 등록되지않았습니다.");
				return ;
			}
		}
	
	}
	public void Viewmembers() {		//비밀번호를 제외한 멤버의 정보를 보여줌
		for (int i=0 ; i<members.size(); i++) {
			members.get(i).printInfo();
		}
	}
	
	public void Selectmember() { 	//입출금을 관여하는 메소드
		System.out.println("입출금을 진행하고 싶으면 이름을 다시 입력해주세요");
		System.out.println("아니라면 아무 키나 눌러주세요");
		String Select_name = input.next();
		for (int i=0 ; i<members.size(); i++) {
			if(members.get(i).getName().equals(Select_name)) {
				int num1 = -1;
				while (num1 != 3) {
					System.out.println("***원하시는 작업을 선택해주세요***");
					System.out.println("");
					System.out.println("1. 선택한 멤버에 입금하기");
					System.out.println("2. 선택한 멤버에서 출금하기");
					System.out.println("3. 취소하고 메뉴로 돌아가기.");
					num1 = input.nextInt();
					//계좌에 입출금 한 후 남은 잔액을 나타내는 저장소로 totalmoney 만듬
					int totalmoney = members.get(i).getBudget_money();
					switch (num1) {
					case 1:
						System.out.println("얼마를 입금하시겠습니까?");
						System.out.println("현재 잔액: " + members.get(i).getBudget_money());
						
						int inputmoney ;
						inputmoney  = input.nextInt();
						
						totalmoney += inputmoney;
						members.get(i).setBudget_money(totalmoney);
						System.out.println(inputmoney+"원 입금되었습니다.");
						System.out.println("잔액:"+members.get(i).getBudget_money());
						continue;
						
					case 2:
						System.out.println("잔액 :" + members.get(i).getBudget_money()+"원");
						System.out.println("출금 금액: ");
						int outputmoney ;
						outputmoney = input.nextInt();
	
						totalmoney -= outputmoney;
						members.get(i).setBudget_money(totalmoney);
						System.out.println(outputmoney+"원 출금 되었습니다.");
						System.out.println("잔액:"+ members.get(i).getBudget_money()+"원");
						continue;
						
					case 3:	
						System.out.println("본 메뉴 화면으로 돌아갑니다.");
					}
				
					}
					
				}break;
		}		
		}
		
	}


