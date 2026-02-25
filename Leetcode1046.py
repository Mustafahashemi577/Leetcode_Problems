class Leetcode1046 {
    public int lastStoneWeight(int[] stones) {
        var queue = new PriorityQueue<Integer>();
        for(var weight : stones)
            queue.offer(-weight);

        while(queue.size()>1){
            var first = queue.poll();
            var second = queue.poll();
            if(second>first)
                queue.offer(first-second);
        }
        queue.offer(0);
        return Math.abs(queue.peek());
    }
}
