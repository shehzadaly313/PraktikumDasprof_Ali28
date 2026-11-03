package PraktikumDasprof_Ali28;
import java.util.Scanner;
public class caseStudy228 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        String activity;
        int rank;
        int funding;
        int documents;
        int missing;
        System.out.print("Enter Student Name: ");
        name = input.nextLine();
        System.out.print("Enter Activity Type: ");
        activity = input.nextLine();
        if (activity.equalsIgnoreCase("BELMAWA") ||
            activity.equalsIgnoreCase("BAKORMA") ||
            activity.equalsIgnoreCase("Mandiri")) {
            System.out.print("Enter Competition Rank (1-3, 0 if not winner): ");
            rank = input.nextInt();
            if (rank >= 1 && rank <= 3) {
                System.out.print("Enter Number of Documents (0-4): ");
                documents = input.nextInt();
                if (documents == 4) {
                    System.out.println("Eligible for award funds.");
                } else {
                    missing = 4 - documents;
                    System.out.println("Documents incomplete.");
                    System.out.println(missing + " document(s) missing.");
                    System.out.println("No award funds given.");
                }
            } else {
                System.out.println("Not eligible for award funds.");
                System.out.println("Only 1st, 2nd or 3rd place winners qualify.");
            }
        } else if (activity.equalsIgnoreCase("PKM")) {
            System.out.print("Enter PKM Funding Status (1=Approved, 0=Not Approved): ");
            funding = input.nextInt();
            if (funding == 1) {
                System.out.print("Enter Number of Documents (0-4): ");
                documents = input.nextInt();

                if (documents == 4) {
                    System.out.println("Eligible for award funds.");
                } else {
                    missing = 4 - documents;
                    System.out.println("Documents incomplete.");
                    System.out.println(missing + " document(s) missing.");
                    System.out.println("No award funds given.");
                }
            } else {
                System.out.println("Not eligible for award funds.");
                System.out.println("PKM proposal was not approved.");
            }
        } else {
            System.out.println("Not eligible for award funds.");
            System.out.println("Activity type is not covered by the requirements.");
        }
        input.close();
    }
}

