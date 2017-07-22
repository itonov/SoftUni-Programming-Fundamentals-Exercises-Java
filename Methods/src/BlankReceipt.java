
public class BlankReceipt {
    public static void main(String[] args) {
        PrintReceipt();
    }

    public static void PrintReceipt(){
        PrintReceiptHeader();
        PrintReceiptBody();
        PrintReceiptFooter();
    }

    public static void PrintReceiptHeader(){
        System.out.println("CASH RECEIPT");
        System.out.println("------------------------------");
    }

    public static void PrintReceiptBody(){
        System.out.println("Charged to____________________");
        System.out.println("Received by___________________");
    }

    public static void PrintReceiptFooter(){
        System.out.println("------------------------------");
        System.out.println("\u00A9 SoftUni");
    }
}
