package com.noida.singleton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CountingOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str ="hare krishna hare krishna hare ram hare ram " ;
       CountingOfChar chn =new CountingOfChar() ;
       //Cannot make a static reference to the non-static method getUniqueNumberOfChar(String) from the type CountingOfChar  
       // if you are not making class, can not call non static method from static method  .
//       int countOfuniquechar = chn.getUniqueNumberOfChar(str);
//       System.out.println(countOfuniquechar) ;  
       
       chn.getCountOfCharacters(str) ;
     
	}

	private void getCountOfCharacters(String str) {
		
		// converting string into arraylist 
		HashMap<Character ,Integer> map =new HashMap<Character, Integer>() ;
		System.out.println(str.trim());
		 
		for (int i = 0 ; i< str.length() ;i++)
		{
			if (map.containsKey(str.charAt(i)))
			{
				map.put(str.charAt(i), map.get(str.charAt(i))+1) ;
			}
			else 
				map.put(str.charAt(i), 1) ;
		}
		// printing hash map value 
		System.out.println(map);
		
		for (Map.Entry entry : map.entrySet())
		{
			System.out.println(entry.getKey() +" = "+entry.getValue());
		}
		
		
	}

	public int getUniqueNumberOfChar(String str) {
		// As hash set not allowed duplicate values
		HashSet<Character> ch = new HashSet<Character>();

		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
			ch.add(str.charAt(i));

			System.out.println("The number unique character " + ch.size());

		}
		return ch.size();
   }
}
