package assik_2;

interface Vehicle {
    void type();
    void brand();
}

interface Engine {
    void power();
    void fuel();
}

interface VehicleFactory {
    Vehicle createVehicle();
    Engine createEngine();
}

class BMWFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new BMWCar();
    }

    @Override
    public Engine createEngine() {
        return new BMWEngine();
    }
}

class TeslaFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new TeslaCar();
    }
    @Override
    public Engine createEngine() {
        return new TeslaEngine();
    }
}

class BMWCar implements Vehicle {
    @Override
    public void type() {
        System.out.println("Sedan");
    }

    @Override
    public void brand() {
        System.out.println("BMW");
    }
}

class BMWEngine implements Engine {
    @Override
    public void power() {
        System.out.println("350 HP");
    }

    @Override
    public void fuel() {
        System.out.println("Petrol");
    }
}

class TeslaCar implements Vehicle {
    @Override
    public void type() {
        System.out.println("Electric");
    }

    @Override
    public void brand() {
        System.out.println("Tesla");
    }
}

class TeslaEngine implements Engine {
    @Override
    public void power() {
        System.out.println("400 HP");
    }

    @Override
    public void fuel() {
        System.out.println("Electric");
    }
}

public class example_1 {
    private static VehicleFactory factory;

    public static void initialize(String type){
        if(type.equals("Tesla")){
            factory = new TeslaFactory();
        }
        else if(type.equals("BMW")){
            factory = new BMWFactory();
        }
    }

    public static void makeOrder(){
        Vehicle vehicle = factory.createVehicle();
        Engine engine = factory.createEngine();

        System.out.println("Making Order...");
        System.out.print("Type: ");
        vehicle.type();

        System.out.print("Brand: ");
        vehicle.brand();

        System.out.print("Power: ");
        engine.power();

        System.out.print("Fuel: ");
        engine.fuel();

        System.out.println();
        System.out.println();
    }

    public static void main(String[] args) {
        String company = "Tesla";

        initialize(company);
        makeOrder();

        company = "BMW";
        initialize(company);
        makeOrder();
    }
}

