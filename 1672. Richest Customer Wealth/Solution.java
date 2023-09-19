class Solution 
{
    static int sum(int[] a)
    {
        int sum = 0;
        for(int i:a) sum += i;
        return sum;
    }

    static int max(int[] a)
    {
        int max = a[0];
        for(int i:a)
        {
            if(max<i)
            max = i;
        }
        return max;
    }

    public int maximumWealth(int[][] accounts) 
    {
        int k = 0;
        int[] sums = new int[accounts.length];
        for(int[] i:accounts)
        {
            sums[k++] = sum(i);
        }
        return max(sums);
    }
}
