package inheritance;

public class Test {
    public static void main(String[] args) {
        SoleTraderCompany company = new SoleTraderCompany("Kalina","2016-09-03","1234U04v1M","Maria Vasileva",5.0,10.0);
        double currentProfit = company.calculateProfit();
        System.out.printf("The actual profit is: %.2f\n",currentProfit);
        company.issueInvoice();
    }
}
