package com.basicsstrong.designprinciples;


//Delegation Principle  > Handing over the responsibility for a particular task to another class or method. Reduces the coupling of methods

public interface TravelBooking {

    public void bookTicket();
}

class TicketBookingByAgent implements TravelBooking{
     TravelBooking travelBooking;

    public TicketBookingByAgent(TravelBooking travelBooking) {
        this.travelBooking = travelBooking;
    }

    @Override
    public void bookTicket() {
        travelBooking.bookTicket();
    }
}
class TrainTicket implements TravelBooking {

    @Override
    public void bookTicket() {
        System.out.println("Train ticket Booked!");
    }
}

class FlightTicket implements TravelBooking {

    @Override
    public void bookTicket() {
        System.out.println("Flight ticket Booked!");
    }
}


