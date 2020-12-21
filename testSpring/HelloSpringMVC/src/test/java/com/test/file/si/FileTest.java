package com.test.file.si;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("test.txt");
		if (!file.exists()){
			System.out.println("δ��ָ��Ŀ¼���ҵ��ļ���Ϊtest���ļ������ڴ���������");
			try{
				file.createNewFile();
			}catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			System.out.println("�ļ������ɹ���");
		}else {
			System.out.println("�ҵ��ļ���Ϊtest���ļ�");
			if(file.isFile()&&file.canRead()){
				System.out.println("�ļ��ɶ������ڶ�ȡ�ļ���Ϣ������");
				String fileName = file.getName();
				String filePath = file.getAbsolutePath();
				boolean hidden = file.isHidden();
				long len = file.length();
				long tempTime = file.lastModified();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
				Date date = new Date(tempTime);
				String time = sdf.format(date);
				System.out.println("�ļ�����" + fileName);
				System.out.println("�ļ��ľ���·����" + filePath);
				System.out.println("�ļ��Ƿ��������ļ���" + hidden);
				System.out.println("�ļ��е��ֽ�����" + len);
				System.out.println("�ļ������޸�ʱ�䣺" + time);
				System.out.println("����ļ���ʹ�������ˣ��Ѿ���ɾ��");
				
			}else{
				System.out.println("�ļ������ɶ�" );
			}
		}

	}

}
