public class Two_Die_Array_Using_DoWhile {
    public static void main(String[] args){
        int [][] array={
            {89,90,56,34},
            {34,45,67,89},
            {10,20,38,46}
        };
        int i=0;
        do{
            int j=0;
            do{
                System.out.print(array[i][j]+" ");
                j++;
              }while(j<array[i].length);
              System.out.println();
              i++;
        }while (i<array.length);
    }
}
