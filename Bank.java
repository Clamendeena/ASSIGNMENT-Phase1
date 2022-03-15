package BankLoan ;
import java.util.ArrayList;

public class Bank {
	
	static ArrayList<String> banks=new ArrayList<>();
	static{
		banks.add("HDFC Bank");
		banks.add("State Bank of India");
		banks.add("UCO Bank");
		banks.add("Canara Bank");
		banks.add("ABC Bank");
		banks.add("Karur Vysya Bank");
	}
	private String bank_name;
	private String bankloan_type;
	private String user_name;
	private double loan_amount;
	
	public Bank(String bank_name, String bankloan_type, String user_name, double loan_amount) {
		super();
		this.bank_name = bank_name;
		loan_type = bankloan_type;
		this.user_name = user_name;
		this.loan_amount = loan_amount;
	}
	public boolean addBank(String name) {
		if(!banks.contains(name))
		{
			banks.add(name);
			return true;
		}
		return false;
	}
	public static void bank_name()
	{
		
		for(int i=0;i<banks.size();i++)
		{
			System.out.println(i+1+") "+banks.get(i));
		}
	}
}