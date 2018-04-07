public class RowColZero {

    public static void main(String[] args) {
        int[][] multD = {{00, 01, 02}, {10, 11, 12}, {20, 21, 22}};

        //Keep track of rows and cols..
        // First Scan the whole [][]
        // create row[] and col[] whose elements are set to 1 when some row, col is found to have zero.
        // Traverse the [][] again and when you find same index in [][] where either row[that_row] or col[that_col]
        // equals 1, then set  multd[that_row][that_col] = 0.
    }
}
