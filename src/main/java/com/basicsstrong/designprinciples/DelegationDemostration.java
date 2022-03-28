package com.basicsstrong.designprinciples;


public class DelegationDemostration {

    public static void main( String[] args ){
       TicketBookingByAgent agent = new TicketBookingByAgent(new TrainTicket());

       agent.bookTicket();
    }
}
