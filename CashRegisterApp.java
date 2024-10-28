public class CashRegisterApp {
    public static void main(String[] args) {
        var cashRegister = new CashRegister();
        cashRegister.recordPurchase(2.50);
        cashRegister.recordPurchase(2.50);
        cashRegister.recordPurchase(2.50);
        cashRegister.recordPurchase(2.50);
        cashRegister.recordPurchase(2.50);
        cashRegister.recordPurchase(2.50);
        cashRegister.recordPurchase(1.00);
        System.out.printf("Total Purchase Is: $%.2f\n", cashRegister.getTotal());
        cashRegister.receivePayment(100,0, 0, 0,0);
        System.out.printf("Your change: $%.2f", cashRegister.giveChange());

    }
}
