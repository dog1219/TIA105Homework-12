package work8;

import java.math.BigInteger;

//請建立一個Collection物件並將以下資料加入:
//Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、Integer(100)、
//Object物件、“Snoopy”、BigInteger(“1000”)
//
//• 印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)
//• 移除不是java.lang.Number相關的物件
//• 再次印出這個集合物件的所有元素,觀察是否已將非Number相關的物件移除成功

public class Hw1Collection {
	
	public static void main(String[] args) {
		
		Collection c1 = new Collection(new Integer(100));
		Collection c2 = new Collection(new Double(3.14));
		Collection c3 = new Collection(new Long(21L));
		Collection c4 = new Collection(new Short("100"));
		Collection c5 = new Collection(new Double(5.1));
		Collection c6 = new Collection("Kitty");
		Collection c7 = new Collection(new Integer(100));
		Collection c8 = new Collection(new Object());
		Collection c9 = new Collection("Snoopy");
		Collection c10 = new Collection(new BigInteger("1000"));
		
		for(int i=1;i<=10;i++) {
			
		}
		
	      while (iterator.hasNext()) {
	      	
	          String fruit = iterator.next(); 
	          System.out.println(fruit);
	          
	      }
      
	      foreach(){
	      	
	      }
		
	}
	
}

class Collection {

	private Object obj;

	public Collection() {
		super();
	}

	public Collection(Object obj) {
		super();
		this.obj = obj;
	}

}
