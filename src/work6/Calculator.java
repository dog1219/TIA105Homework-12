package work6;

public class Calculator extends CalException {

	private int x, y;
	private boolean ycheck;

	Calculator() {

	}

	int powerXY(int x, int y) throws CalException {

		setX(String.valueOf(x));
		setY(String.valueOf(y));

		return (int) (Math.pow(getX(), getY()));

	}

	void setX(String x) throws CalException {

		this.x = CalEx(x);

	}

	int getX() {

		return x;

	}

	void setY(String y) throws CalException {

		this.y = CalEx(y);
		ycheck = true;

	}

	int getY() {

		return y;

	}

	int CalEx(String value) throws CalException {

		try {
			if (ycheck == true && getX() == 0 && getY() == 0) {

				throw new CalException("0的0次方沒有意義!");

			} else if (Integer.parseInt(value) < 0) {

				throw new CalException("次方為負值，結果回傳不為整數!");

			} else {

				return Integer.parseInt(value);

			}
		} catch (NumberFormatException e) {

			throw new NumberFormatException("輸入格式不正確");

		}

	}

}
