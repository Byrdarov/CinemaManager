package cinema;


import java.util.Arrays;
import java.util.Scanner;

import static cinema.Income.seatPrice;

public class CinemaRoom {

    public static int rows;
    public static int number_of_seats;

    public static int row_number;

    public static int seat_number;

    public CinemaRoom(int rows,int number_of_seats) {
        this.rows=rows;
        this.number_of_seats=number_of_seats;
    }

    public CinemaRoom(int rows,int number_of_seats,int row_number,int seat_number) {
        this.rows=rows;
        this.number_of_seats=number_of_seats;
        this.row_number=row_number;
        this.seat_number=seat_number;
    }

    public static String[][] cinema = new String[rows][number_of_seats];

    public static Scanner scanner = new Scanner(System.in);

    public static int getRows() {
        return rows;
    }

    public static void setRows(int rows) {
        CinemaRoom.rows = rows;
    }

    public static int getNumber_of_seats() {
        return number_of_seats;
    }

    public static void setNumber_of_seats(int number_of_seats) {
        CinemaRoom.number_of_seats = number_of_seats;
    }

    public static String[][] getCinema() {
        return cinema;
    }

    public static void setCinema(String[][] cinema) {
        CinemaRoom.cinema = cinema;
    }

    public static int getRow_number() {
        return row_number;
    }

    public static void setRow_number(int row_number) {
        CinemaRoom.row_number = row_number;
    }

    public static int getSeat_number() {
        return seat_number;
    }

    public static void setSeat_number(int seat_number) {
        CinemaRoom.seat_number = seat_number;
    }

    public static void cinemaInitialization(CinemaRoom cinemaa) {

        System.out.println("Enter the number of rows:");
        rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        number_of_seats = scanner.nextInt();
        String[][] cinema_creation = new String[rows][number_of_seats];
        cinema = cinema_creation;

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < number_of_seats; j++) {
                cinema[i][j] = "S";
            }


        }

        cinemaa.setRows(rows);
        cinemaa.setNumber_of_seats(number_of_seats);


    }

    public static void printCinema() {

        System.out.println("Cinema:");
        System.out.print("  ");
        for (int i = 1; i <= number_of_seats; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < rows; i++) {
            System.out.print(i + 1 + " ");

            for (int j = 0; j < number_of_seats; j++) {
                System.out.print(cinema[i][j] + " ");


            }
            System.out.println(" ");

        }
        System.out.println(" ");
    }

    public static void chooseSeat(CinemaRoom cinemaaa) {
        String[][] cinema_creation = cinema;
        System.out.println("Enter a row number:");
        row_number = scanner.nextInt();
        System.out.println("Enter a seat number in that row:");
        seat_number = scanner.nextInt();
        cinemaaa.setRow_number(row_number);
        cinemaaa.setSeat_number(seat_number);
        cinema_creation[row_number-1][seat_number-1]="B";
        Income.seatPrice
                (cinema_creation.length,cinema_creation[0].length,row_number,seat_number);
        printCinema();


    }

    public static void operationsMenu(CinemaRoom cinema){
        System.out.println("1. Show the seats");
        System.out.println("2. Buy a ticket");
        System.out.println("0. Exit");

        int choice=scanner.nextInt();
            switch (choice) {
                case 1:
                    printCinema();
                    operationsMenu(cinema);
                    break;
                case 2:
                    chooseSeat(cinema);
                    operationsMenu(cinema);
                    break;
                case 0:
                    break;
            }


        }

    }




