package work8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//請建立一個Collection物件並將以下資料加入:
//Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、Integer(100)、
//Object物件、“Snoopy”、BigInteger(“1000”)
//
//• 印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)
//• 移除不是java.lang.Number相關的物件
//• 再次印出這個集合物件的所有元素,觀察是否已將非Number相關的物件移除成功

public class Hw1Collection {

	public static void main(String[] args) {

		Collection<Object> c1 = new ArrayList<>();

		c1.add(new Integer(100));
		c1.add(new Double(3.14));
		c1.add(new Long(21L));
		c1.add(new Short("100"));
		c1.add(new Double(5.1));
		c1.add("Kitty");
		c1.add(new Integer(100));
		c1.add(new Object());
		c1.add("Snoopy");
		c1.add(new BigInteger("1000"));
		c1.add("Snoopy");

		// • 印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)
		System.out.print("這是使用Iterator的結果");
		System.out.println("=========================");
		Iterator<Object> it1 = c1.iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}

		System.out.print("這是使用傳統for的結果");
		System.out.println("=========================");
		for (int i = 0; i < c1.size(); i++) {		
			System.out.println(((ArrayList)c1).get(i));			
		}

		System.out.print("這是使用foreach的結果");
		System.out.println("=========================");
		for (Object c : c1) {
			System.out.println(c);
		}

		// • 移除不是java.lang.Number相關的物件
		int c1Length = c1.size();
		Object[] a = c1.toArray();
		for (int i = 0; i < c1Length; i++) {
			if (!((a[i]) instanceof Number)) {
				c1.remove(a[i]);
			}
		}

		// • 再次印出這個集合物件的所有元素,觀察是否已將非Number相關的物件移除成功
		System.out.print("這是移除後的結果");
		System.out.println("=========================");

		for (int i = 0; i < c1.size(); i++) {
			System.out.println(((ArrayList)c1).get(i));
		}

	}

}
