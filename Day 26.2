import java.util.*;

class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        // Step 1: Construct the graph
        Map<String, Map<String, Double>> graph = new HashMap<>();
        for (int i = 0; i < equations.size(); i++) {
            String A = equations.get(i).get(0);
            String B = equations.get(i).get(1);
            double value = values[i];
            
            graph.putIfAbsent(A, new HashMap<>());
            graph.putIfAbsent(B, new HashMap<>());
            graph.get(A).put(B, value);
            graph.get(B).put(A, 1.0 / value);
        }
        
        // Step 2: Answer the queries
        double[] results = new double[queries.size()];
        for (int i = 0; i < queries.size(); i++) {
            String C = queries.get(i).get(0);
            String D = queries.get(i).get(1);
            
            if (!graph.containsKey(C) || !graph.containsKey(D)) {
                results[i] = -1.0;
            } else if (C.equals(D)) {
                results[i] = 1.0;
            } else {
                results[i] = dfs(graph, C, D, new HashSet<>(), 1.0);
            }
        }
        
        return results;
    }
    
    private double dfs(Map<String, Map<String, Double>> graph, String current, String target, Set<String> visited, double product) {
        visited.add(current);
        
        if (graph.get(current).containsKey(target)) {
            return product * graph.get(current).get(target);
        }
        
        for (Map.Entry<String, Double> neighbor : graph.get(current).entrySet()) {
            if (!visited.contains(neighbor.getKey())) {
                double result = dfs(graph, neighbor.getKey(), target, visited, product * neighbor.getValue());
                if (result != -1.0) {
                    return result;
                }
            }
        }
        
        return -1.0;
    }
}
