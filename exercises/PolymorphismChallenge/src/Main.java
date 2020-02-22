
class Car {

    private int cylinders;
    private int wheels;
    private int doors;
    private int seats;
    public int speed;
    public int topSpeed;
    private boolean engine;
    private boolean engineOn;
    private boolean additionalFeatures;
    private String color;
    private String name;

    public Car(int cylinders, int doors, int seats, int topSpeed, boolean additionalFeatures, String color, String name) {
        this.cylinders = cylinders;
        this.wheels = 4;
        this.doors = doors;
        this.seats = seats;
        this.speed = 0;
        this.topSpeed = topSpeed;
        this.engine = true;
        this.engineOn = false;
        this.additionalFeatures = additionalFeatures;
        this.color = color;
        this.name = name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }

    public int getSeats() {
        return seats;
    }

    public int getSpeed() {
        return speed;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public boolean isEngine() {
        return engine;
    }

    public boolean isEngineOn() {
        return engineOn;
    }

    public boolean hasAdditionalFeatures() {
        return additionalFeatures;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        this.engineOn = true;
        return "Engine Starting";
    }

    public String stopEngine() {
        this.engineOn = false;
        return "Engine Shutting Off";
    }

    public void accelerate(int seconds) {
        int accelRate = 4;
        if(isEngineOn()) {
            this.speed = this.speed + (seconds * accelRate);
            if(this.speed > this.topSpeed) {
                System.out.println("Max speed attained");
                this.speed = this.topSpeed;
            }
            System.out.println("Accelerating " + accelRate + " mph/second");
            System.out.println("New Speed: " + getSpeed());
        }
        else {
            System.out.println("Turn Engine on to Accelerate");
        }
    }

    public void brake(int seconds) {
        int brakeRate = 3;
        if(isEngineOn()) {
            this.speed = this.speed - (seconds * brakeRate);
            if(this.speed < 0) {
                System.out.println("Car has been brought to a stop");
                this.speed = 0;
            }
            System.out.println("Braking " + brakeRate + " mph/second");
            System.out.println("New Speed: " + getSpeed());
        }
        else {
            System.out.println("Turn Engine on to Brake");
        }
    }

    public String activateFeatures() {
        if(hasAdditionalFeatures()) {
            return "Activating Features";
        }
        else {
            return "No Additional Features";
        }
    }
}

class Ferrari extends Car {

    private String color;
    private String name;
    private boolean nos;

    public Ferrari(String color, String name, boolean nos) {
        super(8, 2, 2, 250, true, color, name);
        this.color = color;
        this.name = name;
        this.nos = nos;
    }

    @Override
    public void accelerate(int seconds) {
        int accelRate = 16;
        System.out.println("This thing flies >8D");
        if(isEngineOn()) {
            this.speed = this.speed + (seconds * accelRate);
            if(this.speed > this.topSpeed) {
                if(!this.nos) {
                    System.out.println("Max speed attained");
                    this.speed = this.topSpeed;
                }
                else {
                    System.out.println("Hitting the NOS");
                }
            }
            System.out.println("Accelerating " + accelRate + " mph/second");
            System.out.println("New Speed: " + getSpeed());
        }
        else {
            System.out.println("Please Start Engine");
        }
    }

    @Override
    public void brake(int seconds) {
        int brakeRate = 5;
        if(isEngineOn()) {
            this.speed = this.speed - (seconds * brakeRate);
            if(this.speed < 0) {
                System.out.println("Ferrari's stop on a dime");
                this.speed = 0;
            }
            System.out.println("Braking " + brakeRate + " mph/second");
            System.out.println("New Speed: " + getSpeed());
        }
        else {
            System.out.println("Turn Engine on to Brake");
        }
    }

    @Override
    public String activateFeatures() {
        return "\nActivating Special Features... \nConvertible Roof Opening \nHeat Warmers On \n";
    }
}

class GenericCar extends Car {

    public GenericCar() {
        super(4, 4, 5, 100, false, "silver", "generic");
    }
}

class HunkofJunk extends  Car {

    public HunkofJunk() {
        super(2, 2, 3, 45, false, "ugly", "lemon");
    }

    @Override
    public void accelerate(int seconds) {
        int accelRate = 4;
        if(seconds > 5) {
            System.out.println("Hunk-o-Junk is starting to clunk. \nLay off the gas!");
            seconds = 5;
        }
        if(isEngineOn()) {
            this.speed = this.speed + (seconds * accelRate);
            if(this.speed > this.topSpeed) {
                System.out.println("Max speed attained");
                this.speed = this.topSpeed;
            }
            System.out.println("Accelerating " + accelRate + " mph/second");
            System.out.println("New Speed: " + getSpeed());
        }
        else {
            System.out.println("Turn Engine on to Accelerate");
        }
    }

    @Override
    public void brake(int seconds) {
        int brakeRate = 1;
        boolean skipStop = false;
        if(seconds >= 10) {
            System.out.println("Hunk-o-Junk can't handle the braking \nCar Shutting Down...but still moving");
            System.out.println(stopEngine());
            skipStop = true;

        }
        if(isEngineOn()) {
            this.speed = this.speed - (seconds * brakeRate);
            if(this.speed < 0) {
                System.out.println("Give Yourself Plenty of Room to Stop");
                this.speed = 0;
            }
            System.out.println("Braking " + brakeRate + " mph/second");
            System.out.println("New Speed: " + getSpeed());
        }
        else {
            if(skipStop) {
                System.out.println("Turn Engine on to Brake");
            }
        }
    }
}


public class Main {

    public static void main(String[] args) {

        Car car = new Car(6, 4, 5, 120, true, "red", "honda");

        car.accelerate(5);
        car.activateFeatures();
        car.startEngine();
        car.accelerate(10);
        car.brake(2);
        System.out.println("Current Speed: " + car.getSpeed());

        System.out.println("\n");

        Ferrari ferrari = new Ferrari("red", "Spider", true);
        System.out.println("Model Name: " + ferrari.getName() + ", Color: " + ferrari.getColor());
        ferrari.accelerate(10);
        System.out.println(ferrari.activateFeatures());
        ferrari.startEngine();
        ferrari.accelerate(10);
        ferrari.brake(20);
        System.out.println("Current Speed: " + ferrari.getSpeed());

        System.out.println("\n");

        GenericCar genericCar = new GenericCar();
        genericCar.accelerate(5);
        genericCar.activateFeatures();
        genericCar.startEngine();
        genericCar.accelerate(25);
        genericCar.brake(2);
        System.out.println("Current Speed: " + genericCar.getSpeed());

        System.out.println("\n");

        HunkofJunk hunkofJunk = new HunkofJunk();
        System.out.println("Name: " + hunkofJunk.getName() + ", color: " + hunkofJunk.getColor());
        hunkofJunk.startEngine();
        hunkofJunk.accelerate(10);
        hunkofJunk.brake(15);
        System.out.println("Current Speed: " + hunkofJunk.getSpeed());
        hunkofJunk.brake(5);

    }

}
