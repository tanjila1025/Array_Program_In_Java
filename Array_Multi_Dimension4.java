import java.util.Arrays;

public class Array_Multi_Dimension4 {
    public static void main(String[] args) {
        int [][] b=new int[3][];//decleration

        b[0]= new int[2];//initialization
        b[1]= new int[1];
        b[2]= new int[2];

        b[0][0]=78;
        b[0][1]=45;
        b[1][0]=67;
        b[2][0]=65;
        b[2][1]=34;

        System.out.println(Arrays.deepToString(b));
    }
}
