import java.util.Scanner;

public class tugas {
    public static void main (String[] args) {
        Scanner farhat = new  Scanner (System.in);
        
        System.out.println("nama ku adalah : ");
        String nama = farhat.nextLine();
        
        System.out.println("umurku adalah : ");
        int umur = Integer.parseInt(farhat.nextLine());
        

        System.out.println("ayahku adalah : ");
        String ayah = farhat.nextLine();

        System.out.println("ibuku adalah : ");
        String ibu = farhat.nextLine();

       System.out.println("saya adalah : " +nama);
       System.out.println("umurku adalah : "+umur);
       System.out.println("ayahku adalah : "+ayah);
       System.out.println("ibuku adalah : "+ibu);
       farhat.close();
    }

    
}
