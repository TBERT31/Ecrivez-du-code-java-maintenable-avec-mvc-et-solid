package com.openclassrooms.cardgame.games;

import java.util.List;

import com.openclassrooms.cardgame.model.Player;
import com.openclassrooms.cardgame.model.PlayingCard;

public interface GameEvaluator {
    public Player evaluateWinner(List<Player> players);

}