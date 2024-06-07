import java.util.Arrays;

public class Array_Multi_Dimension3 {
    public static void main(String[] args) {
        int[][] num =new int[3][3];
        num[0][0]=20;
        num[0][1]=30;
        num[0][2]=90;
        
        num[1][0]=78;
        num[1][1]=56;
        num[1][2]=89;
        
        num[2][0]=78;
        num[2][1]=56;
        num[2][2]=89;
        
        System.out.println(Arrays.deepToString(num));
    }
}
