
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment compared) {
        int aptPrice = this.squares * this.princePerSquare;
        int aptPrice2 = compared.squares * compared.princePerSquare;

        if (aptPrice > aptPrice2) {
            return aptPrice - aptPrice2;
        } else {
            return aptPrice2 - aptPrice;
        }

    }
    
    public boolean moreExpensiveThan(Apartment compared){
        int aptPrice = this.squares * this.princePerSquare;
        int aptPrice2 = compared.squares * compared.princePerSquare;
        if(aptPrice > aptPrice2) {
            return true;
        } 
        return false;
    }

}
