import java.util.Scanner;

public class stock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of stock prices: ");
        int n = sc.nextInt();
        int[] price = new int[n];
        System.out.println("enter the stock prices:");
        for (int i = 0; i < n; i++) {
            price[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < price.length; i++) {
            if (price[i] < min) {
                min = price[i];
            } else if (price[i] - min > maxprofit) {
                maxprofit = price[i] - min;
            }
        }
        System.out.println("profit  is : " + maxprofit);
        sc.close();
    }
}
