package Chapter9;

public class TestStockClass {
public static void main(String[]args) {
	
	StockClass stock1= new StockClass("ORCL", "Orcale Corporation");
	
	stock1.previousClosingPrice=34.5;
	stock1.currentPrice=34.35;
	
	System.out.println("The price-change percentage is " + stock1.getChangePercent() );
}
}
