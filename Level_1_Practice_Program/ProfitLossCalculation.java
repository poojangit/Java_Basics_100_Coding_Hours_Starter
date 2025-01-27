//todo : Create a program to calculate the profit and loss in number and percentage based on the cost price of INR 129 and the selling price of INR 191. 
//! Hint => 
//! Use a single print statement to display multiline text and variables.
//! Profit = selling price - cost price
//! Profit Percentage = profit / cost price * 100
//! I/P => NONE
//! O/P => The distance  ___ km in miles is ___

public class ProfitLossCalculation {
    public static void main(String[] args) {
        int costPrice = 129;
        int sellingPrice = 191;
        int profit = sellingPrice-costPrice;
        double profitPercentage = profit/costPrice * 100;
        System.out.println("The Cost Price is INR " + costPrice + " and selling Price is INR " + sellingPrice +
                "\n The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage);
    }
}
