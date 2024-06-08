public class For_Each_Example {
    public static void main(String[] args){
        int [][] a= {{45,78,90},{45,89},{23,78,34,90}};
        for(int[]i:a)
           for(int j:i)
            System.out.print(j +" ");
            
    }
    
}
