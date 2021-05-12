package ro.ase.csie.cts.g1087.dp.adapter.banca;

public class DebitAccount implements BankAccount{
	
	double value;
	int id;
	
	@Override
	public void accountTransfer(BankAccount account, double amount) {
		DebitAccount debit = (DebitAccount) account;
		debit.value += amount;
		this.value -= amount;
	}
}
