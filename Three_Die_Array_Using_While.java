public class Three_Die_Array_Using_While {
    public static void main(String[] args) {
        int[][][] array={
         
            {
                {67,90,34},
                {45,78,56}
            },
            {
                {45,56,78},
                {78,21,41}
            },
            {
                {56,78,89},
                {38,89,90}
            }
        };
        int i=0;
        while(i<array.length){
            int j=0;
            while(j<array[i].length){
                int k=0;
                while(k<array[i][j].length){
                    System.out.print(array[i][j][k]+" ");
                    k++;
                }
                System.out.println();
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
