package leecode;

public class JudgeRouteCircle {

	 public boolean judgeCircle(String moves) {
	        int h = 0,v = 0;
	        for(char c:moves.toCharArray()){
	        	switch (c) {
				case 'U':
					v++;
					break;
               
               case 'D':
					v--;
					break;
               case 'L':
	                 h--;
	                 break;
               case 'R':
	                h++;
                  	break;
				default:
					break;
				}
	        }
	        return v==0 && h==0;
	    }
}
