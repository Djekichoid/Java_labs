package Lab_4;

import java.util.*;

public class Lab_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quant;
        String param1, param2;
        while (true) {
            try {
                System.out.println("Enter quantity of cars:");
                quant = sc.nextInt();
                break;
            } catch (InputMismatchException exc) {
                System.out.println("Wrong type. Try again");
                sc.next();
            }
        }
        Car[] list_of_cars = new Car[quant];
        System.out.println("       Name;   Age;    Price;  Mileage;  Quantity of seats;");
        for (int i = 0; i < quant; i++) {
            list_of_cars[i] = new Car();
            System.out.printf("%11s;  %4d;  %7d;  %7d;  %1d;\n", list_of_cars[i].getname(),
                    list_of_cars[i].getage(), list_of_cars[i].getprice(), list_of_cars[i].getmileage(),
                    list_of_cars[i].getseats_quantity());
        }
        System.out.println("List of parameters: name, age, price, mileage, seats quantity");
        param1 = sc.nextLine();
        while (true) {
            System.out.println("Enter parameter 1, which you want to sort:");
            param1 = sc.nextLine();
            if (param1.equals("name")) {
                sortname(quant, list_of_cars,0);
                break;
            }
            if (param1.equals("age")) {
                sortage(quant, list_of_cars,0);
                break;
            }
            if (param1.equals("price")) {
                sortprice(quant, list_of_cars,0);
                break;
            }
            if (param1.equals("mileage")) {
                sortmileage(quant, list_of_cars,0);
                break;
            }
            if (param1.equals("seats quantity")) {
                sortseats_quantity(quant, list_of_cars,0);
                break;
            } else {
                System.out.println("Try again");
            }
        }
        while (true) {
            System.out.println("Enter parameter 2, which you want to sort in reverse order:");
            param2 = sc.nextLine();
            if (param2.equals("name")) {
                sortname(quant, list_of_cars,1);
                break;
            }
            if (param2.equals("age")) {
                sortage(quant, list_of_cars,1);
                break;
            }
            if (param2.equals("price")) {
                sortprice(quant, list_of_cars,1);
                break;
            }
            if (param2.equals("mileage")) {
                sortmileage(quant, list_of_cars,1);
                break;
            }
            if (param2.equals("seats quantity")) {
                sortseats_quantity(quant, list_of_cars,1);
                break;
            } else {
                System.out.println("Try again");
            }
        }
    }

    public static void sortname(int quant, Car[] list, int stat) {
        if (stat == 0) {
            Arrays.sort(list, Comparator.comparing(Car::getname));
        }
        else{
            Arrays.sort(list, Comparator.comparing(Car::getname).reversed());
        }
        for (int i = 0; i < quant; i++) {
            System.out.printf("%11s;  %4d;  %7d;  %6d;  %1d;\n", list[i].getname(),
                    list[i].getage(), list[i].getprice(), list[i].getmileage(), list[i].getseats_quantity());
        }
    }

    public static void sortage(int quant, Car[] list, int stat) {
        if (stat == 0) {
            Arrays.sort(list, Comparator.comparing(Car::getage));
        }
        else{
            Arrays.sort(list, Collections.reverseOrder(Comparator.comparing(Car::getage)));
        }
        for (int i = 0; i < quant; i++) {
            System.out.printf("%11s;  %4d;  %7d;  %6d;  %1d;\n", list[i].getname(),
                    list[i].getage(), list[i].getprice(), list[i].getmileage(), list[i].getseats_quantity());
        }
    }

    public static void sortprice(int quant, Car[] list, int stat) {
        if (stat == 0) {
            Arrays.sort(list, Comparator.comparing(Car::getprice));
        }
        else{
            Arrays.sort(list, Collections.reverseOrder(Comparator.comparing(Car::getprice)));
        }
        for (int i = 0; i < quant; i++) {
            System.out.printf("%11s;  %4d;  %7d;  %6d;  %1d;\n", list[i].getname(),
                    list[i].getage(), list[i].getprice(), list[i].getmileage(), list[i].getseats_quantity());
        }
    }

    public static void sortmileage(int quant, Car[] list, int stat) {
        if (stat == 0) {
            Arrays.sort(list, Comparator.comparing(Car::getmileage));
        }
        else{
            Arrays.sort(list, Collections.reverseOrder(Comparator.comparing(Car::getmileage)));
        }
        for (int i = 0; i < quant; i++) {
            System.out.printf("%11s;  %4d;  %7d;  %6d;  %1d;\n", list[i].getname(),
                    list[i].getage(), list[i].getprice(), list[i].getmileage(), list[i].getseats_quantity());
        }
    }

    public static void sortseats_quantity(int quant, Car[] list, int stat) {
        if (stat == 0) {
            Arrays.sort(list, Comparator.comparing(Car::getseats_quantity));
        }
        else{
            Arrays.sort(list, Collections.reverseOrder(Comparator.comparing(Car::getseats_quantity)));
        }
        for (int i = 0; i < quant; i++) {
            System.out.printf("%11s;  %4d;  %7d;  %6d;  %1d;\n", list[i].getname(),
                    list[i].getage(), list[i].getprice(), list[i].getmileage(), list[i].getseats_quantity());
        }
    }

}