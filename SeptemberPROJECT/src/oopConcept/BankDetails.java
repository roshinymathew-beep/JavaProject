package oopConcept;
//Hierarchical Inheritance Eg.
class Bank
{
	public void withdraw()
	{
		System.out.println("withdraw");
	}
	public void deposit()
	{
		System.out.println("deposit");
	}
}
class Sbi extends Bank
{
	public void sbiinterest()
	{
		System.out.println("sbiinterest");
	}
}
class Hdfc extends Bank
{
	public void loan()
	{
		System.out.println("loan");
	}
}
public class BankDetails {

	public static void main(String[] args) {
		Sbi s=new Sbi();
		s.deposit();
		s.withdraw();
		s.sbiinterest();
		Hdfc h=new Hdfc();
		h.deposit();
		h.withdraw();
		h.loan();
	}

}
