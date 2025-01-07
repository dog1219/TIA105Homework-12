package workExt;

//• 建立父類別Pen

//• (1) 兩個屬性：品牌(brand)、價格(price) (封裝設計) 
//• (2) 建構子設計：一個無參數與一個根據屬性而設計
//• (3) 定義Getter/Setter方法
//• (4) 宣告一個抽象方法write()
//• 建立兩個子類別Pencil與InkBrush繼承Pen父類別
//• (1) 實作方法：Pencil輸出為削鉛筆再寫，InkBrush為沾墨汁再寫
//• (2) Pencil實際售價為定價8折，InkBrush為定價9折
//• (3) 多型操作，當共同呼叫write()方法與getPrice()方法，各種筆都可正確顯示write內容與售價金額

abstract class Pen {

	private String brand;
	private int price;

	Pen() {

	}

	Pen(String brand, int price) {

		this.brand = brand;
		this.price = price;

	}

	String getBrand() {

		return brand;

	}

	void setBrand(String brand) {

		this.brand = brand;

	}

	double getPrice() {

		return price;

	}

	void setPrice(int price) {

		this.price = price;

	}

	public abstract void write();

}

class Pencil extends Pen {

	@Override
	double getPrice() {

		return (int) (super.getPrice() * 0.8);

	}

	public void write() {

		System.out.println("削鉛筆再寫");
	}

}

class InkBrush extends Pen {

	@Override
	double getPrice() {

		return (int) (super.getPrice() * 0.9);

	}

	public void write() {

		System.out.println("沾墨汁再寫");
	}

}

public class Hw1ExtPen {

	public static void main(String[] args) {

		Pen p1 = new Pencil();
		p1.setBrand("SKB");
		p1.setPrice(200);
		Pen p2 = new InkBrush();
		p2.setBrand("雄獅");
		p2.setPrice(100);

		p1.write();
		p2.write();
		System.out.println(p1.getBrand() + "的售價為: " + p1.getPrice());
		System.out.println(p2.getBrand() + "的售價為: " + p2.getPrice());

	}

}
