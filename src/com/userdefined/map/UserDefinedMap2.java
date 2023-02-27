package com.userdefined.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class UserDefinedMap2 {

	public static void main(String[] args) {
		UserDefinedMap a=new UserDefinedMap();
		a.setName("fenda");
		UserDefinedMap a2=new UserDefinedMap();
		a2.setName("deli");
		UserDefinedMap a3=new UserDefinedMap();
		a3.setName("desa");
		
		
		Map<Integer,UserDefinedMap> map=new LinkedHashMap<>();
		
		map.put(1, a);
		map.put(2, a2);
		map.put(3, a3);
		
	 Set<Entry<Integer, UserDefinedMap>> entrySet = map.entrySet();
		for(Entry<Integer, UserDefinedMap> b:entrySet) {
			System.out.println(b.getKey());
			System.out.println(b.getValue().getName());
			
		}
	}

}
