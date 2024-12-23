package work1;

import java.math.BigDecimal;

public class Round {
	
	public static void main(String[] args) {

		BigDecimal pi = new BigDecimal("3.1415");
		BigDecimal r = new BigDecimal("5");

		// 半徑X半徑X圓周率
		System.out.println(" 園面積: " + pi.multiply(r).multiply(r));
		// 直徑X圓周率
		System.out.println(" 園周長: " + pi.multiply(r).multiply(new BigDecimal("2")));

	}
	
}
