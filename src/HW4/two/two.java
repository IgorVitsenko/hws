package HW4.two;
public class two {
    public static void main(String[] args) {
        int mass [][] = new int[4][5];
        for (int i=0;i< mass.length; i++)
        {
            for (int j=0;j<mass[i].length; j++) {
                mass[i][j]=i+j;
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
    }
}
