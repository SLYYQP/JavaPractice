package com.test.file.si;

import java.util.Scanner;

public class testFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请问多少人用餐");
		int count = sc.nextInt();
		if (count <= 4){
			System.out.println("客人请到4人桌");
		}else if (count>4&&count<=8){
			System.out.println("客人请到8人桌");
		}else if (count>8&&count<=16){
			System.out.println("客人请到包厢");
		}else{
			System.out.println("抱歉");
		}
		sc.close();

	}

}
