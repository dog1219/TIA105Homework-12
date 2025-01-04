package work5;

//• 請設計一個類別MyRectangle:
//(1) 有兩個double型態的屬性為width, depth
//(2) 有三個方法:
//
//void setWidth(double width): 將收到的引數指定給width屬性
//void setDepth(double depth): 將收到的引數指定給depth屬性
//double getArea(): 能計算該長方形的面積
//
//(3) 有兩個建構子:
//
//public MyRectangle(): 不帶參數也無內容的建構子
//public MyRectangle(double width, double depth): 傳入的兩個引數會指定給對應的屬性
//
//• 請另外建立一個MyRectangleMain類別,此類別只有main方法
//(1) 使用public MyRectangle()建構子建立物件,設定width, depth為10, 20,透過getArea()印出結果
//(2) 使用public MyRectangle(double width, double depth)建構子建立物件,設定width, depth為10, 20,透過getArea()印出結果

class Hw4MyRectangle {
	
	private double width, depth;
	
	public Hw4MyRectangle(){
		
	}
	
	public Hw4MyRectangle(double width, double depth) {
		
		this.width = width;
		this.depth = depth;
		
	}
	
	void setWidth(double width) {
		
		this.width = width;
		
	}
	
	void setDepth(double depth) {
		
		this.depth = depth;
		
	}
	
	double getArea() {
		
		return this.width*this.depth;
		
	}
	
}

class MyRectangleMain {

	public static void main(String[] args) {

		Hw4MyRectangle mr = new Hw4MyRectangle();
		mr.setWidth(10);
		mr.setDepth(20);
		System.out.println("(1) " + mr.getArea());

		Hw4MyRectangle mr2 = new Hw4MyRectangle(10, 20);
		System.out.println("(2) " + mr2.getArea());

	}
	
}
