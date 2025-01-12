package xxx;

public class Hello13v3 {

	public static void main(String[] args) {

		// 先按照你的設定成5(要設定成奇數，可以再加一個檢查奇數的判斷，但是我懶會像是我的work4 Hw6SixTest那樣要寫很多)
		int input = 5;
		// 中間是幾個
		int median = (input / 2) + 1;
		// 這是每次改變範圍用
		int chang = 1;
		// 這是範圍
		int range = 0;
		
		// 第一個for 是先印5行(input=5)，範圍變大縮小也在這邊
		for (int i = 1; i <= input; i++, range = range + chang) {

			for (int j = 1; j <= input; j++) {

				// j > (median - range) && j < (median + range) 就是範圍
				if (j > (median - range) && j < (median + range)) {

					System.out.print(" ");
					continue;

				}

				System.out.print("*");

			}

			//到中間範圍從原本的+1變成開始縮小
			if (i == median) {

				chang = -chang;
				
			}

			// 一切搞定就換行
			System.out.println("");
		}

	}
}
