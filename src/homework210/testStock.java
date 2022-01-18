package homework210;


public class testStock {

    public static void main(String[] args) {
        Stock barzeeIndustries = new Stock("BZ", "barzee Industries");
        Stock oracle = new Stock("ORCL", "Oracle Corporation");

        oracle.setPrevClosingPrice(34.5);
        oracle.setCurrPrice(34.35);

        barzeeIndustries.setPrevClosingPrice(25);
        barzeeIndustries.setCurrPrice(26.75);

        System.out.println(oracle.getChangePercent());
        System.out.println(barzeeIndustries.getChangePercent());
    }

}
