package question.hash;

import java.util.ArrayList;
import java.util.List;

public class 완주못_2 {
	public static void main(String[] args) {
		Solution완주2 so = new Solution완주2();
		String[] p = {"mislav", "stanko", "mislav", "ana"};
		String[] c = {"stanko", "ana", "mislav"};
		so.solution(p, c);
		System.out.println(so.solution(p, c));
		System.out.println("출력");
	}
}

class Solution완주2 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

    	List<String> AListP = new ArrayList<>();
    	List<String> AListc = new ArrayList<>();
    	
    	//
    	
    	
    	// hash set에 넣기 (중복 제거)
    	for(int i=0; i<participant.length; i++) {
    		AListP.add(participant[i]);
    	}
    	for(int j=0; j<completion.length; j++) {
    		AListc.add(completion[j]);
    	}
    	
    	
    	
    	
    	
    	
    	for(int i=0; i<participant.length; i++) {
    		
    		if(!AListc.contains(participant[i])) {
				
				return answer = (String) participant[i];
			}
    		
    		
    		for(int j=0; j<completion.length; j++) {
    			
    			if(participant[i].equals(completion[j])) {
    				
    				AListc.remove(completion[j]);
    				break;
    				
    			}
    		
    		}

    	}
    	
    	
    	


        return answer;
    }
}