package com.vaishnavi;

public class MainApp {

	public static void main(String[] args) {
		String testString="Java is cross Platform Language. Cross Platform means on any OS you can run java";
		
		System.out.println(testString);
		
		System.out.println("Split String from index 4 to 20:="+testString.substring(4,20));
		
		System.out.println("Split String from index of 10:"+testString.substring(10));
		
		String []ans=testString.split("Platform");
		System.out.println("Split String from word 'Platform':"+testString.split("Platform"));
		for(int i=0;i<ans.length;i++)
			System.out.println(ans[i]);
		
		System.out.println("Indexof="+testString.indexOf("Java"));
		System.out.println("Indexof="+testString.indexOf("cross"));
		
		System.out.println("lastIndexOf="+testString.lastIndexOf("Java"));
		System.out.println("lastIndexOf="+testString.lastIndexOf("cross"));
		
		

	}

}
