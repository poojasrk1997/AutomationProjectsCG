package OOPSConceptInterface;

public class ICICIBank implements USBank, RBIBank {

	@Override
	public void educationLoan() {
		System.out.println("icici - education loan");
		
	}

	@Override
	public void homeloan() {
		System.out.println("icici - home loan");
	}

	@Override
	public void carLoan() {
		System.out.println("icici - car loan");
		
	}

	@Override
	public void debit() {
		System.out.println("icici - debit");
	}

	@Override
	public void credit() {
		System.out.println("icici - credit");
	}

	@Override
	public void transferMoney() {
		System.out.println("icici - transfer money");
	}

	@Override
	public void trading() {
		System.out.println("icici - trading");
		
	}
	//ICICI Bank methods
	
	public void mutualFund()
	{
		System.out.println("icici - mutual fund");
	}
	
	public void insurance() {
		
		System.out.println("icici - insurance loan");
	}

	
	
	
}
