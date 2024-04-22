package inheritance;

public class SoleTraderCompany extends Company implements Invoicing{
    private String nameCompanyFounder;
    private double initialCapital;
    private double workingCapital;

    public String  getNameCompanyFounder(){
        return nameCompanyFounder;
    }

    public void setNameCompanyFounder(String nameCompanyFounder) {
        if(!nameCompanyFounder.isEmpty()) {
            this.nameCompanyFounder = nameCompanyFounder;
        }
        else{
            System.out.println("error = wrong company founder's name");
        }
    }
    public double getInitialCapital() {
        return initialCapital;
    }
    public void setInitialCapital(double initialCapital) {
        if(initialCapital >= 0) {
            this.initialCapital = initialCapital;
        }
        else{
            System.out.println("error = incorrect initial capital.Working capital cannot be negative");
        }
    }
    public double getWorkingCapital() {

        return workingCapital;
    }
    public void setWorkingCapital(double workingCapital) {
        if(workingCapital >= 0) {
            this.workingCapital = workingCapital;
        }
        else {
            System.out.println("error = incorrect working capital.Working capital cannot be negative");
        }
    }
    public SoleTraderCompany(String name, String dateFounded, String bulstatNumber, String nameCompanyFounder, double initialCapital, double workingCapital){
        super(name, dateFounded, bulstatNumber);
        setInitialCapital(initialCapital);
        setWorkingCapital(workingCapital);
        setNameCompanyFounder(nameCompanyFounder);

    }
    public double calculateProfit(){
       return workingCapital - initialCapital;
    }

    @Override
    public void issueInvoice(){
        System.out.printf("Invoice  issued from a company \"%s\"\n", getName());


    }
}
