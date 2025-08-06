public class Toy {
    private String name;
    private String brand; 
    private double price;
    private int quantity;

    public void setPrice(double price) {
        this.price = price;
    }
     // Getter and setter method for the properties (optional for better encapsulation)
     public String getName() {
        return name;
     }
     public void
}


/***
 * 
package chapter1;

public class Toy {
    private String name;
    private String brand;
    private double price;
    private int quantity;

    

    public void setPrice(double price) {
        this.price = price;
    }

    // Getter and setter methods for the properties (optional for better encapsulation)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static void main(String[] args) {
        Toy toy1 = new Toy();
        Toy toy2 = new Toy();
        toy1.setName("Barbie");
        toy1.setBrand("Martel");
        toy1.setPrice(1200);
        toy1.setQuantity(12);

        toy2.setName("Gel blaster");
        toy2.setBrand("Armscore");
        toy2.setPrice(999);
        toy2.setQuantity(8);

        toy1.setPrice(1500);  // Update the price using the setPrice method
        System.out.println("Toy 1 price: " + toy1.getPrice());
        System.out.println("Toy 2 price: " + toy2.getPrice());
    }
}

 */