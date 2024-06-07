import java.util.Arrays;

public class Array_Multi_Dimension {
    public static void main(String[] args) {
        int [][] a =new int[2][3];
          a[0][0]=10;
          a[0][1]=67;
          a[0][2]=90;
          a[1][0]=89;
          a[1][1]=56;
          a[1][2]=45;
          System.out.println("Array1");
          System.out.println(Arrays.deepToString(a));

    }
}

/*OUTPUT:
 * CT:Success
 * RT:Success
 * Array1
[[10, 67, 90], [89, 56, 45]]
 */
