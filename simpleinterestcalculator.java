import java.util.Scanner;

class Main {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("\nPlease enter the principal amount (like this, e.g., 50000): ");
        double principal = input.nextDouble();

        System.out.print("\nPlease enter the rate: ");
        double rate = input.nextDouble();

        System.out.print("\nPlease enter the time (in years): ");
        double time = input.nextDouble();

        double interest = (principal * rate * time) / 100;
        double total = interest + principal;

        System.out.println("Principal: " + principal);
        System.out.println("Rate: " + rate);
        System.out.println("Time: " + time);
        System.out.println("Your balance in " + time + " years will be: $" + total);

        input.close();

    
    }  

}
