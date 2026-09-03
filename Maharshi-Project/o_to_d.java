import java.util.*;

public class o_to_d{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int i,j,m,n,dec = 0;
        System.out.println("Enter the no. of rows and columns : ");
        m = in.nextInt();
        n = in.nextInt();
        int  a[][]=new int[m][n];

        System.out.println("Enter the no.'s : ");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                a[i][j]=in.nextInt();
                if(a[i][j]>7){
                    System.out.println("Invalid input");
                    System.exit(0);
                }
            }
        }

        System.out.println("Filled Matrix:"+"\t"+"Decimal Value");
        for (i=0;i<m;i++){
            for(j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
                dec+= (int) (a[i][j]*Math.pow(8,n-j-1));
            }
            System.out.println("\t\t"+dec);
        }
    }
}