package com.digite.kata.refactoring;

public class ChildrenMovieRental extends Rental {


    public ChildrenMovieRental(Movie movie, int daysRented, int priceCode) {
        super(movie, daysRented, priceCode);
    }

    @Override
    public double calculatePrice(int daysRented)
    {
        double thisAmount = 1.5;
        if (daysRented > 3)
            thisAmount += (daysRented - 3) * 1.5;
        return thisAmount;
    }


}
