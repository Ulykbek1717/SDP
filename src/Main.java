public class Main {
    public static void main(String[] args) {
        Car Car = new Car.Builder()
                .setSeats(2)
                .setEngine("V12")
                .setGPS(true)
                .setTripComputer(true)
                .build();

        System.out.println(Car);
    }
}


