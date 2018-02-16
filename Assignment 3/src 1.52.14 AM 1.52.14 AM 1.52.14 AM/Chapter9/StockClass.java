package Chapter9;

public class StockClass {
	String symbol;
	String name;
	
	double previousClosingPrice;
	double currentPrice;
	
	public StockClass( String symbol, String name) {
	}
	
	public double getChangePercent() {
		double change= ((currentPrice - previousClosingPrice)/ previousClosingPrice)*100;
		return change;
	}
	
	
}
