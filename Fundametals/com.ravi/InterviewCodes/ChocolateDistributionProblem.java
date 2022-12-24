import java.util.Arrays;

/*Given an array of N integers where each value represents the number of chocolates in a packet. Each packet can have a variable number of chocolates. There are m students, the task is to distribute chocolate packets such that:/* */
/*Each student gets one packet.
The difference between the number of chocolates in the packet with maximum chocolates and the packet with minimum chocolates given to the students is minimum. */



public class ChocolateDistributionProblem {
    static int findMD(int arr[], int n, int m)
    {
        
        if (m == 0 || n == 0)
            return 0;
        Arrays.sort(arr);
        if (n < m)
            return -1;
        int min_diff = Integer.MAX_VALUE;
 
        for (int i = 0; i + m - 1 < n; i++) {
            int diff = arr[i + m - 1] - arr[i];
            if (diff < min_diff)
                min_diff = diff;
        }
        return min_diff;
    }
    public static void main(String[] args)
    {
        int arr[] = { 5,1,3,56,11,12,75,16,20,18 };
 
        int m = 5; 
 
        int n = arr.length;
        System.out.println("Minimum difference in ChocolateDistributionProblem is " + findMD(arr, n, m));
    }
}