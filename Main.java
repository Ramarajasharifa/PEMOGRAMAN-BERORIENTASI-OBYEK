import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah orang: ");
        int jumlahOrang = scanner.nextInt();
        System.out.println();

        int[][] umur = new int[jumlahOrang][2]; // Array multidimensi untuk menyimpan umur dan status

        int i = 0;
        while (i < jumlahOrang) {
            System.out.print("Masukkan umur orang ke-" + (i + 1) + ": ");
            umur[i][0] = scanner.nextInt(); // Simpan umur

            if (umur[i][0] >= 18) {
                umur[i][1] = 1; // Status dewasa
            } else {
                umur[i][1] = 0; // Status anak-anak
            }

            i++;
        }

        System.out.println("Umur setiap orang:");
        i = 0;
        do {
            System.out.println("Orang ke-" + (i + 1) + ": " + umur[i][0] + " tahun");
            i++;
        } while (i < jumlahOrang);

        // Menampilkan status orang
        System.out.println("Status setiap orang:");
        for (i = 0; i < jumlahOrang; i++) {
            if (umur[i][1] == 1) {
                System.out.println("Orang ke-" + (i + 1) + " adalah dewasa");
            } else {
                System.out.println("Orang ke-" + (i + 1) + " adalah anak-anak");
            }
        }
    }
}


