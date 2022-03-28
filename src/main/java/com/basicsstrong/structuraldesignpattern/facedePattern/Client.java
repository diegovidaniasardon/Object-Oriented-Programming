package com.basicsstrong.structuraldesignpattern.facedePattern;

class TravelFacade{
    FlightBooking flightBooking;
    TrainBooking trainBooking;
    HotelBooking hotelBooking;

    enum BookingType{Flight,Train,Hotel,Flight_And_Hotel,Train_And_Hotel};

    public TravelFacade() {

        this.flightBooking = new FlightBooking();
        this.trainBooking = new TrainBooking();
        this.hotelBooking = new HotelBooking();
    }

    public void book(BookingType type, String name){
        switch (type){
            case Flight:
                flightBooking.bookFlight(name);
                return;
            case Hotel:
                hotelBooking.bookHotel(name);
                return;
            case Train:
                trainBooking.bookTrain(name);
                return;
            case Flight_And_Hotel:
                flightBooking.bookFlight(name);
                hotelBooking.bookHotel(name);
                return;
            case Train_And_Hotel:
                trainBooking.bookTrain(name);
                hotelBooking.bookHotel(name);
                return;
        }
    }
}

class FlightBooking{
    public void bookFlight(String name){
        System.out.println("Flight booked for " + name);
    }
}

class HotelBooking{
    public void bookHotel(String name){
        System.out.println("Hotel booked for " + name);
    }
}

class TrainBooking{
    public void bookTrain(String name){
        System.out.println("Train booked for " + name);
    }
}
public class Client {

    public static void main( String[] args )
    {
        TravelFacade booking = new TravelFacade();
        booking.book(TravelFacade.BookingType.Hotel, "Ram");


    }
}
