package com.test.file.si;

import java.util.Scanner;

public class testFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("���ʶ������ò�");
		int count = sc.nextInt();
		if (count <= 4){
			System.out.println("�����뵽4����");
		}else if (count>4&&count<=8){
			System.out.println("�����뵽8����");
		}else if (count>8&&count<=16){
			System.out.println("�����뵽����");
		}else{
			System.out.println("��Ǹ");
		}
		sc.close();

	}

}
