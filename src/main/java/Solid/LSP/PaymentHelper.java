package Solid.LSP;

import java.util.ArrayList;
import java.util.List;

public class PaymentHelper {

    List<NewPayment> newPayments = new ArrayList<>();
    List<PreviousPayment> previousPayments = new ArrayList<>();
    public void addNewPayment(NewPayment user){
        newPayments.add(user);
    }
    public void addPreviousPayment(PreviousPayment user){
        previousPayments.add(user);
    }
    public void showPreviousPayments() {
        for (PreviousPayment previousPayment: previousPayments) {
            previousPayment.previousPaymentInfo();
            System.out.println("--------");
        }
    }
    public void processNewPayments()  {
        for (NewPayment payment: newPayments) {
            payment.newPayment();
            System.out.println("-------");
        }
    }

}
