public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new NormalVehicle();
        vehicle.drive();  //will call the normaldrivestrategy's drive method
    }
}