package OOPSConceptInterface;

public class TestBank {

	public static void main(String[] args) {
		
		ICICIBank ic=new ICICIBank();
		ic.homeloan();
		ic.carLoan();
		ic.educationLoan();
		
		ic.credit();
		ic.debit();
		ic.trading();
		ic.transferMoney();
		
		ic.mutualFund();
		ic.insurance();
		
		System.out.println(USBank.balance);
		
		USBank us = new ICICIBank();
		us.credit();
		us.debit();
		us.trading();
		us.transferMoney();
		
		RBIBank rbi=new ICICIBank();
		rbi.homeloan();
		rbi.carLoan();
		rbi.educationLoan();
		
	}

}
