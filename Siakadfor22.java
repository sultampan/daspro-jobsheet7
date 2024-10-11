import java.util.Scanner;

/**
 * Siakadfor22
 */
public class Siakadfor22 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double nilai, tertinggi = 0, terendah = 100, bataslulus = 60;
        int jml_lulus = 0, jml_tdk_lulus = 0;

        for (int i = 1; i <= 10; i++){
            System.out.print("Masukkan Nilai Mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai >= bataslulus) {
                jml_lulus++;
                System.out.println("Siswa Lulus");
            }
            else {
                jml_tdk_lulus++;
                System.out.println("Siswa Tidak Lulus");
            }
            
        }
        System.out.println("Nilai Tertinggi: " + tertinggi);
        System.out.println("Nilai Terendah: " + terendah );
        System.out.println("Jumlah Siswa Lulus: " + jml_lulus);
        System.out.println("Jumlah Siswa Tidak Lulus: " + jml_tdk_lulus);
    }
}