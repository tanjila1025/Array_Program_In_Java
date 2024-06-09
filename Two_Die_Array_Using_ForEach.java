public class Two_Die_Array_Using_ForEach {
    public static void main(String[] args){
        int [][] array={
            {34,90,45,23},
            {34,45,67,12},
            {36,78,13,90}
        };
        for(int[] i : array) { // loop through each row
            for(int j : i) { // loop through each element in the row
                System.out.print(j+ " ");
            }
          System.out.println();
        }
    }
}
