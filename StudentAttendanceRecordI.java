package leecode;

import java.util.HashMap;
import java.util.Map;

public class StudentAttendanceRecordI {

public boolean checkRecord(String s) {
        Map<Character,Integer> map  =  new HashMap<Character,Integer>();
        boolean flagL = false;
        for(int i=0;i<s.length();i++){
        	if(s.charAt(i)=='A'){
        		map.put('A', map.getOrDefault('A', 0));
        	}else if(s.charAt(i) == 'L'){
        		if(i==0 || s.charAt(i-1) != s.charAt(i)){
        			map.put('L', 1);
        		}else if(s.charAt(i-1) != s.charAt(i)){
        			map.put('L', map.get('L')+1);
        		}	
        		if(map.get('L')==3){
        			flagL = true;
        		}
        	}
        }
        if(flagL==true || map.get('A')>=2) return false;
        else  return true;
    }
}
