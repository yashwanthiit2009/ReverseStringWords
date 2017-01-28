package com.maven.strings.StringReverse;

import java.util.ArrayList;
import java.util.Arrays;

public class App {
 
	public static String reverseSentence(String s){
		StringBuffer sb = new StringBuffer(s);
		
		sb.reverse();
		return sb.toString();
		
	}
	public static String revWords(String s){
		//System.out.println("original: "+s);
		
		s = reverseSentence(s);
		String[] words = s.split(" ");
		ArrayList<String> al = new ArrayList<String>();
		//System.out.print("After Reversing :");
		for(int i=0;i<=words.length-1;i++){
			//System.out.print(reverseSentence((words[i]+" ")));
			 al.add(reverseSentence((words[i]+" ")));
		}
		
		System.out.println(al);
		//String str = al.toString().replaceAll("[\\[\\]]", "").replaceAll(",", "");
		//System.out.print(str);
		return al.toString();
		
	}
	
	public static void main(String[] args) {
		revWords("Hello this is java world");
	}

}
