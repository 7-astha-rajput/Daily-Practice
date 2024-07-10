import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> radiant = new LinkedList<>();
        Queue<Integer> dire = new LinkedList<>();
        
        // Initialize queues with the indices of Radiant and Dire senators
        for (int i = 0; i < senate.length(); i++) {
            if (senate.charAt(i) == 'R') {
                radiant.offer(i);
            } else {
                dire.offer(i);
            }
        }
        
        // Simulate the voting rounds
        while (!radiant.isEmpty() && !dire.isEmpty()) {
            int rIndex = radiant.poll();
            int dIndex = dire.poll();
            
            // The senator with the smaller index bans the other
            if (rIndex < dIndex) {
                radiant.offer(rIndex + senate.length());
            } else {
                dire.offer(dIndex + senate.length());
            }
        }
        
        // Determine the winner
        return radiant.isEmpty() ? "Dire" : "Radiant";
    }
}
