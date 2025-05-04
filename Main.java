// Class Main untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Data Invoice untuk 3 employee
        Invoice[] belanja1 = {
            new Invoice("Beras", 2, 60000),
            new Invoice("Gula", 3, 15000)
        };

        Invoice[] belanja2 = {
            new Invoice("Minyak", 1, 40000),
            new Invoice("Sabun", 5, 8000)
        };

        Invoice[] belanja3 = {
            new Invoice("Kopi", 4, 20000),
            new Invoice("Susu", 2, 25000)
        };

        // Buat 3 object Employee dengan masing-masing invoice
        Employee emp1 = new Employee(1001, "Angga", 3000000, belanja1);
        Employee emp2 = new Employee(1002, "Rina", 3500000, belanja2);
        Employee emp3 = new Employee(1003, "Budi", 3200000, belanja3);

        // Tampilkan data employee & belanjaannya
        emp1.displayEmployee();
        emp2.displayEmployee();
        emp3.displayEmployee();
    }
}
