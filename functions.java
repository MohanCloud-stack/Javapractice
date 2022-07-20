import java.util.Scanner;
class Main {

    public static void sum(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number");
      int n1=sc.nextInt();
    System.out.println("Enter the second number");
      int n2=sc.nextInt();
      int sum=n1+n2;
      System.out.println("The sum is ="+sum);  
    }

    public static int sum1(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number");
      int n1=sc.nextInt();
    System.out.println("Enter the second number");
      int n2=sc.nextInt();
      int sum=n1+n2;
    return sum;
    }
  public static void main(String[] args) {
 int ans=sum1();
System.out.println(ans);
  }
}
