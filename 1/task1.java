public class task1 {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        for (int j = 0; j < a.length; j++) {
            for (int i = 0; i < a.length; i++) {
                int tran = a[i][j];
                a[i][j]=a[j][i];
                a[i][j]=tran;
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }}
