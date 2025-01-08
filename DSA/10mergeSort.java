import java.util.Arrays;

class Solution10 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        //last element of num1 arr 
        int i = m-1;
        //last element of num2 arr
        int j = n-1;
        //last element of whole num1 arr
        int k = m+n-1;

        while(j>=0){
            if(i>=0 && nums1[i]>nums2[j]){
                nums1[k] = nums1[i];
                k--;
                i--;

            }
            else{
                nums1[k]=nums2[j];
                k--;
                j--;
            }
        }
    }

    public static void main(String[] args){
        int nums1[] = {1,2,3,0,0,0};
        int nums2[] = {2,5,6};
        int m=3;
        int n=3;
        merge(nums1 , m , nums2 , n);
        for(int i=0;i<m+n;i++){
            System.out.println(nums1[i] + " ");
        }
    }    
}