package main.lesson15;

import java.util.ArrayList;
import java.util.List;

public class GameRental {

    private List<BoardGame> games = new ArrayList<>();


    public void addGame(BoardGame game) {
        if (game == null) {
            throw new IllegalArgumentException();
        }

        if (findGame(game.getName()) != null) {
            throw new IllegalArgumentException();
        }

        games.add(game);
    }

    public BoardGame findGame(String name) {
        for (BoardGame game : games) {
            if (game.getName().equals(name)) {
                return game;
            }
        }
        return null;
    }

    public boolean rentGame(String name, int customerAge) {
        BoardGame game = findGame(name);

        if (game == null) {
            throw new IllegalArgumentException();
        }

        if (!game.canBeRentedBy(customerAge)) {
            return false;
        }

        if (game.isRented()) {
            return false;
        }

        game.setRented(true);

        return true;
    }

    public boolean returnGame(String name) {
        BoardGame game = findGame(name);

        if (game == null) {
            return false;
        }

        if (!game.isRented()) {
            return false;
        }

        game.setRented(false);

        return true;
    }


    public int calculateCost(String name, int days) {
        BoardGame game = findGame(name);

        if (game == null) {
            throw new IllegalArgumentException();
        }

        if (days <= 0) {
            throw new IllegalArgumentException();
        }

        return game.getRentalPrice() * days;
    }


    public void reset() {
        for (BoardGame game : games) {
            game.setRented(false);
        }
    }


}
