package Tugas1;

import java.util.Scanner;


public class NotaPemesanan {
    private Menu menu;
    private Scanner scanner;
    private String pesanan;
    private int jumlah;
    private double totalHarga;

    public NotaPemesanan() {
        menu = new Menu();
        scanner = new Scanner(System.in);
    }

    public void jalankan() {
        menu.tampilkanMenu();
        System.out.print("Pilih nomor makanan (1-" + menu.getJumlahMenu() + "): ");
        int pilihan = scanner.nextInt() - 1;

        if (pilihan < 0 || pilihan >= menu.getJumlahMenu()) {
            System.out.println("Pilihan tidak valid!");
            return;
        }

        System.out.print("Masukkan jumlah pesanan: ");
        jumlah = scanner.nextInt();

        tampilkanNota(menu.getNama(pilihan), jumlah, totalHarga);
    }

    // Custom Live Template: hitungtotal
    // Template Text:
    /*
    totalHarga = jumlah * menu.getHarga(pilihan);
    // Tambahkan pajak 10%
    totalHarga = totalHarga * 1.1;
    */



    private void tampilkanNota(String nama, int qty, double total) {
        System.out.println("\n=== NOTA PEMESANAN ===");
        System.out.println("Makanan   : " + nama);
        System.out.println("Jumlah    : " + qty);
        System.out.println("Total Bayar: Rp" + String.format("%.0f", total));
        System.out.println("========================");
    }
}
