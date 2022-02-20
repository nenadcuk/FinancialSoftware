# FinancialSoftware

This is a project which solves the problem of gathering info about a persons financial investments.
We have Stocks, Dividend Stocks, Mutual Funds and Cash.
All of these are Assets and each has a unique system of calculating value.
All classes (except Cash) inherit abstract class ShareAsset, where it is stored Constructor for creating Asset, and methods for gathering info about assets.
This class (ShareAsset) also implements interface Asset, which contains two methods: getMarketValue and getProfit of assets.
Class Cash doesn't inherit ShareAsset, because it does not have a calculation system.
