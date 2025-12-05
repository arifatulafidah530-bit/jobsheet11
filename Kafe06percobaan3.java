import java.util.Scanner;

public class Kafe06percobaan3 {
    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("=======================================");
        System.out.println(" Selamat datang, " + namaPelanggan + "!");
        
        if (isMember) {
            System.out.println(" Status: MEMBER");
        }
        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            System.out.println(" Info: Diskon tambahan 50%");
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            System.out.println(" Info: Diskon tambahan 30%");
        } else {
            System.out.println(" Info: Kode promo invalid");
        }
        System.out.println("=======================================");

        System.out.println("============= MENU KAFE ===============");
        System.out.println("1. Kopi Hitam      - Rp 15.000");
        System.out.println("2. Cappuchino      - Rp 20.000");
        System.out.println("3. Latte           - Rp 22.000");
        System.out.println("4. Teh Tarik       - Rp 12.000");
        System.out.println("5. Roti Bakar      - Rp 10.000");
        System.out.println("6. Mie Goreng      - Rp 18.000");
        System.out.println("=======================================");
    }
    public static int hitungTotalHarga(int pilihanMenu, int jumlahPesanan, String kodePromo) {
        int[] harga = {15000, 20000, 22000, 12000, 10000, 18000};
        int total = harga[pilihanMenu - 1] * jumlahPesanan;
        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            total -= total * 50 / 100;
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            total -= total * 30 / 100;
        } else {
            System.out.println("Kode Promo Invalid (tidak ada diskon)");
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Menu("Budi", true, "DISKON50");
        System.out.print("\nBerapa jenis menu yang ingin Anda pesan? ");
        int jumlahJenis = sc.nextInt();
        int totalKeseluruhan = 0;

        for (int i = 1; i <= jumlahJenis; i++) {
            System.out.println("\n========== Pesanan ke-" + i + " ==========");
            System.out.print("Masukkan nomor menu (1-6): ");
            int pilihanMenu = sc.nextInt();
            System.out.print("Masukkan jumlah item: ");
            int banyakItems = sc.nextInt();
            System.out.print("Masukkan kode promo: ");
            String kodePromo = sc.next();
            int totalBayar = hitungTotalHarga(pilihanMenu, banyakItems, kodePromo);
            System.out.println("Subtotal pesanan ke-" + i + ": Rp " + totalBayar);
            totalKeseluruhan += totalBayar;
        }
        System.out.println("\n=======================================");
        System.out.println(" TOTAL KESELURUHAN PESANAN: Rp " + totalKeseluruhan);
        System.out.println("=======================================");
    }
}
