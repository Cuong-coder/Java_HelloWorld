package nghich.vo.van;

import java.util.Scanner;

public class math {
	int a;
	int b;

	public math() {
		// TODO Auto-generated constructor stub
	}
	
	public static int tong2(int a, int b) {
		return a*b;
	}
	public math(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	public void nhap() {
		Scanner nhap = new Scanner(System.in);
		a= nhap.nextInt();
		b= nhap.nextInt();
	}
	
	/**
	 * @return the a
	 */
	public int getA() {
		return a;
	}

	/**
	 * @param a the a to set
	 */
	public void setA(int a) {
		this.a = a;
	}

	/**
	 * @return the b
	 */
	public int getB() {
		return b;
	}

	/**
	 * @param b the b to set
	 */
	public void setB(int b) {
		this.b = b;
	}

	public int tong() {
		return a + b;

	}

}
