package leecode;

public class ReverseString {

public String reverseString(String s) {
	    char[] word = s.toCharArray();
	    int i = 0,j=word.length-1;
	    while(i<j){
	    	char temp = word[i];
	    	word[i] = word[j];
	    	word[j] = word[i];
	    	i++;
	    	j--;
	    }
	    return new String(word);
    }
}
