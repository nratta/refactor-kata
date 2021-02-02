package com.digite.kata.refactoring;

import java.util.Vector;

class Customer {
    private String _name;
    private Vector<Rental> _rentals = new Vector();

    public Customer(String name) {
        _name = name;
    }

    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }

    public String getName() {
        return _name;
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        String result = "Rental Record for " + getName() + "\n";
        for(Rental each : _rentals)
        {
            double thisAmount = 0;
            thisAmount += each.calculatePrice(each.getDaysRented());
            frequentRenterPoints++;
            frequentRenterPoints += each.getfrequentRenterPoints(each.getDaysRented());
            result += "\t" + each.getMovie().getTitle() + "\t" +
                    String.valueOf(thisAmount) + "\n";
            totalAmount += thisAmount;
        }

        result += "Amount owed is " + String.valueOf(totalAmount) +
                "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints)
                +
                " frequent renter points";
        return result;
    }
}