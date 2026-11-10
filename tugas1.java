import java.util.Scanner;

public class tugas1 {
       public static void main(String[] args){
        System.out.println("nama\t\t\t\tkampus\tprodi\t\temail");
        System.out.println("abdulloh farchat kafabi\tUISI\tinformatika\tabdulloh.kafabi26@student.uisi.ac.id");

        System.out.print("\nabdulloh farchat kafabi\nkampus:UISI\nprodi:informatika\nemail:abdulloh.kafabi26@student.uisi.ac.id\n");

        Scanner farchat = new  Scanner (System.in);
        
        System.out.println("nama ku adalah : ");
        String nama = farchat.nextLine();
        
        System.out.println("umurku sekarang adalah :  ");
        int umur = Integer.parseInt(farchat.nextLine());

        System.out.println("saya adalah : " +nama);
        System.out.println("tahun depan umurku : "+ (umur +1));

        
        int a = 60;
        int b = 20;
        
        System.out.println(a+b*a-b/a);
        System.out.println("jumlah     : "+(a + b));
        System.out.println("selisih    : "+(a - b));
        System.out.println("perkalian  : "+(a * b));
        System.out.println("pembagian  : "+(a / b));
        System.out.println("hasil bagi : "+ String.format("%.2f", (double) a / b));
        


       } 
}
