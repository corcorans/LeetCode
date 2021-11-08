// https://leetcode.com/problems/median-of-two-sorted-arrays/
class Solution {
    public int[] mergeSort(int[] arr1, int[] arr2)
    {
        int[] merged = new int[arr1.length + arr2.length];
        int a1Idx, a2Idx, mrgIdx;
        a1Idx = a2Idx = mrgIdx = 0;
        
        while(a1Idx < arr1.length && a2Idx < arr2.length)
        {
            if(arr1[a1Idx] < arr2[a2Idx])
                merged[mrgIdx++] = arr1[a1Idx++];
            else
                merged[mrgIdx++] = arr2[a2Idx++];
        }
        
        while(a1Idx < arr1.length)
            merged[mrgIdx++] = arr1[a1Idx++];
        
        while(a2Idx < arr2.length)
            merged[mrgIdx++] = arr2[a2Idx++];
        
        return merged;
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2)
    {
        int[] list = mergeSort(nums1, nums2);
        if(list.length%2 == 0)
            return ((double)list[list.length/2] + (double)list[(list.length/2) - 1]) / 2;
        return (double)list[(list.length - 1)/2];
        
    }
}