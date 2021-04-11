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
		//����� ����
		int n = 0;
		//���� ���� �Է¹޾� 0~20 �̸� kind = 1 �� �ܴ� kind=2�� ����
		System.out.println("���̸� �Է����ּ���");
		n = input.nextInt();
		if (n < 20 && n>0) {
			kind = 1;
		}
		else {
			kind = 2 ;
		}
		//kind = 1 �̸� ���� , kind = 2�̸� ����� ����
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
	
	//����� �����ϴ� �޼ҵ�
	public void Delmember() {  
		//������ ����� �� ��
		System.out.println("");		
		System.out.println("������ ����� �Է����ּ���");
		String del_member = input.next();
		//��й�ȣ�� �Է¹ް� ��й�ȣ�� ������ ��� ����
		for (int i=0 ; i<members.size(); i++) {
			if (members.get(i).getName().equals(del_member)) {
					System.out.println("���� �ϱ� ���� ��й�ȣ�� �Է��� �ּ���");
						int del_password = input.nextInt();
						if (members.get(i).getPassword() ==del_password) {
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
			if(members.get(i).getName().equals(Select_name)) {
				int num1 = -1;
				while (num1 != 3) {
					System.out.println("***���Ͻô� �۾��� �������ּ���***");
					System.out.println("");
					System.out.println("1. ������ ����� �Ա��ϱ�");
					System.out.println("2. ������ ������� ����ϱ�");
					System.out.println("3. ����ϰ� �޴��� ���ư���.");
					num1 = input.nextInt();
					//���¿� ����� �� �� ���� �ܾ��� ��Ÿ���� ����ҷ� totalmoney ����
					int totalmoney = members.get(i).getBudget_money();
					switch (num1) {
					case 1:
						System.out.println("�󸶸� �Ա��Ͻðڽ��ϱ�?");
						System.out.println("���� �ܾ�: " + members.get(i).getBudget_money());
						
						int inputmoney ;
						inputmoney  = input.nextInt();
						
						totalmoney += inputmoney;
						members.get(i).setBudget_money(totalmoney);
						System.out.println(inputmoney+"�� �ԱݵǾ����ϴ�.");
						System.out.println("�ܾ�:"+members.get(i).getBudget_money());
						continue;
						
					case 2:
						System.out.println("�ܾ� :" + members.get(i).getBudget_money()+"��");
						System.out.println("��� �ݾ�: ");
						int outputmoney ;
						outputmoney = input.nextInt();
	
						totalmoney -= outputmoney;
						members.get(i).setBudget_money(totalmoney);
						System.out.println(outputmoney+"�� ��� �Ǿ����ϴ�.");
						System.out.println("�ܾ�:"+ members.get(i).getBudget_money()+"��");
						continue;
						
					case 3:	
						System.out.println("�� �޴� ȭ������ ���ư��ϴ�.");
					}
				
					}
					
				}break;
		}		
		}
		
	}


