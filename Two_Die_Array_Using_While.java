public class Two_Die_Array_Using_While {
    public static void main(String[] args) {
        int [][]array={
            {34,90,56},
            {67,89,90},
            {10,30,50}
            };
            int i = 0;
        while (i<array.length) { // outer loop for rows
            int j = 0;
            while (j<array[i].length) { // inner loop for columns
                System.out.print(array[i][j] + " ");
                j++;
            }
            System.out.println();
            i++; 
        }
    }
}

