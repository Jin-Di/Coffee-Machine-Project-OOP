class Cat {

    // write static and instance variables
    public static int counter = 0;
    String name;
    int age;

    public Cat(String name, int age) {
        counter++;

        this.name = name;
        this.age = age;

        if(counter > 5) {
            System.out.println("You have too many cats");
        }
    }

    public static int getNumberOfCats() {
        // implement the static method
        return counter;
    }
}