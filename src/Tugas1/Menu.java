package Tugas1;

/*
daftar menu makanan dan haraga per porsi
 */
public class Menu {
    private String[] namaMakanan = {"Nasi Goreng", "Mie Ayam", "Bakso", "Soto Ayam"};
    private double[] hargaMakanan = {15000, 12000, 13000, 11000};

    public void tampilkanMenu() {
        System.out.println("=== MENU MAKANAN ===");
        for (int i = 0; i < namaMakanan.length; i++) {
            System.out.println((i + 1) + ". " + namaMakanan[i] + " : Rp" + hargaMakanan[i]);
        }
        System.out.println();
    }

    public double getHarga(int index) {
        return hargaMakanan[index];
    }

    public String getNama(int index) {
        return namaMakanan[index];
    }

    public int getJumlahMenu() {
        return namaMakanan.length;
    }
}
