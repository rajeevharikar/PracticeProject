package javaarraysandstring;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class GetTheMaxWordCountFromFile {
	
	public static void main(String[] args) {
		
		Map<String,Integer> wordMap= new HashMap<String,Integer>();
		
		try {
			BufferedReader readFile= new BufferedReader(new FileReader("/Users/rajeev.sh/Documents/testfile.txt"));
			try {
				String line = readFile.readLine();
				while(line !=null) {
				String[] words = line.toLowerCase().split(" ");
				for(String word:words) {
				if(wordMap.containsKey(word))
				{
					wordMap.put(word, wordMap.get(word)+1);
				}
				else
				{
					wordMap.put(word, 1);
				}
				}
				line=readFile.readLine();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	
		Set<Entry<String, Integer>> setOfEntries = wordMap.entrySet();
		
		for(Entry<String, Integer> entry:setOfEntries) {
			
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		int max=0;
		String key=null;
		Set<Entry<String, Integer>> mapSet = wordMap.entrySet();
		
		for(Entry<String, Integer> entry:mapSet) {
			if(entry.getValue()>max) {
				max= entry.getValue();
				key=entry.getKey() + " ";	
			}
			
		}
		System.out.println("max number of words: "+ key + max);
	}

}
