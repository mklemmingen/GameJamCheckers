package com.gamejam.game.backend;

import com.gamejam.game.link.*;

public class BackMan implements FrontendZugriff {
    /*
     * This class implements the interface linking front to backend.
     */

    /*
     * This method is used to start the game: Clear the existing Board and set up a new one.
     */
    @Override
    public void startGame() {
    }

    /*
     * This method is used to get the board from the backend, it's used in the frontend to display the current board
     */
    @Override
    public Board getBoard() {
        return null;
    }

    /*
     * This method is used to get the current game state from the backend, it's used in the frontend to make sure
     * it's in the same state as the backend
     */
    @Override
    public GameState getGameState() {
        return null;
    }

    /*
     * This method is used to see if a move a Player has made is allowed. It's used in the frontend to make sure
     * that the backend controls whether a move would be allowed or not
     * returns: false if the move is not allowed, true if it is
     */
    @Override
    public boolean isValidMove(Coordinate start, Coordinate end) {
        return false;
    }

    /*
     * This method is used to move a piece on the board. Used by the frontend to move a piece of a coordinate
     * to another coordinate.
     * returns: false if no hit has taken place, true if a hit has taken place
     */
    @Override
    public boolean movePiece(Coordinate start, Coordinate end) {
        return false;
    }
}
