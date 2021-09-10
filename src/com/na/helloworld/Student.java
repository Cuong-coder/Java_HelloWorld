package com.na.helloworld;

import java.util.Scanner;
// tạo class con Student kế thừa từ class cha KhoiTao
public class Student extends KhoiTao {
	// khai báo thêm thuộc tính cho class con
	float diem;
	String maSv;
	String quocTich;
//	 tạo Constructor không đối số cho class con
	public Student() {

	}
	// tạo Constructor có 3 đối số cho class con
	public Student(float diem, String maSv, String quocTich) {

		this.diem = diem;
		this.maSv = maSv;
		this.quocTich = quocTich;
	}
	// kế thừa lại phương thức nhập thông tin từ class cha
	@Override
	public void inPut() {
		// TODO Auto-generated method stub
		super.inPut();
		// ghi thêm phương thức cho class con
		Scanner scan = new Scanner(System.in);
		System.out.println("点数を入力してください:");
		// tạo vòng lặp để kiểm tra giá trị nhập vào có thỏa mãn điều kiện hay không
		// kiểm tra xem input có đúng là từ 0 - 10 không
		while (true) {
			float diem1 = Float.parseFloat(scan.nextLine());
			boolean check = setDiem(diem1);
			if (check) {
				break;
			}
	
		}

		System.out.println("学生番号を入力してください");
		while (true) {
			String maSv1 = scan.nextLine();
			boolean check = setMaSv(maSv1);
			if (check) {
				break;
			}

		}

		System.out.println("国籍:");
		quocTich = scan.nextLine();

	}

	@Override
	public void inTT() {
		super.inTT();// bê nguyên phương thức inTT của class cha vào
		System.out.println("点数:" + diem + "学生番号" + maSv + "国籍" + quocTich);
		System.out.println();
	}

	public float getDiem() {
		return diem;
	}
	// cài đặt các giá trị nhập vào và điều kiện
	public boolean setDiem(float diem) {
		if (diem >= 0 && diem <= 10) {
			this.diem = diem;
			return true;
		} else {
			System.err.println("入力が間違い（０＜点数＜１０）)");
			return false;
		}

	}

	public String getMaSv() {
		return maSv;
	}

	public boolean setMaSv(String maSv) {
		if (maSv.length() == 8 && maSv != null) {
			this.maSv = maSv;
			return true;
		} else {
			System.err.println("学生番号が間違い");
			return false;
		}

	}

	public String getQuocTich() {
		return quocTich;
	}

	public void setQuocTich(String quocTich) {
		this.quocTich = quocTich;
	}

}
