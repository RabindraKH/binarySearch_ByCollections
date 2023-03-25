package com.binaryearch_ByCollections;
import java.util.Collections;
import java.util.ArrayList;
public class A {
	public static void main(String args[]) {
		int [] array= {10,11,12,13,14,15,16,17,18,19,20};
		ArrayList<Integer> al=new ArrayList();
		
		for(int i=0;i<array.length;i++) {
			al.add(array[i]);
		}
		int index=Collections.binarySearch(al,18);
		System.out.println(index+1);
	}

}
