class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int m=nums1.length,n=nums2.length;
        int maxLen=Math.min(m,n);
        int arr[]=new int[maxLen];
        int i=0,j=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int k=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                if (k == 0 || arr[k - 1] != nums1[i]) {
                    arr[k++] = nums1[i];
                }
                i++;j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else j++;
        }
        return Arrays.copyOf(arr,k);
        }
    }
