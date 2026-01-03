class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m = nums2.length;
        int arr[] = new int[m+n];
        int k=0;
        for(int i=0; i<nums1.length; i++)
        {
            arr[k++]=nums1[i];
        }
        for(int j=0; j<nums2.length; j++)
        {
            arr[k++] = nums2[j]; 
        }
      Arrays.sort(arr);
      int len = arr.length;
      double median;
        if(arr.length%2==0)
        {
            median= (arr[len/2] + arr[(len/2)-1])/2.0;
        }
        else
        {
            median = arr[len/2];
        }
        return median;
    }
}



//  System.arraycopy(nums1,0,sonuc,0,nums1.length);
//      System.arraycopy(nums2,0,sonuc,nums1.length , nums2.length);
