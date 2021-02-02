package com.digite.kata.refactoring;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RegularMovieRentalTest
{

    @Test
    public void testCalculatePrice()
    {
        Movie movie = new Movie("XYZ");
        int daysRented = 3;
        Rental rental =  new RegularMovieRental(movie, daysRented,0 );
        assertEquals(3.5, rental.calculatePrice(daysRented), 0);

    }

}
