package cinema;

public class Income {

    public static int ticket_price;
    public static int front_row;
    public static int back_row;
    public static int income;
    public static int seat_price;


    public static void totalIncome(int number_of_rows, int number_of_seats) {


        if (number_of_seats * number_of_rows <= 60) {
            ticket_price = 10;
            income = ticket_price * number_of_rows * number_of_seats;

        } else {
            front_row = number_of_rows / 2;
            back_row = number_of_rows - front_row;
            ticket_price = 10;
            income = front_row * number_of_seats * ticket_price;
            ticket_price = 8;
            income = income + (back_row * number_of_seats * ticket_price);

        }

        System.out.println("Total income:");
        System.out.print("$");
        System.out.print(income);
    }

    public static void seatPrice
            (int number_of_rows, int number_of_seats, int row_number, int seat_number) {

        if (number_of_rows* number_of_seats <= 60) {
            System.out.println("Ticket price: $10");
            return;
        }
        front_row = Math.floorDiv(number_of_rows,2);
        System.out.println(row_number);
        System.out.println(front_row);
        if(row_number<=front_row){
            ticket_price=10;
            System.out.println("Ticket price: $10");
        }
        else{
            ticket_price=8;
            System.out.println("Ticket price: $8");
        }


    }


}
