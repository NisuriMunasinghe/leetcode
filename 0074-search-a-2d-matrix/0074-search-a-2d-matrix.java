class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n=matrix[0].length;
        int low_row=0;
        int high_row=m-1;
        int low_column=0;
        int high_column=n-1;
        while (high_row>low_row){
            int midrow=low_row+(high_row-low_row+1)/2;
            if(target>=matrix[midrow][0]){
                low_row=midrow;
            }
            else if (target<=matrix[midrow-1][n-1]){
                high_row=midrow-1;
            }
            else{
                return false;
            }
        }
        while (high_column>low_column){
            int mid_column=low_column+(high_column-low_column+1)/2;
            if(target==matrix[low_row][mid_column]){
                return true;
            }
            else if(target>matrix[low_row][mid_column]){
                low_column=mid_column;
            }
            else if(target<matrix[low_row][mid_column]){
                high_column=mid_column-1;
            }
            else{
                return false;
            }
        }
        if (matrix[low_row][low_column]==target){
            return true;
        }
        return false;
        
    }
}


