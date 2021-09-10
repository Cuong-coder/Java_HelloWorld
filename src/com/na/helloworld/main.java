package com.na.helloworld;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
//		
//		 * KhoiTao nguoi = new KhoiTao(); nguoi.setName("cuong");
//		 * nguoi.setDiaChi("ha nam"); nguoi.setTuoi("12");
//		 * nguoi.setEmail("anh@gmail.com"); System.out.println("ten"+
//		 * nguoi.getName()+"diachi"+ nguoi.getDiaChi()+"tuoi"+ nguoi.tuoi);
//		
//		 * KhoiTao nguoi = new KhoiTao("12","cuong", "ha nam", "a");
//		 * System.out.println(nguoi.getName() + nguoi.getTuoi()+ nguoi.getDiaChi()+
//		 * nguoi.getEmail()); KhoiTao nguoi1 = new KhoiTao("12", "loc");
//		 * System.out.println(nguoi1.getTuoi()+ nguoi1.getName());
//		 */
//		 tạo arrayList có kiểu dữ liệu là Student
		ArrayList<Student> hocSinhList = new ArrayList<>();
		int choose;
		Scanner chon = new Scanner(System.in);
		//tạo vòng do-while cho menu
		do {
			menu();
			choose = Integer.parseInt(chon.nextLine());
			switch (choose) {
			case 1:
				int n;
				System.out.println("学生の数を入力してください");
				n = Integer.parseInt(chon.nextLine());
				for (int i = 0; i < n; i++) {
					Student newHs = new Student();
					newHs.inPut();
					hocSinhList.add(newHs);

				}

				break;
			case 2:

				for (int i = 0; i < hocSinhList.size(); i++) {
					hocSinhList.get(i).inTT();
				}
				break;
			case 3:

				System.out.println("探したい学生番号を入力してください");
				String timSv = chon.nextLine();
				int cout = 0;
				for (int i = 0; i < hocSinhList.size(); i++) {
					if (hocSinhList.get(i).getMaSv().equalsIgnoreCase(timSv)) {
						hocSinhList.get(i).inTT();
						cout++;
					}
				}
				if (cout == 0) {
					System.out.println("khong tim duoc hoc sinh");
				}
				break;
			case 4:
				Collections.sort(hocSinhList, new Comparator<Student>() {

					@Override
					public int compare(Student o1, Student o2) {
						
						if(o1.getDiem()>o2.getDiem()) {
							return -1;
						}
						if(o1.getDiem()== o2.getDiem()) {
							return 0;
						}
							else {
								return 1;
							}
					}
				});
				for (Student student : hocSinhList) {
					student.inTT();
				}
				break;
			case 5:
				int minIndex = 0, maxIndex = 0;
				float maxDiem, minDiem;
				maxDiem = hocSinhList.get(0).getDiem();
				minDiem = hocSinhList.get(0).getDiem();
				for (int i = 1; i < hocSinhList.size(); i++) {
					if (hocSinhList.get(i).getDiem() > maxDiem) {
						maxIndex = i;
						maxDiem = hocSinhList.get(i).getDiem();
					}
					if (hocSinhList.get(i).getDiem() < minDiem) {
						minIndex = i;
						minDiem = hocSinhList.get(i).getDiem();
					}

				}
				System.out.println("一番点数が高い学生の情報：");
				hocSinhList.get(maxIndex).inTT();
				System.out.println("一番点数が低い学生の情報；");
				hocSinhList.get(minIndex).inTT();
				break;
			case 6:
				break;
			case 7:
				System.out.println("Goodbye!!!!!");
			default:
				System.out.println("入力が間違い");
				break;
			}

		} while (choose != 7);
	}

	// hàm show menu
	static void menu() {
		System.out.println("MENU");
		System.out.println("1.学生の情報を入力");
		System.out.println("2.学生の情報を表示");
		System.out.println("3.学生番号で探す");
		System.out.println("4.学生を並べる（点数下順）");
		System.out.println("5.一番点数が高い学生と一番低い学生の情報を表示");
		System.out.println("6.");
		System.out.println("1-7.選んでください");
	}
}