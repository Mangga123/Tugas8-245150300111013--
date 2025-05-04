// Class Employee juga mengimplementasikan interface Payable
// Artinya class ini juga WAJIB membuat method getPayableAmount()

public class Employee implements Payable {
    private int registrationNumber;
    private String name;
    private int salaryPerMonth;
    private Invoice[] invoices;

    // Constructor untuk inisialisasi data employee dan invoice-nya
    public Employee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }

    // Implementasi method dari interface Payable
    // Menghitung gaji bersih = gaji per bulan - total semua belanja
    @Override
    public double getPayableAmount() {
        double totalBelanja = 0;
        // Loop untuk menjumlahkan total belanja dari semua invoice
        for (Invoice invoice : invoices) {
            totalBelanja += invoice.getPayableAmount();
        }
        return salaryPerMonth - totalBelanja;
    }

    // Method untuk menampilkan data employee beserta invoice-nya
    public void displayEmployee() {
        System.out.println("===== Data Karyawan =====");
        System.out.println("No. Registrasi: " + registrationNumber);
        System.out.println("Nama: " + name);
        System.out.println("Gaji Bulanan: Rp" + salaryPerMonth);
        System.out.println("-- Belanjaan Koperasi --");
        for (Invoice invoice : invoices) {
            invoice.displayInvoice();
        }
        System.out.println("Gaji Setelah Potongan: Rp" + getPayableAmount());
        System.out.println();
    }
}
