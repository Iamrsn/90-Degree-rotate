// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class xyz {
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{5,6,7,8},{3,2,1,3},{4,5,6,7}};
        transpose(arr);
        reverse(arr);
    }
        public static void transpose(int arr[][]){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<i;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
        }
        }
             printArray(arr);
    }
        
         public static void reverse(int arr[][]){
             int i=0;
             int j=arr[i].length-1;
        for ( i=0;i<arr.length;i++){
            for (int k=0;k<j;k++){
                int temp=arr[i][k];
                arr[i][k]=arr[i][j];
                arr[i][j]=temp;
                j--;
        }
        }
        printArray(arr);
         }
        public static void printArray(int arr[][]){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
