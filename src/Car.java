public class Car {
    private final String model;
    private final String engine;
    private final int seats;
    private final String color;
    private final int year;
    private final int mileage;


    private Car(Builder builder) {
        this.model = builder.model;
        this.engine = builder.engine;
        this.seats = builder.seats;
        this.color = builder.color;
        this.year = builder.year;
        this.mileage = builder.mileage;
    }


    public static class Builder{
        private String model;
        private String engine;
        private int seats;
        private String color;
        private int year;
        private int mileage;


        public Builder setModel(String model) {
            this.model = model;
            return this;
        }
        public Builder setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public Builder setSeats(int seats) {
            this.seats = seats;
            return this;
        }
        public Builder setColor(String color) {
            this.color = color;
            return this;
        }
        public Builder setYear(int year) {
            this.year = year;
            return this;
        }
        public Builder setMileage(int mileage) {
            this.mileage = mileage;
            return this;
        }
        public Car build() {
            return new Car(this);
        }

    }
    public static Builder builder() {
        return new Builder();
    }
    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", engine='" + engine + '\'' +
                ", seats=" + seats +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                '}';

    }
}
