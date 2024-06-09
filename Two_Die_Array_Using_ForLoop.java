public class Two_Die_Array_Using_ForLoop {
    public static void main(String[] args){
        int [][] arr={
            {23,78,90},
            {45,67,56},
            {12,45,26}
        };//2D array decleration & initailization

        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
