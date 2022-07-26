import java.util.Arrays;
import java.util.Scanner;
class Main {    
public static void main(String[] args) {
  Scanner sc= new Scanner(System.in);
    int arr[]=new int[5];
System.out.println("Enter the array elements");
for(int i=0;i<arr.length;i++){
    arr[i]=sc.nextInt();
}
    // for(int i=0;i<arr.length;i++){
    //     System.out.println(arr[i]);
    // }
    //enchance for 
    for(int j:arr){
        System.out.println(j);
    }
System.out.print(Arrays.toString(arr));

    
}
}
       
          
    

