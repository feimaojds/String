package leecode;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

	
public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for(char c:magazine.toCharArray()){
        	if(!map.containsKey(c)){
        		map.put(c, 1);
        	}else{
        		map.put(c, map.get(c)+1);
        	}
        }
        for(char c:ransomNote.toCharArray()){
        	if(!map.containsKey(c)) return false;
        	map.put(c, map.get(c)-1);
        	if(map.get(c)<0) return false;
        }
        return true;
    }
}
