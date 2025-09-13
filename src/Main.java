public class Main {
    public static void main(String[] args) {
        Car f1car = Car.builder()
            .setModel("F1")
            .setColor("Red")
            .setEngine("V12")
            .setSeats(1)
            .setYear(2025)
            .setMileage(120)
            .build();

        System.out.println(f1car);
    }
}
