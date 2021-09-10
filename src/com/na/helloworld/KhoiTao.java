package com.na.helloworld;

import java.util.Scanner;

public class KhoiTao {
	int tuoi;
	String name;
	String diaChi;
	String email;
	// tạo constructor không đối số
	public KhoiTao() {
		
	}
	// tạo Constructor có 4 đối số cho class chaa
	public KhoiTao(int tuoi, String name, String diaChi, String email) {
		this.tuoi = tuoi;
		this.name = name;
		this.diaChi = diaChi;
		this.email = email;
	}
	// tạo Constructor có 2 đối số cho class cha
	public KhoiTao(int tuoi, String name) {
		
		this.tuoi = tuoi;
		this.name = name;
	}
	
	// định nghĩa phương thức in thông tin cho class cha
		public void inTT() {
			System.out.print("名前："+name+"年齢："+ tuoi+"住所："+ diaChi+"メール："+email);
		}
		// định nghĩa phương thúc nhập thông tin cho class cha
		public void inPut() {
			
			Scanner in = new Scanner(System.in);
			
			System.out.println("名前を入力してください:");
			name = in.nextLine();
			
			System.out.println("年齢を入力してください");
			while(true) {
				int tuoi1 = Integer.parseInt(in.nextLine());
				boolean check = setTuoi(tuoi1);
				if(check) {
					break;
				}
				
			}
			System.out.println("住所を入力してください");
			diaChi = in.nextLine();
			System.out.println("メールを入力してください");
			email = in.nextLine();
		}
	// tạo bộ get-setter
	public int getTuoi() {
		return tuoi;
	}
	public boolean setTuoi(int tuoi) {
		if(tuoi>=0 && tuoi <= 100) {
			this.tuoi = tuoi;
			return true;
		}else {
			System.err.println("nhap sai tuoi nhap lai");
			return false;
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
