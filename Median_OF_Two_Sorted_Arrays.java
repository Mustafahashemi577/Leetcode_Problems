class Median_OF_Two_Sorted_Arrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a [] = new int [nums1.length+nums2.length];
        for(int i = 0,j=0;i<a.length;i++){
            if(i>=nums1.length)
                a[i]=nums2[j++];
            else
                a[i]=nums1[i];
        }
        Arrays.sort(a);
        double median = 0;
        if(a.length%2==0)
            median = (double)(a[a.length/2-1]+a[a.length/2])/2;
        else
            median = a[a.length/2];

        return median;
    }
}