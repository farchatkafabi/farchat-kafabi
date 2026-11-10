public class tugas3 {
    public static void main(String[] args) {

        int b = 10;
        int a = 20;
        int temp;
        
        System.out.println("sebelum ditukar");
        System.out.println("A:"  + a);
        System.out.println("B:" + b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("setelah ditukar");
        System.out.println("A:" + a);
         System.out.println("B:" + b);

    }
}
