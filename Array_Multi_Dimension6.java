import Arrays.java;

public class Array_Multi_Dimension6{
    public static void main(String[] args){
        int[][][]d=new int[2][2][];
        d[0][0]=new int[1];
        d[0][1]=new int[2];
        d[1][0]=new int[1];
        d[1][1]=new int[2];

        d[0][0][0]=90;
        d[0][1][0]=23;
        d[0][1][1]=89;
        d[1][0][0]=99;
        d[1][1][0]=67;
        d[1][1][1]=56;
        System.out.println(Arrays.deepToString(d));
    }
}
