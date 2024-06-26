class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> rows = new HashSet<>();
        Set<Integer> cols = new HashSet<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j] == 0){
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        for(int r:rows){
            for(int j=0;j<matrix[r].length;j++)
                matrix[r][j] = 0;
        }
        for(int c:cols){
            for(int i=0;i<matrix.length;i++)
                matrix[i][c] = 0;
        }
    }
}