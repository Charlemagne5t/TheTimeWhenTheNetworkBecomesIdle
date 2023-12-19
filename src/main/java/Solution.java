import java.util.*;

public class Solution {
    public int networkBecomesIdle(int[][] edges, int[] patience) {
        int n = patience.length;
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int i = 0; i < edges.length; i++) {
            adjList.get(edges[i][0]).add(edges[i][1]);
            adjList.get(edges[i][1]).add(edges[i][0]);
        }
        int[] distFromStart = bfs(adjList, n);

        int max = -1;
        for (int i = 1; i < n; i++) {
            int currentServerRequestTime = distFromStart[i];
            if(currentServerRequestTime * 2 < patience[i]){
                max = Math.max(max, currentServerRequestTime * 2 + 1);
            }else {
                int requestResponseTime = currentServerRequestTime * 2;
                    int startingTimeOfLastRetry = requestResponseTime % patience[i] == 0
                            ? requestResponseTime - patience[i]
                            : requestResponseTime - requestResponseTime % patience[i];
                max = Math.max(max, requestResponseTime + startingTimeOfLastRetry + 1);
                }


        }

        return max;
    }
    private int[] bfs(List<List<Integer>> adjList, int n){
        int[] resultList = new int[n];
        Arrays.fill(resultList, -1);
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        resultList[0] = 0;
        int level = 0;


        while (!queue.isEmpty()){
            level++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int cur = queue.poll();
                for (int j = 0; j < adjList.get(cur).size(); j++) {
                    if( resultList[adjList.get(cur).get(j)] == -1){
                        resultList[adjList.get(cur).get(j)] = level;
                        queue.offer(adjList.get(cur).get(j));
                    }
                }
            }
        }
        return resultList;
    }
}


