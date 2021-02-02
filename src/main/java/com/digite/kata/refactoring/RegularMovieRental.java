package com.digite.kata.refactoring;

public class RegularMovieRental extends Rental{

    public RegularMovieRental(Movie movie, int daysRented, int priceCode) {
        super(movie, daysRented, priceCode);
    }
@Override
    public double calculatePrice(int daysRented)
    {
        double thisAmount = 2;
        if (daysRented > 2)
            thisAmount += (daysRented - 2) * 1.5;
        return thisAmount;
    }
}
