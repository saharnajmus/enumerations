package be.intecbrussel;

public class CoinApp {
    public static void main(String[] args) {
        int sum = 0;
        Coin[] coins = {Coin.ONE_CENT, Coin.TWO_CENT, Coin.FIVE_CENT, Coin.TEN_CENT, Coin.TWENTY_CENT, Coin.FIFTY_CENT, Coin.ONE_EURO, Coin.TWO_EURO};
        for (Coin c : coins) {
            sum += c.getValue();
        }
        System.out.println("Sum of all coins " + sum);
    }
}
