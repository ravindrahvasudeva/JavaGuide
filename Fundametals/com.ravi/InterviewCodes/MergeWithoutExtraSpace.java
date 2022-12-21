/*Given two sorted arrays arr1[] and arr2[] of sizes n and m in non-decreasing order. Merge them in sorted order without using any extra space.
 Modify arr1 so that it contains the first N elements and modify arr2 so that it contains the last M elements.*/
class Solution{
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
int i = 0, j = 0, k = n - 1;
        while (i <= k && j < m) {
            if (arr1[i] < arr2[j])
                i++;
            else {
                long temp = arr2[j];
                arr2[j] = arr1[k];
                arr1[k] = temp;
                j++;
                k--;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        }}
        
        
        
        
        
        
        
        
        
        
