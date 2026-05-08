class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
    //     int rows = matrix.length;
    //     int cols= matrix[0].length;

    //     for(int i = 0; i<rows; i++){
    //         for(int j= 0; j<cols;j++){
    //             if (matrix[i][j] == target) return true;

    //         }
    //     }
    //     return false;
for(int r = 0; r<matrix.length; r++){
    int left = 0;
    int right = matrix[0].length -1;
    while(left<=right){
        int mid = (left+right)/2;
        if(matrix[r][mid] == target){
            return true;
        } else if (matrix[r][mid]< target) {
            left = mid+1;
    } else {
        right = mid-1;
    }
}

    }
return false;
}
}