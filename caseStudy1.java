package PraktikumDasprof_Ali28;
import java.util.Scanner;
public class caseStudy1 {
    public static void main(String []args){
        Scanner input= new Scanner(System.in);  
        int price = 18000;
        int quantity;
        double total;
        double discount = 0;
        double payment;
        double change;
        System.out.print("Enter quantity of coffee: ");
        quantity = input.nextInt();
        total = price * quantity;
        if (total >= 100000) {
            discount = total * 0.10;
        } else {
            discount = 0;
        }
        total = total - discount;
        System.out.println("Discount: Rp" + discount);
        System.out.println("Total Payment: Rp" + total);
        System.out.print("Enter payment: Rp");
        payment = input.nextDouble();
        if (payment >= total) {
            change = payment - total;
            System.out.println("Change: Rp" + change);
        } else {
            System.out.println("Insufficient payment!");
        }
        input.close();
    }
}
