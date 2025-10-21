package Codelab1_Refactoring;

public class FutsalBooking {
    String customerName;
    int duration;
    double pricePerHour;

    public FutsalBooking(String name, int duration, double pricePerHour) {
        this.customerName = name;
        this.duration = duration;
        this.pricePerHour = pricePerHour;
    }

    public void displayInfo() {
        double total = duration * pricePerHour;
        System.out.println("Pelanggan: " + customerName);
        System.out.println("Durasi: " + duration + " jam");
        System.out.println("Harga per jam: " + pricePerHour);
        System.out.println("Total Bayar: " + total);
    }
}