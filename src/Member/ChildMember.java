package Member;

import java.util.Scanner;
//Member 클래스의 자식 클래스를 ChildMember로 정함
public class ChildMember extends Member {
	
	public ChildMember(MemberKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {	//메소드 오버라이딩
		System.out.println("추가할 (아이)멤버 정보를 입력해주세요");	
		setMemberName(input);
		age = this.getAge();	//age는 앞에 질문에서 이미 물어봤으므로 얻어오기만 하면 됨
		// 전화번호를 받을지 말지 선택하는 루프문
		char ans = 'x';
		while (ans != 'y' && ans !='n') {
			System.out.println("전화번호가 있으신가요? (y/n)");
			ans = input.next().charAt(0);
			if (ans =='y') {
				setMemberCall_number(input);
				break;
			}
			else if(ans =='n') {
				this.setCall_number(null);
				break;
			}
			else {
				System.out.println("y,n 중에서 골라주세요");
			}
		}
		setMemberPassword(input);
		System.out.println("축하드립니다!! 성공적으로 등록되셨습니다.");
	}
	public void printInfo() {
		String skind = getKindString();
			System.out.println("연령대: "+skind+"이름: "+name+" 나이: "+age+" 전화번호: "+call_number);
	}

	@Override
	public void SetAddMoney(MemberInput member, Scanner input) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SetMinusMoney(MemberInput member, Scanner input) {
		// TODO Auto-generated method stub
		
	}



	
}
