import java.util.ArrayList;
import java.util.Scanner;

import Member.AdultMember;
import Member.ChildMember;
import Member.Member;
import Member.MemberInput;
import Member.MemberKind;
import Member.OldmanMember;

public class MemberManager 	{
	
	ArrayList<MemberInput> members = new ArrayList<MemberInput>();
	Scanner input;

	MemberManager(Scanner input){
		this.input = input;
	}
	
	public void Addmember() {
		MemberInput memberInput;		//����� ����
		int n = 0;
		//���� ���� �Է¹޾� 0~20 �̸� kind = 1 ,20~60�� kind=2�� ���� 60~�� kind=3�� ����
		System.out.println("���̸� �Է����ּ���");
		n = input.nextInt();
		int kind = whatkind(n);
		//kind = 1 �̸� ���� , kind = 2 �̸� �, kind = 3�̸� �������� ����
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
	
	//����� �����ϴ� �޼ҵ�
	public void Delmember() {  
		System.out.println("������� ���� ���α׷��Դϴ�.����");		
		System.out.println("������� ����� ��ȣ���� �Է����ּ����");
		int Select_number = input.nextInt();
		//��й�ȣ�� �Է¹ް� ��й�ȣ�� ������ ��� ����
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
	
public int RMPassword(int index) {		//������ �н�����
	if(index >= 0 ) {
		int del_password = -1;
		while(del_password != 0) {		
		System.out.println("����� �ϱ� ���� ����й�ȣ���� �Է��� �ּ����");
		System.out.println("������ ������ �����÷��� ��0���� �����ּ�����");
		del_password = input.nextInt();
		MemberInput member = members.get(index);
			if (member.getPassword() == del_password) {
					System.out.println("��� ��"+member.getName() +"���� �����Ǿ����ϴ�.");	
					members.remove(index); 
					break;
				}
				else {
					System.out.println("��й�ȣ�� �ٸ��ϴ�. ���� ����");
					continue;
		}
	}
		return 0;
		
	}
	else {
		System.out.println("����� �������� �ʽ��ϴ�.");
		return -1;
	}
	}
	
	public void Viewmembers() {		//��й�ȣ�� ������ ����� ������ ������
		if(members.size() > 0) {
			System.out.println("�ڡڡڡڡڡڡڡ���ȸ�� ����ڡڡڡڡڡڡ� ");
		for (int i=0 ; i<members.size(); i++) {
			System.out.print(i+").");
			members.get(i).printInfo();
		}
		System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
	}
		else {
			System.out.println("����� ����� �������� �ʽ��ϴ�.");
		}
		
	}
	
	public void Selectmember() { 	//������� �����ϴ� �޼ҵ�
			System.out.println("������� �����ϰ� ������ ����� ��ȣ�� �Է��� �ּ���.");
			System.out.println("�ƴ϶�� ��ȣ �� �ƹ� Ű�� �����ּ���");
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
						SetMinusMoney(member, input);
						continue;
					case 3:	
						System.out.println("�� �޴� ȭ������ ���ư��ϴ�.");
						break;
					}
				}
			}
	
	
	public static void ShowSelectmenu() {
		System.out.println("***���Ͻô� �۾��� �������ּ���***");
		System.out.println("");
		System.out.println("1. ������ ����� �Ա��ϱ�");
		System.out.println("2. ������ ������� ����ϱ�");
		System.out.println("3. ����ϰ� �޴��� ���ư���.");
	}
	//���¿� ����� �� �� ���� �ܾ��� ��Ÿ���� ����ҷ� totalmoney ����
	public void SetAddMoney(MemberInput member, Scanner input) {
		 
		int totalmoney = member.getBudget_money();
		System.out.println("�󸶸� �Ա��Ͻðڽ��ϱ�?");
		System.out.println("���� �ܾ�: " + member.getBudget_money());

		int inputmoney ;
		inputmoney  = input.nextInt();

		totalmoney += inputmoney;
		member.setBudget_money(totalmoney);
		System.out.println(inputmoney+"�� �ԱݵǾ����ϴ�.");
		System.out.println("�ܾ�:"+member.getBudget_money());
	}
	public void SetMinusMoney(MemberInput member, Scanner input) {
		int totalmoney = member.getBudget_money();
		System.out.println("��� �ϱ� ���� ��й�ȣ�� �Է��� �ּ���");	//��� ��й�ȣ�� �Է¹ް� ���� �� �������
		int cor_password = input.nextInt();
		if (member.getPassword() ==cor_password) {

			System.out.println("�ܾ� :" + member.getBudget_money()+"��");
			System.out.println("��� �ݾ�: ");
			int outputmoney ;
			outputmoney = input.nextInt();

			totalmoney -= outputmoney;
			if(totalmoney < 0) {
				System.out.println("�ܾ� ����: "+totalmoney);
				System.out.println("��� �����߽��ϴ�.");
			}
			else {
				member.setBudget_money(totalmoney);
				System.out.println(outputmoney+"�� ��� �Ǿ����ϴ�.");
				System.out.println("�ܾ�:"+ member.getBudget_money()+"��");
			}
		}
		else {
			System.out.println("��й�ȣ�� �ٸ��ϴ�.");
			System.out.println("����Ͻ÷��� �ٽ� �õ����ּ���.");
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
