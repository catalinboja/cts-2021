package ro.ase.csie.cts.g1094.refactor.phase3;

public enum ProductType {
	NEW(0), DISCOUNTED(0.1f), LIMITED_STOCK(0.25f), LEGACY(0.35f);
	
	private final float discountValue;
	
	private ProductType(float discount) {
		this.discountValue = discount;
	}
	
	public float getDiscount() {
		return this.discountValue;
	}
	
}
