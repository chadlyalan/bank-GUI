package homework210;


public class Stock {

    private String symbol, name;            //data usually is private
    private double prevClosingPrice;
    private double currPrice;

    public Stock(String s, String n) {
        symbol = s;
        name = n;
        prevClosingPrice = 0;
        currPrice = 0;
    }

    public void setPrevClosingPrice(double prevClosingPrice) {
        this.prevClosingPrice = prevClosingPrice;
    }

    public void setCurrPrice(double currPrice) {
        this.currPrice = currPrice;
    }

    public double getChangePercent() {
        return (currPrice - prevClosingPrice) / prevClosingPrice;
    }
}
