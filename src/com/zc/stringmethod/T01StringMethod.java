package com.zc.stringmethod;

public class T01StringMethod {
	public static void main(String[] args) {
		String[] fileNames=new String[]{"abc.txt", "bcd.exe", "cde.exe", "def.dat","efg.exe"};
		for(String s:fileNames){
			if(s.endsWith(".exe")){
				//记得结果传给s
				s=s.substring(0,s.lastIndexOf(".exe"));
				//注意输出位置
				System.out.println(s);
			}
		}
	}
}
