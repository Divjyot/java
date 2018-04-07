public class Transpose {

    public static int[][] transpose(int[][] multD, int N, int M){

        int k =0;


        for (int i = 0 ; i < N/2 ; i++) {

            for (int j = 0; j < N; j++) {
                int temp1;
                k = (N- j -1);

                temp1 = multD[i][j]; // temp = A;
                multD[i][j] = multD[k][i]; // A = B;
                multD[k][i] = multD[N-i -1][k];
                multD[N-i -1][k] = multD[j][N-i- 1];
                multD[j][N-i -1 ] = temp1;


                System.out.println(multD[i][j] + " <> " + multD[k][i] + " <> " + multD[N-i -1][N-j -1] + " <> " + multD[j][N-i -1 ]);
//                System.out.println(i + "" + j + "<>" + (k) +""+i);
            }
            System.out.println();

        }

        for (int l = 0 ; l < N; l++) {
            for (int j = 0; j < N; j++) {
                System.out.print(multD[l][j] + " ");
            }
            System.out.println();
        }
        return multD;
    }





    public static void main(String[] args) {

        int[][] multD = {{00, 01, 02}, {10, 11, 12}, {20, 21, 22}};

        for (int i = 0; i<multD.length; i++) {
            for (int j = 0; j<multD[i].length; j++) {
                System.out.print(multD[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\n");
        transpose(multD,3,3);
    }
}
