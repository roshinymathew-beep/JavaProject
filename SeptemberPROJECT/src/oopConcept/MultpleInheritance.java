package oopConcept;

interface Bank1
{
	void withdraw();
	void deposit();
}
interface Bank2
{
	void balancedetails();
	void interestrate();
}
class ICICI implements Bank1,Bank2
{

	@Override
	public void balancedetails() {
		
		System.out.println("Balance Details");
	}

	@Override
	public void interestrate() {
		
		System.out.println("Interes Rates");
	}

	@Override
	public void withdraw() {
		System.out.println("Withdraw");
		
	}

	@Override
	public void deposit() {

		System.out.println("Deposit");
		
	}
	
}
public class MultpleInheritance {

	public static void main(String[] args) {
		ICICI b=new ICICI();
		b.balancedetails();
		b.interestrate();
		b.withdraw();
		b.deposit();

	}

}
