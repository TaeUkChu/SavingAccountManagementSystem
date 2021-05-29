import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

import Member.AdultMember;
import Member.ChildMember;
import Member.MemberInput;
import Member.MemberKind;
import Member.OldmanMember;

public class MemberManager implements Serializable	{
	
	
	public int trycount = 1;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8314359235640816360L;
	
	ArrayList<MemberInput> members = new ArrayList<MemberInput>();
	transient Scanner input;	//저장하고싶지않다.
	MemberManager(Scanner input){
		this.input = input;
	}
	
	public void Addmember() {
		MemberInput memberInput;		//멤버를 받음
		int n = 0;
		//나이 값을 입력받아 0~20 이면 kind = 1 ,20~60은 kind=2로 저장 60~는 kind=3로 저장
		System.out.println("나이를 입력해주세요");
		
		n = input.nextInt();
		int kind = whatkind(n);
		//kind = 1 이면 아이 , kind = 2 이면 어른, kind = 3이면 노인으로 저장
			if (kind == 1) {
				memberInput = new ChildMember(MemberKind.Child);
				SetMember(memberInput ,input, n);
		}
			
			else if (kind ==2) {
				memberInput = new AdultMember(MemberKind.Adult);
				SetMember(memberInput ,input, n);
		}
			else if (kind == 3){
				memberInput = new OldmanMember(MemberKind.Oldman);
				SetMember(memberInput ,input, n);
		}
	}
	
	//멤버를 삭제하는 메소드
	public void Delmember() {  
		System.out.println("■■■삭제 관리 프로그램입니다.■■■");		
		System.out.println("■삭제할 【멤버 번호】를 입력해주세요■");
		int Select_number = input.nextInt();
		//비밀번호를 입력받고 비밀번호가 맞으면 멤버 삭제
		int index = FindIndex(Select_number);
		RMPassword(index);
		}
	
	public int FindIndex(int Select_number) {
		int index = -1;
		for (int i=0 ; i<members.size(); i++) {
			if(i == Select_number) {
				index = Select_number;
				break;
			}
		}
		return index;
	}
	
public int RMPassword(int index) {		//삭제시 패스워드
	if(index >= 0 ) {
		int del_password = -1;
		while(del_password != 0) {		
			
		System.out.println("■삭제 하기 위해 【비밀번호】를 입력해 주세요■");
		System.out.println("■■삭제 관리를 나가시려면 【0】를 눌러주세요■■");
		del_password = input.nextInt();
		MemberInput member = members.get(index);
			if (member.getPassword() == del_password) {
					System.out.println("멤버 【"+member.getName() +"】는 삭제되었습니다.");	
					members.remove(index); 
					//logger.log(member.getName()+"멤버 삭제 완료.");
					trycount = 1;
					break;
				}
				else {
					System.out.println("비밀번호가 다릅니다. 삭제 실패");
					//logger.log(member.getName()+"멤버 삭제 실패. 시도 횟수:"+trycount);
					trycount++;
					continue;
		}
	}
		return 0;
		
	}
	else {
		System.out.println("멤버가 존재하지 않습니다.");
		return -1;
	}
	}
	
	public void Viewmembers() {		//비밀번호를 제외한 멤버의 정보를 보여줌
		if(members.size() > 0) {
			System.out.println("★★★★★★★★조회된 멤버★★★★★★★ ");
		for (int i=0 ; i<members.size(); i++) {
			System.out.print(i+").");
			members.get(i).printInfo();
		}
		System.out.println("★★★★★★★★★★★★★★★★★");
	}
		else {
			System.out.println("저장된 멤버가 존재하지 않습니다.");
		}
		
	}
	
	public void Selectmember() { 	//입출금을 관여하는 메소드
			System.out.println("입출금을 진행하고 싶으면 멤버의 번호를 입력해 주세요.");
			System.out.println("아니라면 번호 외 아무 키나 눌러주세요");
			int Select_number = input.nextInt();
			int index = FindIndex( Select_number);
			MemberInput member = members.get(index);
			int num1 = -1;
				while (num1 != 3) {
					ShowSelectmenu();
					num1 = input.nextInt();
					switch (num1) {
					case 1:
						SetAddMoney(member,input);
						continue;
					case 2:
					//	logger.log("출금 시도.");
						SetMinusMoney(member, input);
						continue;
					case 3:	
						System.out.println("본 메뉴 화면으로 돌아갑니다.");
						trycount = 1;
						break;
					}
				}
			}
	
	
	public static void ShowSelectmenu() {
		System.out.println("***원하시는 작업을 선택해주세요***");
		System.out.println("");
		System.out.println("1. 선택한 멤버에 입금하기");
		System.out.println("2. 선택한 멤버에서 출금하기");
		System.out.println("3. 취소하고 메뉴로 돌아가기.");
	}
	//계좌에 입출금 한 후 남은 잔액을 나타내는 저장소로 totalmoney 만듬
	public void SetAddMoney(MemberInput member, Scanner input) {
		 
		int totalmoney = member.getBudget_money();
		System.out.println("얼마를 입금하시겠습니까?");
		System.out.println("현재 잔액: " + member.getBudget_money());

		int inputmoney ;
		inputmoney  = input.nextInt();

		totalmoney += inputmoney;
		member.setBudget_money(totalmoney);
		System.out.println(inputmoney+"원 입금되었습니다.");
		System.out.println("잔액:"+member.getBudget_money());
		//logger.log(member.getName()+"님"+member.getBudget_money() +"원 입금 완료.");
	}
	public void SetMinusMoney(MemberInput member, Scanner input) {
	
		int totalmoney = member.getBudget_money();
		System.out.println("출금 하기 위해 비밀번호를 입력해 주세요");	//출금 비밀번호를 입력받고 맞을 시 출금해줌
		int cor_password = input.nextInt();
		
		if (member.getPassword() ==cor_password) {
			trycount =1 ;
			System.out.println("잔액 :" + member.getBudget_money()+"원");
			System.out.println("출금 금액: ");
			int outputmoney ;
			outputmoney = input.nextInt();
			totalmoney -= outputmoney;
			
			if(totalmoney < 0) {
				System.out.println("잔액 부족: "+totalmoney);
				System.out.println("출금 실패했습니다.");
			//	logger.log(member.getName()+"님 출금 실패.\n이유: 잔액 부족");
			}
			else {
				member.setBudget_money(totalmoney);
				System.out.println(outputmoney+"원 출금 되었습니다.");
				System.out.println("잔액:"+ member.getBudget_money()+"원");
			//	logger.log(member.getName()+"님 "+outputmoney +"출금 완료");
			}
		}
		else {
			System.out.println("비밀번호가 다릅니다.");
			System.out.println("출금하시려면 다시 시도해주세요.");
			//logger.log(member.getName()+"님 출금 실패. 시도 횟수: "+trycount+"번");
			trycount++;
		}
	}
	public void SetMember(MemberInput member, Scanner input, int n) {
		member.setAge(n);
		member.getUserInput(input);
		members.add(member);
	}
	
	public int whatkind(int n) {
		int kind = 0;
		if (n < 20 && n>0) {
			kind = 1;
		}
		else if (n>20 && n<60){
			kind = 2 ;
		}
		else if (n >= 60) {
			kind = 3;
		}
		return kind;
	}
}
