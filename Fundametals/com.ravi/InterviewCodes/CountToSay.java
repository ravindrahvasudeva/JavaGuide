/*The count-and-say sequence is a sequence of digit strings defined by the recursive formula:

countAndSay(1) = "1"
countAndSay(n) is the way you would "say" the digit string from countAndSay(n-1), which is then converted into a different digit string.
To determine how you "say" a digit string, split it into the minimal number of substrings such that each substring contains exactly one unique digit. Then for each substring, say the number of digits, then say the digit. Finally, concatenate every said digit.

For example, the saying and conversion for digit string "3322251":*/

class Solution {
    public String countAndSay(int n) {
    if(n==1) return "1";
    // Recursion
    String s=countAndSay(n-1);
    String res="";
    int counter=0;
    for(int i=0;i<s.length();i++)
    {
    counter++;
    // Segregating into groups
    if(i==s.length()-1 || s.charAt(i)!=s.charAt(i+1))
    {
    
    res=res+counter+s.charAt(i);
    counter=0;
    }
    }
    return res;
    }
    }
/*Input: n = 1
Output: "1"
Explanation: This is the base case.*/