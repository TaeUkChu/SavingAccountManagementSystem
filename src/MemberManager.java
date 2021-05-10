import java.util.ArrayList;
import java.util.Scanner;

import Member.AdultMember;
import Member.ChildMember;
import Member.Member;
import Member.MemberInput;
import Member.MemberKind;
import Member.OldmanMember;

public class MemberManager {
	
	ArrayList<MemberInput> members = new ArrayList<MemberInput>();
	Scanner input;

	MemberManager(Scanner input){
		this.input = input;
	}
	
	public void Addmember() {
		int kind =0;
		MemberInput memberInput;	
		//����� ����
		int n = 0;
		//���� ���� �Է¹޾� 0~20 �̸� kind = 1 ,20~60�� kind=2�� ���� 60~�� kind=3�� ����
		System.out.println("���̸� �Է����ּ���");
		n = input.nextInt();
		if (n < 20 && n>0) {
			kind = 1;
		}
		else if (n>20 && n<60){
			kind = 2 ;
		}
		else if (n>60) {
			kind = 3;
		}
		//kind = 1 �̸� ���� , kind = 2 �̸� �, kind = 3�̸� �������� ����
			if (kind == 1) {
				memberInput = new ChildMember(MemberKind.Child);
				memberInput.setAge(n);
				memberInput.getUserInput(input);
				members.add(memberInput);
		}
			
			else if (kind ==2) {
				memberInput = new AdultMember(MemberKind.Adult);
				memberInput.setAge(n);
				memberInput.getUserInput(input);
				members.add(memberInput);
		}
			else if (kind == 3){
				memberInput = new OldmanMember(MemberKind.Oldman);
				memberInput.setAge(n);
				memberInput.getUserInput(input);
				members.add(memberInput);
		}
		}
	
	//����� �����ϴ� �޼ҵ�
	public void Delmember() {  
		//������ ����� �� ��
		System.out.println("");		
		System.out.println("������ ����� �Է����ּ���");
		String del_member = input.next();
		//��й�ȣ�� �Է¹ް� ��й�ȣ�� ������ ��� ����
		for (int i=0 ; i<members.size(); i++) {
			MemberInput memberInput = members.get(i);
			if (memberInput.getName().equals(del_member)) {
					System.out.println("���� �ϱ� ���� ��й�ȣ�� �Է��� �ּ���");
						int del_password = input.nextInt();
						if (memberInput.getPassword() ==del_password) {
							members.remove(i);
							System.out.println("��� "+del_member +"�� �����Ǿ����ϴ�.");
							return ;
						}
						else {
							System.out.println("��й�ȣ�� �ٸ��ϴ�. ���� ����");
							break;
						}
			}
			else {		//����� ��ϵ��� �ʾ����� �ٽ� ���ư�
				System.out.println("ã���ô� ����� ��ϵ����ʾҽ��ϴ�.");
				return ;
			}
		}
	
	}
	public void Viewmembers() {		//��й�ȣ�� ������ ����� ������ ������
		for (int i=0 ; i<members.size(); i++) {
			members.get(i).printInfo();
		}
		
	}
	
	public void Selectmember() { 	//������� �����ϴ� �޼ҵ�
		System.out.println("������� �����ϰ� ������ �̸��� �ٽ� �Է����ּ���");
		System.out.println("�ƴ϶�� �ƹ� Ű�� �����ּ���");
		String Select_name = input.next();
		for (int i=0 ; i<members.size(); i++) {
			MemberInput memberInput = members.get(i);
			if(memberInput.getName().equals(Select_name)) {
				int num1 = -1;
				while (num1 != 3) {
					System.out.println("***���Ͻô� �۾��� �������ּ���***");
					System.out.println("");
					System.out.println("1. ������ ����� �Ա��ϱ�");
					System.out.println("2. ������ ������� ����ϱ�");
					System.out.println("3. ����ϰ� �޴��� ���ư���.");
					num1 = input.nextInt();
					//���¿� ����� �� �� ���� �ܾ��� ��Ÿ���� ����ҷ� totalmoney ����
					int totalmoney = memberInput.getBudget_money();

					switch (num1) {
					case 1:
						System.out.println("�󸶸� �Ա��Ͻðڽ��ϱ�?");
						System.out.println("���� �ܾ�: " + memberInput.getBudget_money());

						int inputmoney ;
						inputmoney  = input.nextInt();

						totalmoney += inputmoney;
						memberInput.setBudget_money(totalmoney);
						System.out.println(inputmoney+"�� �ԱݵǾ����ϴ�.");
						System.out.println("�ܾ�:"+memberInput.getBudget_money());
						continue;

					case 2:
						System.out.println("��� �ϱ� ���� ��й�ȣ�� �Է��� �ּ���");	//��� ��й�ȣ�� �Է¹ް� ���� �� �������
						int cor_password = input.nextInt();
						if (memberInput.getPassword() ==cor_password) {

							System.out.println("�ܾ� :" + memberInput.getBudget_money()+"��");
							System.out.println("��� �ݾ�: ");
							int outputmoney ;
							outputmoney = input.nextInt();

							totalmoney -= outputmoney;
							if(totalmoney < 0) {
								System.out.println("�ܾ� ����: "+totalmoney);
								System.out.println("��� �����߽��ϴ�.");
							}
							else {
								memberInput.setBudget_money(totalmoney);
								System.out.println(outputmoney+"�� ��� �Ǿ����ϴ�.");
								System.out.println("�ܾ�:"+ memberInput.getBudget_money()+"��");
							}
						}
						else {
							System.out.println("��й�ȣ�� �ٸ��ϴ�.");
							System.out.println("����Ͻ÷��� �ٽ� �õ����ּ���.");
						}
						continue;

					case 3:	
						System.out.println("�� �޴� ȭ������ ���ư��ϴ�.");
					}

				}

			}break;
		}		
	}
}



