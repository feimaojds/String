package leecode;

public class ReverseStringII {

	 public String reverseStr(String s, int k) {
		    String res = "";
	        if(s.length()<k) return ReversePart(s);
	        else if(s.length()<=2*k &&s.length()>=k) return ReversePart(s.substring(0, k))+s.substring(k,s.length());
	        else {
	        	int count = 0;
	        	while(count<=s.length()-1){
	        		res+=ReversePart(s.substring(count, Math.min(count+k, s.length())));
                 if(s.length()-1-count+1>k)//该轮（要处理2k）剩余个数大于k
	        		res+=s.substring(count+k,Math.min(count+2*k, s.length()));
	        		count+=2*k;
	        	}
	        }
	        return res;
	    }
	
	
	public String ReversePart(String s){
		char[] word = s.toCharArray();
		int i = 0,j=word.length-1;
		while(i<j){
			char temp = word[i];
			word[i] = word[j];
			word[j] = temp;
			j--;
			i++;
		}
		return new String(word);
	}
}
