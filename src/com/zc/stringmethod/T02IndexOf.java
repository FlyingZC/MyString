package com.zc.stringmethod;

public class T02IndexOf {
	public static void main(String[] args) {
		String str = "**java***java*****java*";
		String str1 = "java";
		int index = 0;
		//strings.indexOf(str,index):返回指定字符串str在strings里出现的索引
		while ((index = str.indexOf(str1, index)) != -1) {
			System.out.print(index + "");
			index += str1.length();
		}
	}
}

