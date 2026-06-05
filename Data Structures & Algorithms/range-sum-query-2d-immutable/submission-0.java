class NumMatrix {
    int[][] mat;
    int rows;
    int cols;

    public NumMatrix(int[][] matrix) {

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            mat = new int[0][0];
            rows = 0;
            cols = 0;
        } 
        else {
            mat = matrix;
            rows = matrix.length;
            cols = matrix[0].length;
        }
    }
    
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
     
        int sum=0;

        for(int i=row1; i<=row2; i++){
            for(int j=col1; j<=col2; j++){
                sum+=mat[i][j];
            }
        }
      return sum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */