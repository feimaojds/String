package leecode;

import java.util.List;

public class MinTimeDifferecne {

public int findMinDifference(List<String> timePoints) {
        if(timePoints.isEmpty()) return Integer.MAX_VALUE;
	     boolean[] table = new boolean[24*60];
	     for(String str : timePoints){
	    	 String[] time = str.split(":");
	    	 int hour = Integer.parseInt(time[0]);
	    	 int minute = Integer.parseInt(time[1]);
	    	 if(table[hour*60+minute]==true) return 0;
	    	 table[hour*60+minute] = true;
	     }
	     int pre = -1;
	     int min = Integer.MAX_VALUE;
	     int first = Integer.MAX_VALUE,last = Integer.MIN_VALUE;
	     for(int i=0;i<60*24;i++){
	    	 if(table[i]==true){
	    		 if(pre!=-1){
	    			 min = Math.min(min, i-pre);
	    		 }
	    		 if(pre == -1) first = Math.min(first, i);
	    		 last = Math.max(last, i);
	    		 pre = i;
	    	 }
	     }
	     return Math.min(min, 24*60-(last-first));
    }
}
