package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Object> resu = new HashMap();
		resu.put("users", "luozi");
		resu.put("total", 1);
		resu.put("age", 1);
		int ee = (Integer)resu.get("total");
		Set<String> ww = resu.keySet();
		
		for (String str : ww) {
		      System.out.println(str+" "+resu.get(str));  
		} 
		
		 String site = "www.runoob.com";
	        int len = site.length();
	        System.out.println( "菜鸟教程网址长度 : " + len );
	        
	     float floatVar=(float) 0.222;
	     int intVar=10;
	     String stringVar="luozi";
	     String fs;
	     fs = String.format("浮点型变量的值为 " +
	                           "%f, 整型变量的值为 " +
	                           " %d, 字符串变量的值为 " +
	                           " %s", floatVar, intVar, stringVar);
	     System.out.println(fs);
	     if(fs.endsWith("i")){
	    	 System.out.println(fs);
	     }else{
	    	 System.out.println("没有以i结尾的");
	     }
	     
	     String abc = "aa.pdf";
	     System.out.println(abc.indexOf("."));
	     
	     abc = "aa.bb.pdf.doc";
	     System.out.println(abc.lastIndexOf("."));
	     System.out.println(abc.substring(2, 5));
	     int rr = abc.lastIndexOf(".");
	     int lenabc = abc.length();
	     System.out.println(abc.substring(rr+1, lenabc));
	     
	     String[] t = abc.split("\\.");
	     for(String dd : t){
	    	 System.out.println(dd);
		     
	     }
	     
	     List<TestUser> uu = new ArrayList<TestUser>();
	     TestUser user1 = new TestUser("luozi",80);
	     TestUser user2 = new TestUser("laoli",100);
	    
	     uu.add(user1);
	     uu.add(user2);
	     for(TestUser gg : uu){
	    	 System.out.println(gg.getUsername()+' '+gg.getAge());
	     }
	}

}
