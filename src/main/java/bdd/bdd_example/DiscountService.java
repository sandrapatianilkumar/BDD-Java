package bdd.bdd_example;

/**
 * Hello world!
 *
 */
public class DiscountService {
//	public static void main(String[] args) {
//		getDiscount(4000);
//		
//	}
	public String getDiscount(int amount) {
		String discountPercentage = "";
		if (amount > 5000 && amount < 10000) {
			discountPercentage = "10%";
		} else if (amount > 10000) {
			discountPercentage = "15%";
		} else {
			discountPercentage = "NA";
		}
		return discountPercentage;
	}
}
