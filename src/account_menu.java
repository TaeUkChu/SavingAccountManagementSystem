import java.util.Scanner;

public class Account_menu {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MemberManager membermanager = new MemberManager(input);
		int num = 0;
		
		while(num<4) {		
		System.out.println("");
		System.out.println("****���� ���� ���� �ý��ۿ� ���� ���� ȯ���մϴ�****"); 	//�⺻ �޴� ����
		
		System.out.println("1.��� �߰��ϱ�.");
		System.out.println("2.��� �����ϱ�.");
		System.out.println("3.��� ��ȸ�ϱ�.");
		System.out.println("4.�����ϱ�");
		
		System.out.println("*********���Ͻô� �޴��� ������ �ּ���*********");
		num = input.nextInt();		//�޴���ȣ�� �Է¹���
		
		switch(num) {
		case 1:	//1�� �޴��� ����� ��
			membermanager.Addmember();  //��� ������ �߰�
			continue;
		
		case 2:	//2���� �� ��� �������� ����� �Է¹ް� ����������			
			membermanager.Delmember();
			continue;
		
		case 3:		//3���� �� ��� ���� ��ϵ� ����� �����ְ� �����ϰ� ��. 
			membermanager.Viewmember();
			membermanager.Selectmember();  
			membermanager.trade();
			continue;
		
		case 4:		//4���� �� ��� while ������ �����鼭 ���̹���~
			System.out.println("�ý����� ����Ǿ����ϴ�. ���̹���~");
			break;
		}
	}
	}
}
	