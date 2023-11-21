package Lab_4;

import java.util.Random;

class Car {
    private final String name;
    private final int age;
    private final int price;
    private final int mileage;
    private final int seats_quantity;
    final String[] car_names = {"Nissan", "Porsche", "Toyota", "Audi", "Hyundai", "Subaru", "Ford",
            "Volkswagen", "Honda", "BMW", "Mercedes", "Mazda", "Kia", "Skoda", "Renault", "Suzuki",
            "Peugeot", "Chevrolet", "Cadillac", "Lexus", "Ferrari", "Lamborghini", "Mitsubishi",
            "Rolls-Royce", "Tesla"};

    public Car() {
        Random random = new Random();
        this.name = car_names[random.nextInt(0, 25)];
        this.age = random.nextInt(1995, 2023);
        this.price = random.nextInt(10000, 5000000);
        this.mileage = random.nextInt(0, 150000);
        this.seats_quantity = random.nextInt(4, 9);
    }

    public String getname() {
        return name;
    }

    public int getprice() {
        return price;
    }

    public int getmileage() {
        return mileage;
    }

    public int getage() {
        return age;
    }

    public int getseats_quantity() {
        return seats_quantity;
    }
}
