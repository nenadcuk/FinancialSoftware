public class Main {
    public static void main(String[] args){

        // Case study: Financial Software

        //let's consider the problem of gathering info about a persons financial investments
        // We have Stocks, Dividend Stocks, Mutual Funds, Real estate, Cash...

        // 1st step - Classes: Stocks, DividendStocks, MutualFunds, Cash
        // 2nd step- Relations: DividendStocks is-a Stock

        // Stocks calc: Shares * value of the stock (current price today)
        // DividendStocks calc: shares * value + Amount of dividends paid
        // Cash only store amount

        // 3rd step - Because different assets compute their market values differently:
        //            We use Interface with methods: getMarketValue and getProfit

        // 4th step - Similarities between mutual funds and stocks?
        //            Both store assets based on shares

        Asset asset = new Stocks("Axis Bank", 36.40);
        ((Stocks)asset).purchase(24, 28.5);
        System.out.println("Market Value of all Stock assets: " + asset.getMarketValue() + "$");
        System.out.println("Total shares of stocks: " + ((Stocks) asset).getTotalShares());
        System.out.println("Profit of stocks: " + asset.getProfit() + "$");


        Asset asset1 = new MutualFunds("AMZ", 300);
        ((MutualFunds)asset1).purchase(14, 320);
        System.out.println("\nMarket Value of all Mutual Funds assets: " + asset1.getMarketValue() + "$");
        System.out.println("Total shares of Mutual Funds: " + ((MutualFunds) asset1).getTotalShares());
        System.out.println("Profit of Mutual Funds: " + asset1.getProfit() + "$");

        Asset asset2 = new Cash(1540.00);
        System.out.println("\nAmount of cash: " + asset2.getMarketValue() + "$");


    }

}
