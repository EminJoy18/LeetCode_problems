class Solution 
{
    public int diagonalSum(int[][] mat) 
    {
        int sum = 0;
        if(mat.length == 1)
            sum = mat[0][mat[0].length / 2];
        else
        {
            int trace = 0;
            for(int i=0;i<mat.length;i++)
            {
                trace = trace + mat[i][i];
            }
            for(int i=mat.length-1;i>=0;i--)
                trace = trace + mat[i][mat.length - 1 - i];

            if(mat.length % 2 != 0)
                trace = trace - ( mat[mat.length / 2][mat.length / 2] );
                //subtracting the central term
            
            sum = trace;
        }
        return sum;   
    }
}
