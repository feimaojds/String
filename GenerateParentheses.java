package leecode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenerateParentheses {

	
public List<String> generateParenthesis(int n) {
        List<List<String>> res = new ArrayList<>();
        res.add(Arrays.asList(""));
        for(int i=1;i<=n;i++){
        	List<String> list = new ArrayList<String>();
        	for(int j=0;j<i;j++){
        		for(String first:res.get(j)){
            		for(String second:res.get(i-1-j)){
            			String temp = "("+first+")"+second;
            			list.add(temp);
            		}
            	}
        	}
        	res.add(list);
        }
        return res.get(n);
    }
}
