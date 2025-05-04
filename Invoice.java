// Class Invoice ini mengimplementasikan interface Payable
// Interface Payable mewajibkan class ini untuk mengimplementasikan method getPayableAmount()
public class Invoice implements Payable {

    // Deklarasi atribut milik Invoice
    private String productName; // nama produk
    private int quantity;       // jumlah item
    private int pricePerItem;   // harga per item

    // Constructor: untuk mengisi nilai atribut ketika object Invoice dibuat
    public Invoice(String productName, int quantity, int pricePerItem) {
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    // Implementasi method abstract dari interface Payable
    // Method ini wajib ada karena interface Payable punya method getPayableAmount()
    @Override
    public double getPayableAmount() {
        return quantity * pricePerItem; // Menghitung total harga belanjaan
    }

    // Method tambahan (tidak ada di interface) untuk menampilkan detail belanjaan
    public void displayInvoice() {
        System.out.println("Produk: " + productName + 
                           ", Jumlah: " + quantity + 
                           ", Harga/item: Rp" + pricePerItem + 
                           ", Total: Rp" + getPayableAmount());
    }
}
