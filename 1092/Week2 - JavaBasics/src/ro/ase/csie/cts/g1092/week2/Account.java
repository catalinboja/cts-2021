package ro.ase.csie.cts.g1092.week2;

public abstract class Account {
	public abstract double getBalance();
	public abstract void deposit(double amount);
	public abstract void transfer(Account destination, double amount);
	public abstract void withdraw(double amount);
}
