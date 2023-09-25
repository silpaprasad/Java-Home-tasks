public class PrimeNum{
    public static void main(String[] args){
      int n=50;
       System.out.println("Prime numbers:");
      for (int i=2; i<=n; i++){
          int count=1;
          for (int j=2; j*j<=i; j++){
              if (i%j==0){
                  count--;
                  continue;
              }
          }
          if (count == 1){
              System.out.println(i);
          }
      }
    }
}
