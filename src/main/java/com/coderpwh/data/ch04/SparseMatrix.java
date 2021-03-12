package com.coderpwh.data.ch04;

/**
 * @author coderpwh
 */
public class SparseMatrix {

    public TripleNode data[];

    public int rows;

    public int cols;

    public int nums;


    /***
     *  构造方法--初始化大小，分配存储空间大小
     * @param maxSize
     */
    public SparseMatrix(int maxSize) {
        data = new TripleNode[maxSize];

        for (int i = 0; i < data.length; i++) {
            data[i] = new TripleNode();
        }
        rows = 0;
        cols = 0;
        nums = 0;
    }

    public SparseMatrix(int mat[][]) {
        int i;
        int j;
        int k = 0;
        int count = 0;

        rows = mat.length;
        cols = mat[0].length;

        for (i = 0; i < mat.length; i++) {

            for (j = 0; j < mat[i].length; j++) {
                if (mat[i][j] != 0) {
                    count++;
                }
            }
        }

        nums = count;
        data = new TripleNode[nums];

        for (i = 0; i < mat.length; i++) {
            for (j = 0; j < mat[i].length; j++) {
                if (mat[i][j] != 0) {
                    data[k] = new TripleNode(i, j, mat[i][j]);
                    k++;
                }
            }
        }

    }


    public SparseMatrix transpose() {
        SparseMatrix tm = new SparseMatrix(nums);
        tm.cols = rows;
        tm.rows = cols;
        tm.nums = nums;

        int q = 0;

        for (int col = 0; col < cols; col++) {

            for (int p = 0; p < nums; p++) {
                if (data[p].column == col) {
                    tm.data[q].row = data[p].column;
                    tm.data[q].column = data[p].row;
                    tm.data[q].value = data[p].value;
                    q++;

                }
            }
        }
        return tm;
    }


}
