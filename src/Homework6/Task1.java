package Homework6;

import classes.CreditCard;
public static void Main() {
    exercise1();
}
    public static void exercise1(String[] args) {
        String accountNumber;
        double currentSum;

    public CreditCard(String accountNumber, double currentSum) {
            this.accountNumber = accountNumber;
            this.currentSum = currentSum;
        }

        public void addSum(double sum){
            this.currentSum = this.currentSum + sum;
        }

        public void withdrawSum(double sum){
            this.currentSum = this.currentSum - sum;
        }

        public void printInformation(){
            System.out.println("Card number is: " + this.accountNumber);
            System.out.println("Sum is: " +  this.currentSum);
        }
    }

        CreditCard mastercard = new CreditCard("1234 1234 1234 1234",100);
        CreditCard visaCard = new CreditCard("2345 2345 2345 2345",500);
        CreditCard belCard = new CreditCard("3456 4567 4563 1234",750);

        mastercard.addSum(100);
        visaCard.addSum(200);
        belCard.withdrawSum(250);

        mastercard.printInformation();
        visaCard.printInformation();
        belCard.printInformation();
    }

