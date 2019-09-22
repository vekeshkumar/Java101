package basicsPrgms;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class wordFrequency {


	//find occurrence of each alphabets
	public ArrayList<String> getWordFrequencyList() {
		//String  of words declaration
		String wordArray[] = {"abcdbc","abbccdd","acccdad"};
		ArrayList<String> answer= new ArrayList<String>();
		//Loop for iterating each word in the array
		for(int i=0; i <wordArray.length; i++) {
			//Set each word in character array
			char currentWord[] = wordArray[i].toCharArray();
			Map<Character,Integer> freqList =   new LinkedHashMap<Character, Integer>();

			//for each 
			for(char key : currentWord) {
				if(freqList.containsKey(key)) {
					freqList.put(key, freqList.get(key)+1);
				}else {
					freqList.put(key, 1);
				}
			}
			System.out.println("Each word "+wordArray[i]+":");
			for(Map.Entry<Character, Integer> entry : freqList.entrySet()) {
				 String val = (entry.getKey()+"-"+entry.getValue());
				 answer.add(val);
			}
		}
		return answer;

	}
}
