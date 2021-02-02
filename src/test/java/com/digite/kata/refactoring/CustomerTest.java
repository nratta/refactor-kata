package com.digite.kata.refactoring;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class CustomerTest {

    @Before
    public void setUp()
    {

    }

    @Test
    public void testStatement()
    {
        // Creating data starts
        Customer customer = new Customer("User1");
        Rental rental1 = new RegularMovieRental(new Movie("XYZ"), 2,0 );
        Rental rental2 = new NewReleaseMovieRental(new Movie("ABCD"), 3,1);
        Rental rental3 = new ChildrenMovieRental(new Movie("Cars"), 2, 2);

        customer.addRental(rental1);
        customer.addRental(rental2);
        customer.addRental(rental3);
        // Creating data ends

    String expOutput = "Rental Record for User1\n" +
            "\tXYZ\t2.0\n" +
            "\tABCD\t9.0\n" +
            "\tCars\t1.5\n" +
            "Amount owed is 12.5\n" +
            "You earned 4 frequent renter points";
        assertEquals(expOutput,customer.statement());

    }
}
