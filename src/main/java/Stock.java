import java.util.Scanner;

public class Stock {
    Scanner sc = new Scanner(System.in);
    public static int stock(int n){
        int numOfStock = n;
        int numOfShare, sharePrice, valuePerShare;
        int valuation = 0;
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i < numOfStock;i++) {
            System.out.println("Enter details of stock-"+(i+1));
            System.out.println("How many number of shares you hold of stock-"+(i+1));
            numOfShare = sc.nextInt();
            System.out.println("Enter the price of stock-"+(i+1));
            sharePrice = sc.nextInt();
            valuePerShare = numOfShare*sharePrice;
            valuation = valuePerShare + valuation;
        }
        sc.close();
        return valuation;
    }
    public static void printReport(int n,int stockValuation) {
        System.out.println("Person holds total "+n+"stocks with valuation of "+stockValuation);
    }
    public static void main(String[] args) {
        System.out.println("Enter stocks you hold");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int stockValuation = stock(n);
    }
}
