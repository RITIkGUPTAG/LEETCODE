import java.util.*;

class Solution {
    public int findChampion(int n, int[][] edges) {
        int[] indegree = new int[n];

        // Calculate in-degrees for all nodes
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            // u --> v
            indegree[v]++;
        }

        int champ = -1;  // To store the potential champion
        int count = 0;   // To count nodes with in-degree 0

        // Find the node with in-degree 0
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) {
                champ = i;
                count++;
                // If more than one node has in-degree 0, no champion
                if (count > 1) {
                    return -1;
                }
            }
        }

        return champ;  // Return the champion if valid
    }
}
