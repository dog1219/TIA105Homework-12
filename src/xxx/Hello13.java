package xxx;

public class Hello13 {

	public static void main(String[] args) {

		// 先按照你的設定成5(要設定成奇數，可以再加一個檢查奇數的判斷，但是我懶會像是我的work4 Hw6SixTest那樣要寫很多)
		int input = 3;

		// 中間是幾個
		int median = (input / 2) + 1;

		// 第一次開始=中間數，然後逐漸擴大
		int start = median;
		int end = median;

		// 第一個for 是先印5行(input=5)
		for (int i = 1; i <= input; i++) {

			// 第一行跟最後一行我找不出跟其他行的規律，所以這樣處理
			if (i == 1 || i == input) {

				for (int j = 1; j <= input; j++) {

					System.out.print("*");

				}

				// 其他行都在這裡
			} else {

				// 判斷有沒有到中間，從中間切成兩種
				if (i <= median) {

					// 他總共會輸出5個東西(空白或是*)
					for (int j = 1; j <= input; j++) {

						// 符合條件就輸出空格不會執行continue下面那些
						// (減少處理程式，增加校能，也可以用if else)
						if (j >= start && j <= end) {

							System.out.print(" ");
							continue;

						}

						System.out.print("*");

					}

					// 下一行開始範圍變大
					start -= 1;
					end += 1;

					// else第二下半部份我用X，讓你知道我切的地方
				} else {

					// 這個時候，他在極致顯示最多中間的狀態，但是這行我們不需要重複，所以在做一次處理
					// 讓他值回到上一個，例如** **
					if (i == median + 1) {
						start += 2;
						end -= 2;
					}
				
					// 跟上半部一樣，做
					for (int j = 1; j <= input; j++) {

						if (j >= start && j <= end) {

							System.out.print(" ");
							continue;

						}
						// 這邊我用X 讓你知道我切的位置
						System.out.print("X");

					}

					// 下半部跟上面不一樣的地方在於它是內縮，上面是擴大空白
					start += 1;
					end -= 1;
					
				}

			}

			// 一切搞定就換行
			System.out.println("");
		}

	}

}
