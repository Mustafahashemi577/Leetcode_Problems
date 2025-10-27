class NumberOfProvinces {
    private void dfs(int node,ArrayList<ArrayList<Integer>> adList,int[] visited){
        visited[node]=1;
        for(int it : adList.get(node)){
            if(visited[it]==0)
                dfs(it,adList,visited);
        }
    }
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> adList = new ArrayList<>();
        
        for(int i = 0;i<isConnected.length;i++){
            adList.add(new ArrayList<Integer>());
        }

        for(int i = 0;i<isConnected.length;i++){
            for(int j = 0;j<isConnected[0].length;j++){
                if(isConnected[i][j]==1 && i!=j){
                    adList.get(i).add(j);
                    adList.get(j).add(i);
                }
            }
        }
        int visited[] = new int[isConnected.length];
        int count = 0;
        for(int i = 0;i<isConnected.length;i++){
            if(visited[i]==0){
                count++;
                dfs(i,adList,visited);
            }
        }

        return count;
    }
}
