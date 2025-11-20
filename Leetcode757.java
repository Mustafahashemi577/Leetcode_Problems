class Leetcode757 {
    public int intersectionSizeTwo(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->{
            if(a[1]==b[1]){
                return a[0]-b[0];
            }
            return a[1]-b[1];
        });
        var ans = new ArrayList<Integer>();
        ans.add(intervals[0][1]-1);
        ans.add(intervals[0][1]);

        for(int i = 1;i<intervals.length;i++){
            int start = intervals[i][0];
            int end = intervals[i][1];
            int size = ans.size();

            int last = ans.get(size-1);
            int secondLast = ans.get(size-2);

            if(start>last){
                ans.add(end-1);
                ans.add(end);
            }
            else if(start==last)
                ans.add(end);
            else if (start>secondLast)
                ans.add(end);     
        }
        return ans.size();
    }
}
