package serverProject;
public class employee {
    double numOfSales,BounsRate;
    String name;
    public employee (double nos,double br  , String n) {
        this.numOfSales=nos;
        this.BounsRate=br;
        this.name=n;
    }
    //Getter and setters for getting and setting properties
    public double getnumOfSales() {
        return numOfSales;
    }
    public void setnumOfSales(double numOfSales) {
        this.numOfSales = numOfSales;
    }
    public double getBounsRate() {
        return BounsRate;
    }
    public void setBounsRate(double BounsRate) {
        this.BounsRate = BounsRate;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    } 
    public void addSale() {
         this.numOfSales= numOfSales++;
    }
    }