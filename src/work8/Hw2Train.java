package work8;

//請設計一個Train類別,並包含以下屬性:
//- 班次 number,型別為int - 車種 type,型別為String - 出發地 start,型別為String
//- 目的地 dest,型別為String - 票價 price,型別為double
//• 設計對應的getter/setter方法,並在main方法裡透過建構子產生以下7個Train的物件,放到每小題
//需使用的集合裡
//- (202, “普悠瑪”, “樹林”, “花蓮”, 400)
//- (1254, “區間”, “屏東”, “基隆”, 700)
//- (118, “自強”, “高雄”, “台北”, 500)
//- (1288, “區間”, “新竹”, “基隆”, 400)
//- (122, “自強”, “台中”, “花蓮”, 600)
//- (1222, “區間”, “樹林”, 七堵, 300)
//- (1254, “區間”, “屏東”, “基隆”, 700)
//
//• 請寫一隻程式,能印出不重複的Train物件
//
//• 請寫一隻程式,讓Train物件印出時,能以班次編號由大到小印出
//
//• 承上,不僅能讓班次編號由大排到小印出, 還可以不重複印出Train物件
//
//• (以上三題請根據使用的集合,練習各種取值寫法,如迭代器、for迴圈或foreach等)

public class Hw2Train {
	
	public static void main(String[] args) {
	
		Train t1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Train t2 = new Train(1254, "區間", "屏東", "基隆", 700);
		Train t3 = new Train(118, "自強", "高雄", "台北", 500);
		Train t4 = new Train(1288, "區間", "新竹", "基隆", 400);
		Train t5 = new Train(122, "自強", "台中", "花蓮", 600);
		Train t6 = new Train(1222, "區間", "樹林", "七堵", 300);
		Train t7 = new Train(1254, "區間", "屏東", "基隆", 700);
		
	}
	
}

class Train {
	
	private int number; // 班次
	private String type; // 車種
	private String start; // 出發地
	private String dest; //目的地
	private double price; //票價
	
	
	public Train() {
		super();
	}

	public Train(int number, String type, String start, String dest, double price) {
		super();
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}

}
