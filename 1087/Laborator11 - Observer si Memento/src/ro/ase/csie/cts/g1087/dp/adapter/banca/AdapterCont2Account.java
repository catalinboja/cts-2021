package ro.ase.csie.cts.g1087.dp.adapter.banca;

public class AdapterCont2Account implements BankAccount {

	ContBancar cont;
	

	public AdapterCont2Account(ContBancar cont) {
		super();
		this.cont = cont;
	}

	@Override
	public void accountTransfer(BankAccount account, double amount) {
		ContBancarDebit contDebit = (ContBancarDebit) conversie(account);
		cont.transfer(contDebit, amount);
	};
	
	private ContBancarDebit conversie(BankAccount account) {
		DebitAccount debit = (DebitAccount) account;
		ContBancarDebit cont = new ContBancarDebit(debit.value, debit.id+"");
		return cont;
	}

}
