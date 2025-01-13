import java.util.*;
public class Check{
    public static void main(String[] args){
        System.out.println("Check it now");
        Scanner sc = new Scanner(System.in);
        int r=3;
        int c =3;

        int[][] mat = new int[r][c];
        for(int i =0;i<r;i++){
            for(int j =0;j<c;j++){
                mat[i][j]=sc.nextInt();
            }
        }
            for(int i =0;i<r;i++){
            for(int j =0;j<c;j++){
                System.out.print(mat[i][j]+" ");
                // 
            }
            System.out.println();
        }
    }
}