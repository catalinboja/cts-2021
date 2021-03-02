package ro.ase.csie.cts.g1092.week2.interest;

public interface Profitable {
	public static final float MAX_INTEREST_PERCENT = 5;		// ~ 5%
	public abstract void addInterest(float interestPercent);
}
