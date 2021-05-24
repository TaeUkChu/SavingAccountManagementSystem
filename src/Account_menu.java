import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import log.EventLogger;

public class Account_menu {
	static EventLogger logger = new EventLogger("log.txt");
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		MemberManager membermanager = getObject("membermanager.ser");
		if (membermanager ==null) {
			membermanager = new MemberManager(input);
		} 
			SelectMenu(input,membermanager);
			putObject(membermanager, "membermanager.ser");
			
	}
	
		public static void SelectMenu(Scanner input, MemberManager membermanager) {
			int num = 0;
			while(num<5) {
			Showmenu();
			num = input.nextInt();		//메뉴번호를 입력받음

			switch(num) {
			case 1:	//1번 메뉴를 골랐을 때
				membermanager.Addmember();  //멤버 정보를 추가
				logger.log("멤버 추가.");
				continue;
			
			case 2:	//2번을 고를 경우 삭제받을 멤버를 입력받고 삭제시켜줌	
				logger.log("멤버 삭제 시도.");
				membermanager.Viewmembers();
				membermanager.Delmember();
				continue;
			
			case 3:
				logger.log("등록된 멤버.");
				membermanager.Viewmembers();
				continue;
			case 4:		//3번을 고를 경우 현재 등록된 멤버를 보여주고 선택하게 함. 
				logger.log("입출금.");
				membermanager.Viewmembers();
				membermanager.Selectmember();  
				continue;
			
			case 5:		//4번을 고를 경우 while 루프가 끝나면서 바이바이~
				logger.log("시스템 종료.");
				System.out.println("시스템이 종료되었습니다. 바이바이~");
				break;
			}
			}
			
			
			
		}
		
	public static void Showmenu() {
		System.out.println("");
		System.out.println("****저축 계좌 관리 시스템에 오신 것을 환영합니다****"); 	//기본 메뉴 세팅
		
		System.out.println("1.멤버 추가하기.");
		System.out.println("2.멤버 삭제하기.");
		System.out.println("3.멤버 조회하기");
		System.out.println("4.멤버 입출금하기.");
		System.out.println("5.종료하기");
		
		System.out.println("*********원하시는 메뉴를 선택해 주세요*********");
	}
	public static MemberManager getObject(String fileName) {
		MemberManager membermanager = null;
		
		try {
			FileInputStream file = new FileInputStream(fileName);
			ObjectInputStream in = new ObjectInputStream(file);
			
			membermanager = (MemberManager) in.readObject();
			
			in.close();
			file.close();
			
		}catch (FileNotFoundException e) {
			return membermanager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return membermanager;
	}
	
	public static void putObject(MemberManager membermanager, String fileName) {	
		try {
			FileOutputStream file = new FileOutputStream(fileName);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(membermanager);
			out.close();
			file.close();
			
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}