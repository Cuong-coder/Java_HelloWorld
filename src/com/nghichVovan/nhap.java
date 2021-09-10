package com.nghichVovan;

import java.util.Scanner;

public class nhap {
	int a, b;

	public nhap() {

	}

	public nhap(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void inPut() {
		Scanner scan = new Scanner(System.in);

		System.out.println("nhap a > 10");
		while (true) {
			a = Integer.parseInt(scan.nextLine());
			boolean check = setA(a);
			if (check) {
				break;
			}
			System.err.println("nhap sai a phai lon hon 10");
		}

		System.out.println("nhap b< 5");
		while(true) {
			b = Integer.parseInt(scan.nextLine());
			boolean check = setB(b);
			if(check) {
				break;
			}
			System.err.println("nhap sai b < 5");
					
		}
	}

	public int tong() {
		return a + b;
	}

	public int getA() {
		return a;
	}

	public boolean setA(int a) {
		if (a > 10) {
			this.a = a;
			return true;
		} else {

			return false;
		}

	}

	public int getB() {
		return b;
	}

	public boolean setB(int b) {
		if (b < 5) {
			this.b = b;
			return true;
		} else {
			return false;
		}

	}
}
