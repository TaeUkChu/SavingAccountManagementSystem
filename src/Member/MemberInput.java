package Member;

import java.util.Scanner;

import exception.NameFormatException;
import exception.PasswordFormatException;

public interface MemberInput {
	

	
	public void setAge(int age);
	public void setName(String name) throws NameFormatException;
	public void setCall_number(String call_number);
	public void setPassword(int password)  throws PasswordFormatException;
	public void setBudget_money(int budget_money);
	
	public void getUserInput(Scanner input);
	public String getName();
	public int getPassword();
	public int getBudget_money();
	
	public void setMemberName(Scanner input);
	public void setMemberCall_number(Scanner input);
	public void setMemberPassword(Scanner input);

	public void SetAddMoney(MemberInput member, Scanner input);
	public void SetMinusMoney(MemberInput member, Scanner input);
	
	public void printInfo();
	
}
