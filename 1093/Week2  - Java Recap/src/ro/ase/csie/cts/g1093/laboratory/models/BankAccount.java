package ro.ase.csie.cts.g1093.laboratory.models;

public abstract class BankAccount extends Account{
	protected String iban;
	protected double balance;
	
	public BankAccount(String iban, double balance) {
		this.balance = balance;
		this.iban = iban;
	}
	
	
	@Override
	public double getBalance() {
		return this.balance;
	}
}
