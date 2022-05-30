package problem_06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // car || truck
        // {typeOfVehicle} {model} {color} {horsepower}

        List<Vehicle> cars = new ArrayList<>();
        List<Vehicle> trucks = new ArrayList<>();

        String[] input = scan.nextLine().split(" ");

        // counter for cars && trucks
        int carCounter = 0;
        int truckCounter = 0;

        // average HP of cars and trucks
        double carsHp = 0;
        double trucksHp = 0;

        while (!input[0].equals("End")){
            Vehicle vehicle = new Vehicle(input[0], input[1], input[2], Integer.parseInt(input[3]));
            if (input[0].equals("car")){
                carCounter++;
                carsHp += Integer.parseInt(input[3]);
                cars.add(vehicle);
            } else if (input[0].equals("truck")){
                truckCounter++;
                trucksHp += Integer.parseInt(input[3]);
                trucks.add(vehicle);
            }


            input = scan.nextLine().split(" ");
        }

        String input2 = scan.nextLine();
        while (!input2.equals("Close the Catalogue")){
            for (Vehicle car : cars) {
                if (car.getModel().equals(input2)){
                    System.out.println("Type: Car");
                    System.out.println("Model: " + car.getModel());
                    System.out.println("Color: " + car.getColor());
                    System.out.println("Horsepower: " + car.getHp());
                }
            }
            for (Vehicle truck : trucks) {
                if (truck.getModel().equals(input2)){
                    System.out.println("Type: Truck");
                    System.out.println("Model: " + truck.getModel());
                    System.out.println("Color: " + truck.getColor());
                    System.out.println("Horsepower: " +truck.getHp());
                }
            }

            input2 = scan.nextLine();
        }

        if (carCounter == 0){
            System.out.printf("Cars have average horsepower of: 0.00.%n");
        } else {
            System.out.printf("Cars have average horsepower of: %.2f.%n", carsHp / carCounter);
        }

        if (truckCounter == 0){
            System.out.printf("Trucks have average horsepower of: 0.00.%n");
        } else {
            System.out.printf("Trucks have average horsepower of: %.2f.%n", trucksHp / truckCounter);
        }
    }
}
