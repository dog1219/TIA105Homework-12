package work6;

import java.util.InputMismatchException;

public class Calculator extends CalException {

	private int x, y;
	int inputcheck;

	Calculator() {

	}

	int powerXY(int x, int y) throws CalException {

		setX(x);
		setY(y);

		return (int) Math.pow(getX(), getY());

	}

	void setX(int x) throws CalException {

		this.x = CalEx(x);
		inputcheck += 1;

	}

	int getX() {

		return x;

	}

	void setY(int y) throws CalException {

		this.y = CalEx(y);
		inputcheck += 1;

	}

	int getY() {

		return y;

	}

	int CalEx(int value) throws CalException {

		if (inputcheck == 2 && getX() == 0 && getY() == 0) {

			throw new CalException("0的0次方沒有意義!");

		} else if (value < 0) {

			throw new CalException("次方為負值，結果回傳不為整數!");

		} else {

			return value;

		}

	}

}
