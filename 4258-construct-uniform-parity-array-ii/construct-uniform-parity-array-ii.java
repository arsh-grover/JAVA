class Solution {
    public boolean uniformArray(int[] nums1) {
        int n=nums1.length;
        int noe=0,noo=0;
        int minieven=Integer.MAX_VALUE;
        int miniodd=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            if(nums1[i]%2==0){
                if(nums1[i]<minieven){
                    minieven=nums1[i];
                }

            }
            else{
                if(nums1[i]<miniodd){
                    miniodd=nums1[i];
                }
            }
            if(nums1[i]%2==0) noe++;
            else noo++;
        }
        int finalmini=Math.min(minieven,miniodd);
        if(finalmini%2!=0) return true;        
        if(noo==n || noe==n) return true;
        return false;
    }
}