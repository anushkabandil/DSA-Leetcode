class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
         int n = positions.length;
        
        // Store robots: position, index
        int[][] robots = new int[n][2];
        for (int i = 0; i < n; i++) {
            robots[i][0] = positions[i];
            robots[i][1] = i;
        }
        
        // Sort by position
        Arrays.sort(robots, (a, b) -> a[0] - b[0]);
        
        Stack<Integer> stack = new Stack<>();
        boolean[] alive = new boolean[n];
        Arrays.fill(alive, true);
        
        for (int[] robot : robots) {
            int i = robot[1];
            
            if (directions.charAt(i) == 'R') {
                stack.push(i);
            } else {
                // direction == 'L'
                while (!stack.isEmpty() && healths[i] > 0) {
                    int j = stack.peek();
                    
                    if (healths[j] < healths[i]) {
                        // right robot dies
                        alive[j] = false;
                        stack.pop();
                        healths[i]--;
                    } else if (healths[j] > healths[i]) {
                        // left robot dies
                        alive[i] = false;
                        healths[j]--;
                        break;
                    } else {
                        // both die
                        alive[i] = false;
                        alive[j] = false;
                        stack.pop();
                        break;
                    }
                }
            }
        }
        
        // Collect survivors
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (alive[i]) {
                result.add(healths[i]);
            }
        }
        
        return result;
        
    }
}