package week1day2;

public class Calculator {

	int num1, num2, num3;

	public int add(int num1, int num2, int num3) {
		int add = num1 + num2 + num3;
		System.out.println("Addition of numbers: " + add);
		return add;
	}

	public int sub(int num1, int num2) {
		int sub = num1 - num2;
		System.out.println("Subtraction of numbers: " + sub);
		return sub;
	}

	public void mul(double num1, double num2) {
		double mul = num1 * num2;
		System.out.println("Multiplication of numbers: " + mul);
	}

	public void divide(float num1, float num2) {
		float div = num1 / num2;
		System.out.println("Division of numbers: " + div);
	}

	public static void main(String[] args) {

		Calculator cal = new Calculator();
		cal.add(10, 20, 30);
		cal.sub(10, 5);
		cal.mul(3.5, 4.6);
		cal.divide(10, 5);

	}

}
