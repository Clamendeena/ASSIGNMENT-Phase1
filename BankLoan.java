package BankLoan;

import java.util.ArrayList;

public class BankLoan{
    private String bankloan_type;
    private double amount;
    private double gold_amt;
    
    static ArrayList<String> bankloantypes=new ArrayList<>();
    static {
    	bankloantypes.add("Educational Loan");
    	bankloantypes.add("Gold Loan");
    	bankloantypes.add("Housing Loan");
    	bankloantypes.add("Personal Loan");
    }
    
	public Loan(String bankloan_type, double amt, double gold_amt) {
		super();
		this.bankloan_type = bankloan_type;
		this.amt = amt;
		this.gold_amt = gold_amt;
	}
	public Loan(String bankloan_type, double amt) {
		super();
		this.bankloan_type = bankloan_type;
		this.amt = amt;
	}
    public static void printLoanType()
    {
    	for(int i=0;i<bankloan_types.size();i++)
		{
			System.out.println(i+1+") "+bankloantypes.get(i));
		}
    }
}