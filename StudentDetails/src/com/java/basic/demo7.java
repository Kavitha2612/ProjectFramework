package com.java.basic;

import java.util.LinkedHashMap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class demo7 {
public static void main(String[] args) 
{
	String s = "for the people of the people by the people";
	
String[] word = s.split(" ");
Map<String, Integer> m = new LinkedHashMap<>();
for (String kword : word) {
	if (m.containsKey(kword)) {
		Integer in = m.get(kword);
		m.put(kword, in+1);
	}
	else {
	m.put(kword, 1);
}
	}
System.out.println(m);
Set<Entry<String, Integer>> entrySet = m.entrySet();{
	for(Entry<String, Integer> entry:entrySet) {
		if(entry.getKey()>1) {
			System.out.println(entry);
			
			}
		}
}
}}
