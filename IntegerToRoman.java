package leecode;

public class IntegerToRoman {

public String intToRoman(int num) {
        String[] A = new String[]{"", "M", "MM", "MMM"};
        String[] B = new String[]{"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] C = new String[]{"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] D = new String[]{"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return A[num/1000]+B[num/100%10]+C[num/10%10]+D[num%10];
        }
}
