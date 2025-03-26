package com.projetofinal.escolinha.service;

import com.projetofinal.escolinha.model.Player;

import java.util.List;
import java.util.Optional;

public interface PlayerService {
    List<Player> listarjogadores();
    Player cadastrarJogador(Player player);
    Optional<Player> listarJogador(Integer id);
    void removerJogador(Integer id);
}
