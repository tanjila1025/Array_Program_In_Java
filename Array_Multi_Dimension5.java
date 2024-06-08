import java.util.Arrays;

public class Array_Multi_Dimension5 {
    public static void main(String[] args){
      int [][][] c= new int[2][2][2];
      
      c[0][0][0]=56;
      c[0][0][1]=50;
      c[0][1][0]=67;
      c[0][1][1]=37;

      c[1][0][0]=67;
      c[1][0][1]=78;
      c[1][1][0]=23;
      c[1][1][1]=39;

      System.out.println(Arrays.deepToString(c));
    }
}
