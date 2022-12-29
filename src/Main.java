public class Main {
    public static void main(String[] args) {


        int[][] matris={
                {1,2,3},
                {4,5,6}
        };
        System.out.print("Transpoze : \n");
        for (int[] val : matris) {
            for (int l : val) {
                System.out.print(l + " ");
            }
            System.out.println();
        }


        int [][] transpoz=new int[matris[0].length][matris.length];
        for(int i=0;i< matris.length;i++){
            for (int j=0;j<matris[0].length;j++){
                transpoz[j][i]=matris[i][j];
            }
        }

        System.out.println("------------------");
        System.out.print("Transpoze : \n");
        for (int[] val : transpoz) {
            for (int k : val) {
                System.out.print(k + " ");
            }
            System.out.println();
        }

    }
}