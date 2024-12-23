package work1;

import java.math.BigDecimal;

public class Bank {

	public static void main(String[] args) {
		
		BigDecimal money = new BigDecimal("1500000");
		BigDecimal interest = new BigDecimal("0.02");		

		for (int y = 1; y <= 10; y = y + 1) {
			
			// 本金(1+利率)	
			money = money.multiply(interest.add(new BigDecimal("1")));		

		}

		System.out.println(" 本金加利息共有: " + money);
		
	}
	
}
