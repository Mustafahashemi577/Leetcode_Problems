class Leetcode1642 {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((a,b)-> b-a);

        for(int i = 0;i<heights.length-1;i++){
            var diff = heights[i+1]-heights[i];
            if(diff<=0) continue;

            bricks-=diff;
            queue.offer(diff);

            if(bricks<0){
                if(ladders==0)
                    return i;
                ladders--;
                bricks+=queue.poll();
            }
        }
        return heights.length-1;
    }
}
