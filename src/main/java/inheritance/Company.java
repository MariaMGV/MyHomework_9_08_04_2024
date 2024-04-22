package inheritance;

public class Company {
    private String name;
    private String dateFounded;

    private String bulstatNumber;

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if(!name.isEmpty()) {
            this.name = name;
        }
        else{
            System.out.println("error = wrong company's name");
        }
    }
    public String getDateFounded(){

        return dateFounded;
    }
    private void setDateFounded(String dateFounded) {
        if(!dateFounded.isEmpty()) {
            this.dateFounded = dateFounded;
        }
        else{
            System.out.println("error = wrong date founded");
        }
    }

    public String getBulstatNumber(){

        return bulstatNumber;
    }
    public void setBulstatNumber(String bulstatNumber){
       if(!bulstatNumber.isEmpty()) {

           if (bulstatNumber.length() == 10 && bulstatNumber.matches("[a-zA-Z0-9]+")) {
               this.bulstatNumber = bulstatNumber;
           }
       }
        else{
            System.out.println("error = wrong bulstat number");
        }
    }
    public Company(String name, String dateFounded, String bulstatNumber){
        setName(name);
        setDateFounded(dateFounded);
        setBulstatNumber(bulstatNumber);
    }
}
