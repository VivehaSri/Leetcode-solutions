class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int arr[]=new int[nums1.length+nums2.length];
        for(int i=0;i<nums1.length;i++){
            arr[i]=nums1[i];
        }
        for(int j=0;j<nums2.length;j++){
            arr[nums1.length+j]=nums2[j];
        }
        int sum=0;
        for(int k=0;k<arr.length;k++){
            sum+=arr[k];
        }
       Arrays.sort(arr);
       if (arr.length % 2 == 0) {
            int mid = arr.length / 2;
            return (arr[mid] + arr[mid - 1]) / 2.0;

        } 
         else {
            return arr[arr.length / 2];
        }
    }
}
