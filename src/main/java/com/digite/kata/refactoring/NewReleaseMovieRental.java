package com.digite.kata.refactoring;

public class NewReleaseMovieRental extends Rental{

    public NewReleaseMovieRental(Movie movie, int daysRented, int priceCode) {
        super(movie, daysRented, priceCode);
    }
    @Override
    public double calculatePrice(int daysRented)
    {
        double thisAmount = daysRented *3 ;
        return thisAmount;
    }

    @Override
    public int getfrequentRenterPoints(int daysRented)
    {
        int points = 0 ;
        if (daysRented > 1)
            points++ ;
        return points;
    }
}
