package work8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

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

		Collection<Train> trainList = new ArrayList<>();

		trainList.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		trainList.add(new Train(1254, "區間", "屏東", "基隆", 700));
		trainList.add(new Train(118, "自強", "高雄", "台北", 500));
		trainList.add(new Train(1288, "區間", "新竹", "基隆", 400));
		trainList.add(new Train(122, "自強", "台中", "花蓮", 600));
		trainList.add(new Train(1222, "區間", "樹林", "七堵", 300));
		trainList.add(new Train(1254, "區間", "屏東", "基隆", 700));

		// • 請寫一隻程式,能印出不重複的Train物件(以上三題請根據使用的集合,練習各種取值寫法,如迭代器、for迴圈或foreach等)
		Collection<Train> trainSet = new HashSet<>(trainList);
		Iterator<Train> it1 = trainSet.iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next().getNumber());
		}
		System.out.println("========================");
		
		// • 請寫一隻程式,讓Train物件印出時,能以班次編號由大到小印出(以上三題請根據使用的集合,練習各種取值寫法,如迭代器、for迴圈或foreach等)
		Collections.sort((List) trainList);
		Object[] a = trainList.toArray();
		for (int i = 0; i < trainList.size(); i++) {
			System.out.println(((Train)a[i]).getNumber());
		}
		System.out.println("========================");
		
		// • 承上,不僅能讓班次編號由大排到小印出,
		// 還可以不重複印出Train物件(以上三題請根據使用的集合,練習各種取值寫法,如迭代器、for迴圈或foreach等)
		Collection<Train> trainSet2 = new HashSet<>(trainList);
		Collection<Train> trainList2 = new ArrayList<>(trainSet2);
		Collections.sort((List)trainList2);
		Iterator<Train> it2 = trainList2.iterator();
		while (it2.hasNext()) {
			System.out.println(it2.next().getNumber());
		}
		System.out.println("========================");
		
		
		
		
	}

}

class Train implements Comparable<Train>{

	private int number; // 班次
	private String type; // 車種
	private String start; // 出發地
	private String dest; // 目的地
	private double price; // 票價


	
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

	public int getNumber() {
		return number;
	}

	public String getType() {
		return type;
	}

	public String getStart() {
		return start;
	}

	public String getDest() {
		return dest;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public boolean equals(Object obj) {
		if (this.number == ((Train) obj).number) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public int hashCode() {
		return number;
	}

    @Override
    public int compareTo(Train t) {
        return Integer.compare(this.number, t.number);
    }
}
