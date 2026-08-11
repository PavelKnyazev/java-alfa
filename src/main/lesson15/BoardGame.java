package main.lesson15;


public class BoardGame {

    private String name;
    private int minAge;
    private int rentalPrice;
    private boolean rented;

    public BoardGame(String name, int minAge, int rentalPrice) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException();
        }

        if (minAge < 0) {
            throw new IllegalArgumentException();
        }

        if (rentalPrice <= 0) {
            throw new IllegalArgumentException();
        }

        this.name = name;
        this.minAge = minAge;
        this.rentalPrice = rentalPrice;
    }

    public String getName() {
        return name;
    }

    public int getMinAge() {
        return minAge;
    }

    public int getRentalPrice() {
        return rentalPrice;
    }

    public boolean isRented() {
        return rented;
    }

    public boolean canBeRentedBy(int age) {
        if (age < minAge) {
            return false;
        }
        return true;
    }

    public void setRented(boolean rented) {
        this.rented = rented;
    }

}
