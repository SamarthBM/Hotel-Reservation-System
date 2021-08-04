package com.bridgelabs;

public class HotelReservation {

    /**
     * Purpose: To print welcome message.
     *
     * @return Welcome message.
     */
    public void printWelcomeMessage() {
        System.out.println("Welcome to Hotel reservation problem");
    }

    /**
     * Purpose: Method to add hotels details with name and rates for regular customer.
     *
     * @param hotelName   : takes name of the hotel as first argument
     * @param weekDayRate : takes week day rate of hotel as second argument
     * @param weekendRate : takes weekend rate of hotel as third argument
     * @return the hotel name, week day and weekend rates of the hotel
     */
    public Hotel addHotel(String hotelName, int weekDayRate, int weekendRate) {
        return new Hotel(hotelName, weekDayRate, weekendRate);
    }
}
