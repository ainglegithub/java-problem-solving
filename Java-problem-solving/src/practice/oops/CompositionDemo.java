package practice.oops;


import java.util.ArrayList;
import java.util.List;

class Processor {
    private String model;

    public Processor(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}

class Computer {
    private Processor processor; // Composition: Computer owns Processor strictly

    public Computer(String processorModel) {
        // Child object is instantiated directly inside parent constructor
        this.processor = new Processor(processorModel);
    }

    public void showSpecs() {
        System.out.println("Computer running on Processor: " + processor.getModel());
    }
}

public class CompositionDemo {
    public static void main(String[] args) {
        Computer myPC = new Computer("Intel Core i9-14900K");
        myPC.showSpecs();

        // Setting myPC to null destroys both the Computer and its internal Processor instance
        myPC = null;
    }
}