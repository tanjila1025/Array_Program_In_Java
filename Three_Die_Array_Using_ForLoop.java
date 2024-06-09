public class Three_Die_Array_Using_ForLoop {
    public static void main(String[] args) {
        int [][][] array={
            {
            {67,90,34},
            {23,32,67}
        },
        {
            {23,56,78,89},
            {23,90,89,45}
        },
        {
            {23,50,78,59},
            {23,80,49,45}
        }
    };
          
    for(int i=0; i<array.length;i++){
        for(int j=0; j<array[i].length;j++){
            for(int k=0;k<array[i][j].length;k++){
                System.out.print(array[i][j][k]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
        }
        
    }

