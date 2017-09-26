package leecode;

public class ExcelSheetColumnsNumber {

public int titleToNumber(String s) {
        if(s==null || s.length() == 0) return 0;
        int n = s.length();
        int res = 0;
        for(int i=0;i<n;i++){
        	res = res * 26 + (s.charAt(i)-'A'+1);
        }
        return res;
    }
}
