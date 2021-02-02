package com.digite.kata.refactoring;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NewReleaseMovieRentalTest {

    @Test
    public void testCalculatePrice()
    {
        Movie movie = new Movie("ABCD");
        int daysRented = 3;
        Rental rental =  new NewReleaseMovieRental(movie, 1,1);

        assertEquals(9, rental.calculatePrice(daysRented), 0);

    }

    @Test
    public void testGetFrequentRenterPoints()
    {
        int daysRented = 0;
        int priceCode = 1;
        Rental rental =  new NewReleaseMovieRental(new Movie("ABCD"), daysRented, priceCode);
        assertEquals(0, rental.getfrequentRenterPoints(daysRented), 0);

    }
}


