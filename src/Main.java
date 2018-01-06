import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner reader = new Scanner(System.in);
        n = reader.nextInt();
        while(n>0){
           int a = reader.nextInt();
           int b = reader.nextInt();
           for(int i=a;i<=b;i++){
               if(isPrime(i)){
                   System.out.println(i);
               }
           }
           System.out.println("");
        }
        reader.close();
    }

    protected static boolean isPrime(int n) {
        if(n==1){
            return false;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
