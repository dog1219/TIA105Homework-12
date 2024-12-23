package work1;

public class Day {

	public static void main(String[] args) {

		System.out.print((256559 / 60 / 60 / 24) + " 天 ");

		System.out.print((256559 / 60 / 60 % 24) + " 小時 ");

		System.out.print((256559 / 60 % 60) + " 分 ");

		System.out.print((256559 % 60) + " 秒 ");
	}
}
