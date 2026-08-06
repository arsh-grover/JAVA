class Solution {
    public int[] mergeSorted(int[]nums1,int[]nums2){
        int n=nums1.length;
        int m=nums2.length;
        int[]temp=new int[n+m];
        int i=0;
        int j=0;
        int idx=0;
        while(i<n && j<m){
            if(nums1[i]<=nums2[j]){
                temp[idx++]=nums1[i++];
            }
            else if(nums1[i]>=nums2[j]){
                temp[idx++]=nums2[j++];
            }
        }
        while(i<n){
            temp[idx++]=nums1[i++];
        }
        while(j<m){
            temp[idx++]=nums2[j++];
        }
        return temp;
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[]temp=mergeSorted(nums1,nums2);
        int n=temp.length;
        if(n%2==0){
            return (temp[n/2]+temp[(n/2)-1])/2.0;
        }
        return (double)temp[n/2];
    }
}