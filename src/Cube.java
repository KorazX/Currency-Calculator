public class Cube {

    private String currency;
    private double rate;

    public Cube(String currency, double rate) {
        this.currency = currency;
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "<" + currency + ", " + rate;
    }

}