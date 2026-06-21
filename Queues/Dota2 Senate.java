/**
* Approach:
 * Use two queues to store the indices of Radiant and Dire senators.
 * In each round, the senator with the smaller index bans the other.
 * The winning senator re-enters the queue with index + n.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> q1=new LinkedList<>();
    	Queue<Integer> q2=new LinkedList<>();
    	for(int i=0;i<senate.length();i++) {
    		if(senate.charAt(i)=='R') {
    			q1.add(i);
    		}else {
    			q2.add(i);
    		}
    	}
    	int n=senate.length();
    	while(!q1.isEmpty() && !q2.isEmpty()) {
    		if(q1.peek()<q2.peek()) {
    			q1.add(n++);
    		}else {
    			q2.add(n++);
    		}
    		q1.remove();
    		q2.remove();
    	}
    	if(q1.isEmpty()) {
    		return "Dire";
    	}else {
    		return "Radiant";
    	}
    }
}
