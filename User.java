package BankLoan ;

public class User 
{
   private String user_name;
   private  String bank_name;
   private String bankloan_type;
   private double loan_amount;
   private double gold_amt;
   private double intrest_amount;
   private double repay_value;
   private boolean isGold_Loan;
   public User(String user_name,String bank_name, String bankloan_type, double loan_amount, double gold_amt, double interest_amount,double repay_value,boolean isGold_Loan) 
   {
	super();
	this.user_name = user_name;
	this.bank_name = bank_name;
	bankloan_type = bankloan_Type;
	this.loan_amount = loan_amount;
	this.gold_amt = gold_amt;
	this.interest_amount= interest_amount;
	this.repay_value=repay_value;
	this.isGold_Loan=isGold_Loan;
   }
   @Override
   public String toString() 
   {
   if(!isGoldLoan)
	return "User Name=" + user_name + ", Bank Name=" + bank_name + ", Loan Type=" + bankloan_type + ", Loan Amount="
			+ loan_amount + " , Interest=" + interest_amount ;
	
	return "User Name=" + user_name + ", Bank Name=" + bank_name + ", Loan Type=" + bankloan_type + ", Loan Amount="
	+ loan_amount + ", Gold in Grams=" + gold_amt + ", Interest value=" + interest_amount ;
   }
}