package cinema;
import java.util.Scanner;

import static cinema.CinemaRoom.rows;
import static cinema.Income.totalIncome;

public class Cinema {



    public static void main(String[] args) {

        CinemaRoom cinemaRoom= new CinemaRoom(0,0);

       CinemaRoom.cinemaInitialization(cinemaRoom);
        CinemaRoom.operationsMenu(cinemaRoom);








    }
}