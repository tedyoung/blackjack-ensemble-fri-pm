package com.jitterted.ebp.blackjack;

import com.jitterted.ebp.blackjack.application.GameService;
import com.jitterted.ebp.blackjack.domain.Deck;
import com.jitterted.ebp.blackjack.domain.Game;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BlackjackGameApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlackjackGameApplication.class, args);
    }

    @Bean
    public Game createGame() {
//        return new Game(new Deck(), new HttpGameMonitor());
        return new Game(new Deck());
    }

    @Bean
    public GameService createGameService(Game game) {
        return new GameService(game, new Deck());
    }

}
