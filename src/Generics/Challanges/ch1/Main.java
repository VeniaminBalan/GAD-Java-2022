package Generics.Challanges.ch1;

public class Main {
    public static void main(String[] args) {
        RON lei = new RON(100_00);
        USD usd = new USD(500);

        exchangeDesk exchangeDesk = new exchangeDesk(lei, usd);
        exchangeDesk.AddRate(usd , lei , 2);

    }
}
