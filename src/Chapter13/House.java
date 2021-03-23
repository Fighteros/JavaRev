package Chapter13;

abstract class House {
    private double meters, mprice;
    private String owner;

    House(double meters, double mprice, String owner) {
        this.meters = meters;
        this.mprice = mprice;
        this.owner = owner;
    }
    double getMeters() {return meters;}
    double getMprice() {return mprice;}

    String getOnwer() {
        return owner;
    }

    void showInfo() {
        System.out.println("meters abd mprice are" + meters + " and " + mprice);
    }

    abstract double price();
}

class Villa extends House {
    private String color;

    Villa(double meters, double mprice,String owner ,String color) {
        super(meters, mprice ,owner);
        this.color = color;
    }

    Villa(double meters, double mprice) {
        super(meters, mprice, "Ahemd");
        this.color = "white";
    }
    double price(){
        return getMeters()* getMprice() *2;
    }
}

class Flat extends House{
    Flat(double meters, double mprice){
        super(meters, mprice, "Mohamed");
    }
    Flat(double meters, double mprice, String owner){
        super(meters, mprice, owner);
    }
    double price(){
        return getMeters() * getMprice() / 2;
    }
}


class Houses {
    public static void main(String[] args) {
        House H[] = new House[4];
        H[0] = new Villa(200, 100);
        H[1] = new Villa(300, 200, "Aly", "green");
        H[2] = new Flat(100, 70);
        H[3] = new Flat(120, 80, "Tarek");

        for(int i = 0; i< H.length;i++){
            System.out.println("House's owenr is "+H[i].getOnwer());
            System.out.println("price is "+H[i].getMprice());
        }
     }
}