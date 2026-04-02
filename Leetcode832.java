class Leetcode832 {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i = 0;i<image.length;i++){
            int l = 0,r=image[0].length-1;
            if(l==r){
                    image[i][l]^=1;
                }
            while(l<r){
                var temp = image[i][l];
                image[i][l] = image[i][r];
                image[i][r]=temp;
                image[i][l++]^=1;
                image[i][r--]^=1;
                if(l==r){
                    image[i][l]^=1;
                    break;
                }
            }
        }
        return image;    
    }
}
