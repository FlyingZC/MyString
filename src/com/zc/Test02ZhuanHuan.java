package com.zc;

import org.junit.Test;

public class Test02ZhuanHuan {
	@Test
	public void test1(){
		//1.基本数据类型,包装类与String类型转换
		String str1="123";
		int i=Integer.parseInt(str1);
		
		String str2=String.valueOf(i);
		
		//2.字符串与字节数组之间转换
		//字符串与字节数组之间的转换
		String str3="abc123";
		//String类型调用getBytes() 返回byte[]
		byte[] b=str3.getBytes();
		for(int j=0;j<b.length;j++){
			System.out.println((char)b[j]);
		}
		
		//字节数组转成字符串
		String str4=new String(b);
		System.out.println("str4-->"+str4);
		
		//3.字符数组与字符串转换
		//字符串转成字符数组
		String str5="abc123中国人";
		char[] c=str5.toCharArray();
		for(int j=0;j<c.length;j++){
			System.out.println(c[j]);
		}
		//字符数组转成字符串
		String str6=new String(c);
		
	}
}
