import java.util.Scanner;

public class account_menu {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 0;
		
		while(num<4) {
		System.out.println("");
		System.out.println("****���� ���� ���� �ý��ۿ� ���� ���� ȯ���մϴ�****");
		
		System.out.println("1.��� �߰��ϱ�.");
		System.out.println("2.��� �����ϱ�.");
		System.out.println("3.��� ��ȸ�ϱ�.");
		System.out.println("4.�����ϱ�");
		
		System.out.println("*********���Ͻô� �޴��� ������ �ּ���*********");
		num = input.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("�߰��� ��� ������ �Է����ּ���");
			System.out.print("�̸�:");
			String name = input.next();
			System.out.print("����:");
			int age = input.nextInt();
			System.out.print("��ȭ��ȣ:");
			int call_num = input.nextInt();
			System.out.print("���� ��� ��ȣ:");
			int password = input.nextInt();
			System.out.println("���ϵ帳�ϴ�!! ���������� ��ϵǼ̽��ϴ�.");
			continue;
		case 2:
			System.out.println("������ ����� �Է����ּ���");
			String del_member = input.next();
			System.out.println(del_member+"���� �����Ǿ����ϴ�.");
			continue;
		case 3:
			System.out.println("�߰� �޴��� ����ּ���(1~3)");
			System.out.println("");
			System.out.println("3-1. ������ ����� �Ա��ϱ�");
			System.out.println("3-2. ������ ������� ����ϱ�");
			System.out.println("3-3. ����ϰ� �޴��� ���ư���.");
			continue;
		case 4:
			System.out.println("�ý����� ����Ǿ����ϴ�. ���̹���~");
			break;
		}
	}
	}
}
