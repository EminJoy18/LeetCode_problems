You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.

A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.

 

Example 1:<br>

Input: accounts = [[1,2,3],[3,2,1]]<br>
Output: 6<br>
Explanation:<br>
1st customer has wealth = 1 + 2 + 3 = 6<br>
2nd customer has wealth = 3 + 2 + 1 = 6<br>
Both customers are considered the richest with a wealth of 6 each, so return 6.<br>
<br><br>
Example 2:
<br>
Input: accounts = [[1,5],[7,3],[3,5]]<br>
Output: 10<br>
Explanation: <br>
1st customer has wealth = 6<br>
2nd customer has wealth = 10 <br>
3rd customer has wealth = 8<br>
The 2nd customer is the richest with a wealth of 10.<br><br>
Example 3:<br>

Input: accounts = [[2,8,7],[7,1,3],[1,9,5]]<br>
Output: 17<br>
 

Constraints:

m == accounts.length<br>
n == accounts[i].length<br>
1 <= m, n <= 50<br>
1 <= accounts[i][j] <= 100<br>

![image](https://github.com/EminJoy18/LeetCode_problems/assets/97777160/5b9c38a8-d94d-4cc4-a9bb-4b92477c2f0f)

