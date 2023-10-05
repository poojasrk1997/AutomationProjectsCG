package OOPSConceptInterface;

public interface USBank {
	
	int balance=100;
	
	public void debit();
	
	public void credit();
	
	public void transferMoney();
	
	public void trading();
	
	//no method body only method declaration
	//method prototype
	//cannot create create object of interface but we can create reference of interface
	//no static methods
	//interface variable are static in nature by default
	//we can achieve 100% abstraction using interface
	//static variable is called by class name or interface name
	//Actual business logic will be writing at class level not at interface level
	

}
