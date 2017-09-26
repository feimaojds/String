package leecode;

public class ExcelSheetColumnTitle {
	
public String convertToTitle(int n) {
         if(n<=0) return "";
         StringBuilder sb = new StringBuilder();
         while(n>0){
        	 n--;
        	 sb.append((char)('A'+n%26));
        	 n = n/26;
         }
         return sb.reverse().toString();
    }

}
