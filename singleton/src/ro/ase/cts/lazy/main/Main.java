package ro.ase.cts.lazy.main;

import ro.ase.cts.lazy.lazy.Hotel;

public class Main {
    public static void main(String[] args) {
        Hotel hotel1 = Hotel.getInstance("Hotelul 1", 2, 2);
        Hotel hotel2 = Hotel.getInstance("Hotelul 2", 6, 4);

        hotel1.afisareInchiriereCamera();
        hotel1.afisareInchiriereCamera();

        hotel2.afisareInchiriereCamera();
        hotel2.afisareInchiriereCamera();


    }
}
