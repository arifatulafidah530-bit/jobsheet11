import java.util.Scanner;
public class ModifPenjualanMenu06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah menu: ");
        int jmlMenu = sc.nextInt();
        System.out.print("Masukkan jumlah hari penjualan: ");
        int jmlHari = sc.nextInt();
        sc.nextLine();

        String[] menu = new String[jmlMenu];
        System.out.println("\nMasukkan nama menu:");
        for (int i = 0; i < jmlMenu; i++) {
            System.out.print("Menu ke-" + (i+1) + ": ");
            menu[i] = sc.nextLine();
        }
        int[][] penjualan = new int[jmlMenu][jmlHari];
        System.out.println("\nTabel Input Penjualan");
        for (int i = 0; i < jmlMenu; i++) {
            for (int j = 0; j < jmlHari; j++) {
                System.out.print("Input penjualan " + menu[i] + " hari ke-" + (j+1) + ": ");
                penjualan[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nTabel Penjualan:");
        for (int i = 0; i < jmlMenu; i++) {
            System.out.print(menu[i] + ": ");
            for (int j = 0; j < jmlHari; j++) {
                System.out.print(penjualan[i][j] + " ");
            }
            System.out.println();
        }
        int maxTotal = -1;
        String menuTertinggi = "";
        for (int i = 0; i < jmlMenu; i++) {
            int total = 0;
            for (int j = 0; j < jmlHari; j++) {
                total += penjualan[i][j];
            }
            if (total > maxTotal) {
                maxTotal = total;
                menuTertinggi = menu[i];
            }
        }
        System.out.println("\nMenu dengan total penjualan tertinggi: "
                + menuTertinggi + " (" + maxTotal + ")");
        System.out.println("\nRata-rata penjualan tiap menu:");
        for (int i = 0; i < jmlMenu; i++) {
            double total = 0;
            for (int j = 0; j < jmlHari; j++) {
                total += penjualan[i][j];
            }
            double rata = total / jmlHari;
            System.out.println(menu[i] + ": " + rata);
        }
    }
}

