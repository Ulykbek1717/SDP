public class Car {
    private final int seats;
    private final String engine;
    private final boolean hasGPS;
    private final boolean hasTripComputer;



    public Car(int seats, String engine, boolean gps, boolean tripComp) {
        this.seats = seats;
        this.engine = engine;
        this.hasGPS = gps;
        this.hasTripComputer = tripComp;
    }


    public int getSeats() {
        return seats;
    }

    public String getEngine() {
        return engine;
    }

    public boolean hasGPS() {
        return hasGPS;
    }

    public boolean hasTripComputer() {
        return hasTripComputer;
    }

    @Override
    public String toString() {
        return "Car{" +
                "seats=" + seats +
                ", engine=" + engine +
                ", hasGPS=" + hasGPS +
                ", hasTripComputer=" + hasTripComputer +
                '}';
    }


    public static class Builder {

        private int seats;
        private String engine;
        private boolean hasGPS;
        private boolean hasTripComputer;

        public Builder setSeats(int seats) {
            this.seats = seats; return this;
        }


        public Builder setEngine(String engine) {
            this.engine = engine;
            return this;
        }


        public Builder setGPS(boolean gps) {
            this.hasGPS = gps;
            return this;
        }

        public Builder setTripComputer(boolean tripComp){
            this.hasTripComputer = tripComp;
            return this;
        }

        public Car build() {
            return new Car (seats, engine, hasGPS,hasTripComputer);
        }
    }
}

