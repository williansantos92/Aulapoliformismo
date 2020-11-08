package entities;

public class ImportedProduct extends Product {
	private Double customsFee;
	
	public ImportedProduct() {
		
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}

	@Override
	public String priceTag() {
		return getName() +  " $ " +  getPrice() + " (Customs fee: $  " + customsFee + ")";	
		
	}

	@Override
	public String toString() {
		return "ImportedProduct [customsFee=" + customsFee + ", getName()=" + getName() + ", getPrice()=" + getPrice()
				+ "]";
	}
	
	
	

}
