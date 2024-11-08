import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Array untuk menyimpan nama cabang olahraga
        String[] cabangOlahraga = {"Badminton", "Tenis Meja", "Basket", "Bola Voli"};
        
        // Perulangan untuk setiap cabang olahraga
        for (int i = 0; i < cabangOlahraga.length; i++) {
            System.out.println("Masukkan nama-nama atlet untuk cabang olahraga " + cabangOlahraga[i] + ":");
            
            // Array untuk menyimpan nama atlet
            String[] atlet = new String[5];
            
            // Perulangan untuk memasukkan nama atlet
            for (int j = 0; j < atlet.length; j++) {
                System.out.print("Atlet ke-" + (j + 1) + ": ");
                atlet[j] = sc.nextLine();
            }
            
            // Menampilkan nama-nama atlet untuk cabang olahraga tersebut
            System.out.println("\nAtlet untuk cabang olahraga " + cabangOlahraga[i] + ":");
            for (int j = 0; j < atlet.length; j++) {
                System.out.println((j + 1) + ". " + atlet[j]);
            }
            System.out.println();
        }
        
        sc.close();
    }
}
