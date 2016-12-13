public class Product {
        private String id;
        private String description;
        private double price;
    Product (String i, String d, double pr){
        id = i;
        description = d;
        price = pr;
    }
    public String getId() {return id;}
    public String getDescription() {return description;}
    public double getPrice() {return price;}
    public void setID(String i){id = i;}
    public void setDescription(String d){description = d;}
    public void setPrice(double pr){price = pr;}
    public String toString(){
        return "ID: " + id + " Description: "+ description + " Price: " + price;
    }
}