package tr.edu.maltepe.oop;
public  class Simple_main {
    // Main method to test
    public static void main(String[] args) {
        // Create two Cat objects
        Cat cat1 = new Cat("Duman", 3, "White");
        Cat cat2 = new Cat("Lokum", 7, "Black");

        // Display info and make both cats meow
        cat1.displayInfo();
        cat1.meow();

        cat2.displayInfo();
        cat2.meow();
    }
}

