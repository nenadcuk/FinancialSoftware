public class Main {
    public static void main(String[] args){

        // Case study: Financial Software

        /**
         * let's consider the problem of gathering info about a persons
         * financial investments
         * We have Stocks, Dividend Stocks, Mutual Funds, Real estate, Cash...
         */

        // 1st step - Classes: Stocks, DividendStocks, MutualFunds, Cash
        // 2nd step- Relations: DividendStocks is-a Stock

        // Stocks calc: Shares * value of the stock (current price today)
        // DividendStocks calc: shares * value + Amount of dividends paid
        // Cash only store amount

        // 3rd step - Because different assets compute their market values differently:
        //            We use Interface with methods: getMarketValue and getProfit

        // 4th step - Similarities between mutual funds and stocks?
        //            Both store assets based on shares

        Asset asset = new MutualFunds("AMZ", 300);

        System.out.println(asset.getMarketValue());
    }
}
