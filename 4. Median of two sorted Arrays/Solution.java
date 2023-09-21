import java.util.Arrays;
class Solution 
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        // optimised code for a runtime of 4ms and memory of 44.53mb
        int[] a = new int[nums1.length + nums2.length];
        int k = 0;
        for(int i:nums1) a[k++] = i;
        for(int i:nums2) a[k++] = i;
        Arrays.sort(a);
        double median = 0.0d;
        if(a.length%2 != 0)
            median = a[(a.length-1)/2];
        else if(a.length%2 == 0)
            median = ( a[(int)(a.length-1)/2] + a[(int)(a.length)/2] ) / 2.0;
        return median;


        // optimised code for a runtime of 1ms and memory of 44.32mb
        // int n = nums1.length;
        // int m = nums2.length;
        // int i = 0, j = 0, m1 = 0, m2 = 0;

        // for (int count = 0; count <= (n + m) / 2; count++) {
        //     m2 = m1;
        //     if (i != n && j != m) {
        //         if (nums1[i] > nums2[j]) {
        //             m1 = nums2[j++];
        //         } else {
        //             m1 = nums1[i++];
        //         }
        //     } else if (i < n) {
        //         m1 = nums1[i++];
        //     } else {
        //         m1 = nums2[j++];
        //     }
        // }

        // // Check if the sum of n and m is odd.
        // if ((n + m) % 2 == 1) {
        //     return (double) m1;
        // } else {
        //     double ans = (double) m1 + (double) m2;
        //     return ans / 2.0;
        // }
    }
}
