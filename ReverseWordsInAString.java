package leetcode;

public class ReverseWordsInAString {

	public String reverseWords(String s) {
        if(s == null || s.length() == 0) return "";
        String[] strs = s.split(" ");
        for(int i=0;i<strs.length;i++){
        	strs[i] = reverse(strs[i]);
        }
        String res = "";
        for(int i=0;i<strs.length;i++){
        	res += strs[i];
        	if(i != strs.length-1) res += " ";
        }
        return res;
    }
	public String reverse(String str){
		StringBuilder sb = new StringBuilder();
		for(char c:str.toCharArray()){
			sb.insert(0, c);
		}
		return sb.toString();
	}
	
	 public static void main(String[] args){
		 String[] s = {"123","2"};
		 System.out.println(new ReverseWordsInAString().reverse(s[0]));
		 System.out.println(s[0]);
	 }
	
}
