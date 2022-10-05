class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m[][]=new int[r][c];
        int row=mat.length;
        int col = mat[0].length;
    if(row*col!=r*c){
        return mat;
    }
        int ri=0;
        int ci=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                m[ri][ci]=mat[i][j];
                ci++;
                if(ci>=c){
                    ci%=c;
                    ri++;
                }
            }
        }
        return m;
    }
}