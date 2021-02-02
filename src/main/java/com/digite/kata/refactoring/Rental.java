package com.digite.kata.refactoring;

public class Rental implements RentalInterface{

    private Movie _movie;
    private int _daysRented;
    private int _priceCode;

    public Rental(Movie movie, int daysRented, int priceCode) {
        _movie = movie;
        _daysRented = daysRented;
        _priceCode = priceCode;
    }

    public Movie getMovie() {
        return _movie;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public int getPriceCode() {
        return _priceCode;
    }

    @Override
    public double calculatePrice(int daysRented) {
        return 0;
    }
    public int getfrequentRenterPoints(int daysRented)
    {
        return 0;
    }
}
