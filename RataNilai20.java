import java.util.Scanner;

public class RataNilai20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        int i,j, nilaiMhs;
        float nilai, totalNilai, rataNilai;

        i=1;
        while (1<=5) {
            System.out.println("Input nilai mahasiswa ke " + i);
            totalNilai=0;

            for (j=1;j<=5;j++) {
                System.out.println("Nilai ke- " +j + " = ");
                nilaiMhs=sc.nextInt();
                totalNilai+=nilaiMhs;
            }
            rataNilai=totalNilai/5;
            System.out.println("Rata-rata nilai mahasiswa ke " + i + " adalah " + rataNilai);
        }
    }
}