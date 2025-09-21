interface Vehicle {
    void type();
    void brand();
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

class TeslaCar implements Vehicle {
    @Override
    public void type() {
        System.out.println("Electric SUV");
    }
    @Override
    public void brand() {
        System.out.println("Tesla");
    }
}

abstract class VehicleFactory {
    public abstract Vehicle createVehicle();

    public void makeOrder() {
        Vehicle vehicle = createVehicle();
        System.out.println("Making Order...");
        System.out.print("Type: ");
        vehicle.type();
        System.out.print("Brand: ");
        vehicle.brand();
        System.out.println();
    }
}

class BMWFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new BMWCar();
    }
}

class TeslaFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new TeslaCar();
    }
}

public class Main {
    public static void main(String[] args) {
        VehicleFactory factory;

        factory = new TeslaFactory();
        factory.makeOrder();

        factory = new BMWFactory();
        factory.makeOrder();
    }
}
