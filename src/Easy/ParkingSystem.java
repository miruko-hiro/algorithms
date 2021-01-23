package Easy;

public class ParkingSystem {
    private int big;
    private int medium;
    private int small;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        switch (carType){
            case 1:
                if(this.big > 0) {
                    this.big--;
                    return true;
                }
                else return false;
            case 2:
                if(this.medium > 0) {
                    this.medium--;
                    return true;
                }
                else return false;
            case 3:
                if(this.small > 0) {
                    this.small--;
                    return true;
                }
                else return false;
            default:
                return false;
        }
    }

    public static void main(String[] args) {
        var ob = new ParkingSystem(1, 1, 0);
        System.out.println(ob.addCar(1));
        System.out.println(ob.addCar(2));
        System.out.println(ob.addCar(3));
        System.out.println(ob.addCar(1));
    }
}
