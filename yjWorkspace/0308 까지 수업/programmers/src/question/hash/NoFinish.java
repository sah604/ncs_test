package question.hash;

import java.util.HashSet;


public class NoFinish {
	public static void main(String[] args) {
		
		
		
		Solution so = new Solution();
		
		String[] p = {"a","a","b","c","d"};
		String[] c = {"a","b","c"};
		
		so.solution(p, c);
		
		
		
		System.out.println(so.solution(p, c));
		
	}
	

}


class Solution {
	
	
    public String solution(String[] participant, String[] completion) {
      
    	String answer = "";
    	
    	HashSet<String> hsetc = new HashSet<>();
    	HashSet<String> hsetp = new HashSet<>();
    	
   
    	Object[] arrc = completion;
    	Object[] arrp = participant;
    	

    		for(int i= 0; i < arrp.length; i++) {
    			hsetp.add(participant[i]);
    		}
    		for(int j= 0; j < arrc.length; j++) {
    			hsetc.add(completion[j]);
    		}

    	
    
    	
    	
    	for(int i= 0; i < arrp.length; i++) {
    		
    		if(!hsetc.contains(arrp[i])) {
    			
    			answer = (String) arrp[i];
    		}
    		
//    		for(int j = 1; j < arrp.length; j++) {
//    			
//    			if(hsetc.contains(arrp[i]) && ((String) arrp[i])) {
//        			
//        		}
//    		}
//    		
    		
    		
    	}
    		
    	
    
    	
        return answer;
    }
    
}
