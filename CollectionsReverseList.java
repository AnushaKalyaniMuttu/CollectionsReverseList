package com.bean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsReverseList {

	public static void main(String[] args) {
		/*
		 * Collections.reverse(list);
		 * return the reverse order of the list
		 */
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
	Collections.reverse(list);
	list.forEach(System.out::println);
	      	}
		
	}
