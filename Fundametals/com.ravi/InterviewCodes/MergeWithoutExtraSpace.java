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
        
        
        
        
        
        
        
        
        
        
/*Input: 
n = 4, arr1[] = [1 3 5 7] 
m = 5, arr2[] = [0 2 6 8 9]
Output: 
arr1[] = [0 1 2 3]
arr2[] = [5 6 7 8 9]
Explanation:
After merging the two 
non-decreasing arrays, we get, 
0 1 2 3 5 6 7 8 9.*/