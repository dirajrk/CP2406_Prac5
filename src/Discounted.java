public class Discounted {
    private String id;
    private String description;
    private double price;
    private double discount;
    Discounted (String i, String d, double pr, double dsc){
        id = i;
        description = d;
        price = pr;
        discount = dsc;
    }
    String getId() {return id;}
    String getDescription() {return description;}
    double getPrice() {return price*(1-discount);}
    public void setID(String i){id=i;}
    public void setDescription(String d){description=d;}
    public void setPrice(double pr) {price=pr;}
    public void setDiscount(double disc) {discount = disc;}
    public String toString(){
        return "ID: " + id + " Description: "+ description + " Price: " + price + " Discount: " + discount;
    }
}