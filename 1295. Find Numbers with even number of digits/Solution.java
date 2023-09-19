class Solution {

    static boolean even_digits(int n)
    {
        String s = Integer.toString(n);
        if (s.length() % 2 == 0) return true;
        else return false;
    }

    public int findNumbers(int[] nums) 
    {
        int count = 0;

        for(int i:nums)
        {
            if(even_digits(i))
                count ++;
        }
        return count;
    }
}
