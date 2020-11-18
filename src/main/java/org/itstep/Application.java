package org.itstep;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        int allDaysCosts = 0;
        int len = 1;
        Animal[] zoo = new Animal[len];
        int c = 8;
        while (c != 7) {
            System.out.print("1 - Add new Animal\n2 - Show all\n");
            System.out.print("3 - Delete animal\n4 - Add expenses for the current day\n");
            System.out.print("5 - Calculation of food costs for all animals for the current day\n");
            System.out.print("6 - Calculation of food costs for all animals for all days\n");
            System.out.print("7 - Exit\n");
            System.out.print(">>");
            c = scan.nextInt();
            switch (c) {
                case 1:
                    len++;
                    int c2;
                    System.out.print("1 - Snake\n2 - Cat\n");
                    System.out.print("3 - Dog\n");
                    System.out.print(">>");
                    c2 = scan.nextInt();
                    switch (c2) {
                        case 1:
                            System.out.print("Name:");
                            String name = scan2.nextLine();
                            System.out.print("Age:");
                            int age = scan.nextInt();
                            System.out.print("Weight:");
                            int weight = scan.nextInt();
                            System.out.print("Number:");
                            int number = scan.nextInt();
                            System.out.print("Time:");
                            int time = scan.nextInt();
                            System.out.print("Length:");
                            int length = scan.nextInt();
                            System.out.print("Day costs:");
                            int dayCosts = scan.nextInt();
                            allDaysCosts+=dayCosts;
                            zoo[zoo.length-1] = new Snake(name, age, weight, number, time, length, dayCosts);
                            break;
                        case 2:
                            System.out.print("Name:");
                            String name2 = scan2.nextLine();
                            System.out.print("Age:");
                            int age2 = scan.nextInt();
                            System.out.print("Weight:");
                            int weight2 = scan.nextInt();
                            System.out.print("Number:");
                            int number2 = scan.nextInt();
                            System.out.print("Time:");
                            int time2 = scan.nextInt();
                            System.out.print("Day Costs:");
                            int dayCosts2 = scan.nextInt();
                            allDaysCosts+=dayCosts2;
                            System.out.print("Flock:");
                            String flock2 = scan2.nextLine();
                            System.out.print("Color:");
                            String color2 = scan2.nextLine();
                            zoo[zoo.length - 1] = new Cat(name2, age2, weight2, number2, time2, dayCosts2, flock2, color2);
                            break;
                        case 3:
                            System.out.print("Name:");
                            String name3 = scan2.nextLine();
                            System.out.print("Age:");
                            int age3 = scan.nextInt();
                            System.out.print("Weight:");
                            int weight3 = scan.nextInt();
                            System.out.print("Number:");
                            int number3 = scan.nextInt();
                            System.out.print("Time:");
                            int time3 = scan.nextInt();
                            System.out.print("Day Costs:");
                            int dayCosts3 = scan.nextInt();
                            allDaysCosts+=dayCosts3;
                            System.out.print("Flock:");
                            String flock3 = scan2.nextLine();
                            System.out.print("Color:");
                            String color3 = scan2.nextLine();
                            zoo[zoo.length - 1] = new Dog(name3, age3, weight3, number3, time3, dayCosts3, flock3, color3);
                            break;
                    }
                    break;
                case 2:
                    for (int i = 0; i < zoo.length; i++) {
                        if(zoo[i].getName().equals(null)){
                            System.err.print("There is no animals yet\n");
                            break;
                        }
                        System.out.print(zoo[i].getName() + "\n");
                    }
                    break;
                case 3:
                    System.out.print("Enter name of an animal:");
                    String deleteAnimal = scan2.nextLine();
                    for (int i = 0; i < zoo.length; i++) {
                        if (zoo[i].getName().equals(deleteAnimal)) {
                            zoo[i] = null;
                        }
                    }
                    break;
                case 4:
                    System.out.print("Enter name of an animal:");
                    String nameOfNeeded = scan2.nextLine();
                    for (int i = 0; i < zoo.length; i++) {
                        if (zoo[i].getName().equals(nameOfNeeded)) {
                            System.out.print("Enter day costs:");
                            int dayCosts = scan.nextInt();
                            allDaysCosts += dayCosts;
                            zoo[i].setDayCosts(dayCosts);
                        }
                    }
                    break;
                case 5:
                    int sum = 0;
                    for (int i = 0; i < zoo.length; i++) {
                        sum += zoo[i].getDayCosts();
                    }
                    System.out.println("Costs for all animals for current day:"+sum+"\n");
                    break;
                case 6:
                    System.out.print("All days costs:" + allDaysCosts + "\n");
                    break;
                case 7:
                    c = 7;
                    break;
            }

        }

    }

}
