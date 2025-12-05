public class PenjualanMenu06 {
    public static void main(String[] args) {
        String[] menu = {"Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan"};
        int[][] penjualan = {
            {20, 20, 25, 20, 10, 60, 10},
            {30, 80, 40, 10, 15, 20, 25},
            {5, 9, 20, 25, 10, 5, 45},
            {50, 8, 17, 18, 10, 30, 6},
            {15, 10, 16, 10, 10, 55, 15}
        };
        System.out.println("Tabel Penjualan 7 Hari:");
        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i] + ": ");
            for (int j = 0; j < 7; j++) {
                System.out.print(penjualan[i][j] + " ");
            }
            System.out.println();
        }
        int maxTotal = 0;
        String menuTertinggi = "";
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < 7; j++) {
                total += penjualan[i][j];
            }
            if (total > maxTotal) {
                maxTotal = total;
                menuTertinggi = menu[i];
            }
        }
        System.out.println("\nMenu dengan total penjualan tertinggi: " + menuTertinggi + " (" + maxTotal + ")");
        System.out.println("\nRata-rata penjualan tiap menu:");
        for (int i = 0; i < menu.length; i++) {
            double total = 0;
            for (int j = 0; j < 7; j++) {
                total += penjualan[i][j];
            }
            double rata = total / 7;
            System.out.println(menu[i] + ": " + rata);
        }
    }
}
