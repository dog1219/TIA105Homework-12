package work2;

public class TenXwhile {

	public static void main(String[] args) {

		int k = 1, i = 1;

		while (i <= 10) {

			k = k * i++;

		}

		System.out.print("1~10的連乘積 : " + k);

	}

}
