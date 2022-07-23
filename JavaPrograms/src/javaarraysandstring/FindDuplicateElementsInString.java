package javaarraysandstring;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicateElementsInString {
	
	public static void main(String[] args) {
		
		FindDuplicateString("JavaSelenium");
	}
	
	public static void FindDuplicateString(String str) {
		
		if(str==null) {
			System.out.println("String is null");
		}
		
		if(str.isEmpty()) {
			System.out.println("String is empty");
		}
		
		if(str.length()==1) {
			System.out.println("String length is one");
		}
		
		Map<Character,Integer> map= new HashMap<Character,Integer>();
		
		char[] letters= str.toCharArray();
		
		for(char let:letters)
		
		if(map.containsKey(let)) {
			map.put(let, map.get(let) + 1);
		}
		else {
			map.put(let, 1);
		}
		
		Set<Entry<Character, Integer>> set = map.entrySet();
		
		for(Entry<Character, Integer> entry:set) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+":"+entry.getValue());
			}
		}
		
	}

}
