class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int numberOfProvinces = 0;
        
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(isConnected, visited, i);
                numberOfProvinces++;
            }
        }
        
        return numberOfProvinces;
    }
    
    private void dfs(int[][] isConnected, boolean[] visited, int city) {
        for (int i = 0; i < isConnected.length; i++) {
            if (isConnected[city][i] == 1 && !visited[i]) {
                visited[i] = true;
                dfs(isConnected, visited, i);
            }
        }
    }
}
