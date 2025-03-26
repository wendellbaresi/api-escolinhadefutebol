package com.projetofinal.escolinha.service;

import com.projetofinal.escolinha.model.Jogador;

import java.util.List;
import java.util.Optional;

public interface JogadorService {
    List<Jogador> listarjogadores();
    Jogador cadastrarJogador(Jogador jogador);
    Optional<Jogador> listarJogador(Integer id);
    void removerJogador(Integer id);
}
