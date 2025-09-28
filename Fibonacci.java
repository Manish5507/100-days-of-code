public class primecheck {
  
    public static void main(String[] args) {
        System.out.println("what");
        int f1= 0;
        int f2=1;
        int f3=0;
        for (int i = 0; i<20; i ++){
            f3 = f1 + f2;
            f1=f2;
            f2=f3;
        }
        System.out.println(f3);
    }
}
