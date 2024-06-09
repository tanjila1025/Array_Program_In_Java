public class Three_Die_Array_Using_DoWhile1 {
    public static void main(String[] args) {
        int [][][] array={
          {
            {10,70,30},{70,90}
          },
          {
            {60,90,70},{90,80,70}
          },
          {
            {30,70},{80,90,100}
          }
        };
        int i=0;
        do{
            int j=0;
            do{
                int k=0;
                do{
                    System.out.print(array[i][j][k]+" ");
                    k++;

                }while(k<array[i][j].length);
                System.out.println();
                j++;
            }while (j<array[i].length);
                System.out.println();
                i++;
        }while (i<array.length);
    }
}
