package Java2;

public class Engine implements IEngine {
    @Override 
    public void start(){
        System.out.println("Engine starting...");
    }
}

class Car{
    void drive(){
        IEngine engine = new Engine();
        engine.start();
        System.out.println("Car is moving..");
    }

    public static void main(String[] args) {
        Car car = new Car();

        car.drive();
    }
}



// loosely coupled



// oop - Polymorphism, Abstraction, Inheritance, Encapsulation