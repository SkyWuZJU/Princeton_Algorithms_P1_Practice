// Car.java
public class Car {
    int price;
    String name;
    int gas_vault;

    public Car(int price, String name, int gas_vault) {
        this.price = price;
        this.name = name;
        this.gas_vault = gas_vault;
    }

    public Car(String name) {
        this.name = name;
    }

    void run() {
        System.out.println("Launch the car " + this.name);
        this.gas_vault -= 1;
    }

    // Additional methods and attributes...
}

// Dapp.java
public class Dapp {
    String name;
    String contract;
    static String network = "Ethereum";

    public Dapp(String name, String contract) {
        this.name = name;
        this.contract = contract;
    }

    public static void call() {
        System.out.println("Call the contract");
    }
    
    // Additional methods and attributes...
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(10, "BMW-X5", 9);
        car1.run();

        Car car2 = new Car("Audi A8");
        System.out.println(Car.network); // Corrected to access static variable via class name
        Dapp.call();

        // Additional operations...
    }
}

// Compilation and Execution Commands:
// javac Car.java Dapp.java Main.java
// java Main
