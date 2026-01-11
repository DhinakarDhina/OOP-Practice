package InterfacePractice;

import java.util.Scanner;

 interface PaymentGateway {
      void processPayment(double amount);
}

class CreditCardPayment implements PaymentGateway{
     public void processPayment(double amount){
         System.out.println("Processing credit card payment of amount :"+amount);
     }
}

class UPIPayment implements PaymentGateway{
     public void processPayment(double amount){
         System.out.println("Processing UPI payment of amount:"+amount);
     }
}
class main{
    public static void main(String[] args) {
        String[] method={"credit","upi"};
        double[] amount={284.5,27476.2};

        for(int i=0; i<method.length;i++){
            PaymentGateway payment =null;
            if(method[i]=="credit" || method[i]=="CREDIT"){
                payment= new CreditCardPayment();
            } else if (method[i]=="upi" || method[i]=="UPI") {
                payment= new UPIPayment();
            }
            else{
                System.out.println("Invalid payment option");
            }
            payment.processPayment(amount[i]);
        }

    }
}