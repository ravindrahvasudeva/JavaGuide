
class Solution 
{
    int getMinDiff(int[] arr, int n, int k) 
    {
        int min=0,max=0,r=0;
        Arrays.sort(arr);
        r=arr[n-1]-arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]>=k)
            {
            max=Math.max(arr[i-1]+k,arr[n-1]-k);
            min=Math.min(arr[i]-k,arr[0]+k);
            r=Math.min(r,max-min);
            }
            else
            {
                continue;
            }
        }
        return r;
    }
}




/*Input:
K = 2, N = 4
Arr[] = {1, 5, 8, 10}
Output:
5
Explanation:
The array can be modified as 
{3, 3, 6, 8}. The difference between 
the largest and the smallest is 8-3 = 5.*/