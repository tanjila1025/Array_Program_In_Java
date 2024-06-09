public class Three_Die_Array_Using_ForEach {
    public static void main(String[] args){
        int [][][] array={
            {
                {10,20,30,49},
                {20,30,50,60}
            },
            {
                {60,70,80,90},
                {30,40,60,70}
            },
            {
                {30,40,50,69},
                {50,60,67,50}
            }
        };
        int arr=0;
        for(int[][]matrix:array){
            System.out.println("arr"+arr+":");
            for(int[]i:matrix){
                for(int j:i){
                    System.out.print(j+" ");
                }
                System.out.println();
            }
            System.out.println();
            arr++;
        }
    }
}
