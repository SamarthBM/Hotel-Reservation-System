package com.bridgelabs;

import org.junit.Test;

public class HotelReservationTest {
    HotelReservation hotelReservation = new HotelReservation();

    /**
     * Purpose: To print welcome message.
     *
     * @return Welcome message.
     */
    @Test
    public void shouldPrintWelcomeMessage() {
        hotelReservation.printWelcomeMessage();
    }
}
