public class Payment {
        String paymentMode;
        int paidAmount;
        int due;
        String paymentStatus;

        public void paymentDetails(){
            System.out.println("paid "+ paidAmount + " through "+paymentMode + " transaction is "+ paymentStatus);
        }

}
