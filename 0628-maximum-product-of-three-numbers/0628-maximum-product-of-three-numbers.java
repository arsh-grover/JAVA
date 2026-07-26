class Solution {
    public int maximumProduct(int[] arr) {
        int mini=Integer.MAX_VALUE,sMin=Integer.MAX_VALUE,maxi=Integer.MIN_VALUE,sMax=Integer.MIN_VALUE,tMax=Integer.MIN_VALUE;
       int n=arr.length;
        // second maximum
       for(int i=0;i<n;i++){

        if(arr[i]<=mini){
                sMin=mini;
                mini=arr[i];
            }
            else if(arr[i]<sMin){
                sMin=arr[i];
            }

        if(arr[i]>=maxi){
            tMax=sMax;
            sMax=maxi;
            maxi=arr[i];
        }

        else if(arr[i]>=sMax){
            tMax=sMax;
            sMax=arr[i];
        }

        else if(arr[i]>=tMax){
            tMax=arr[i];
        }
        
       }
        int fans=mini*sMin*maxi;
        int sans=maxi*sMax*tMax;
        if(fans>sans) return fans;
        return sans;
    }
}