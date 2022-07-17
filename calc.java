import java.util.Scanner;
class Main {
  public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
      int ans=0;
 //Taken  input from the user 
      while(true){
          //take the operator as input
          System.out.println("Enter the Operator");
          char op=sc.next().trim().charAt(0);
         if(op == '+'|| op == '-'|| op =='*'||op == '/'){
             //input 2 numbers
            System.out.println("Enter the 2 numbers");
             int num1=sc.nextInt();
             int num2=sc.nextInt();
             if(op == '+'){
                 ans=num1+num2;
             }
             if(op == '-'){
                 ans=num1-num2;
             }
             if(op == '*'){
                 ans=num1*num2;
             }
             if(op == '/'){
                 ans=num1/num2;
             } 
                 
         
}
else if(op == 'x' || op == 'X'){
    break;
}else{
    System.out.println("Invalid Operation");
}
          System.out.println(ans);
}

}
}
