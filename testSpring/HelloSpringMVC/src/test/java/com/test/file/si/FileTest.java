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
			System.out.println("未在指定目录下找到文件名为test的文件，正在创建。。。");
			try{
				file.createNewFile();
			}catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			System.out.println("文件创建成功！");
		}else {
			System.out.println("找到文件名为test的文件");
			if(file.isFile()&&file.canRead()){
				System.out.println("文件可读，正在读取文件信息。。。");
				String fileName = file.getName();
				String filePath = file.getAbsolutePath();
				boolean hidden = file.isHidden();
				long len = file.length();
				long tempTime = file.lastModified();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
				Date date = new Date(tempTime);
				String time = sdf.format(date);
				System.out.println("文件名：" + fileName);
				System.out.println("文件的绝对路径：" + filePath);
				System.out.println("文件是否是隐藏文件：" + hidden);
				System.out.println("文件中的字节数：" + len);
				System.out.println("文件最后的修改时间：" + time);
				System.out.println("这个文件的使命结束了，已经被删除");
				
			}else{
				System.out.println("文件名不可读" );
			}
		}

	}

}
