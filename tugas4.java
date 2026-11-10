public class tugas4 {
    public static void main(String[] args) {
      // nomor 3
        
        double angka = 9.999;
        int hasilint = (int) angka;

        int nilai = 65;
        char nilaichar = (char) nilai;

        char huruf = 'z';
        int hasilcode = (int) huruf;

        System.out.println("9.999 menjadi int:" + hasilint);
        System.out.println("65 menjadi char:" + nilaichar);
        System.out.println("huruf z menjadi int:" + hasilcode);
       
        // Nomor 4: Memperbaiki int x = 3.5

// Cara 1: Type casting

int x = (int) 3.5; // Hasilnya 3

System.out.println("Cara 1 (casting):" + x);

// Cara 2: Menggunakan double

double y = 3.5; // Nilai desimal tetap tersimpan

System.out.println("Cara 2 (double): " + y);
    }
    
}
