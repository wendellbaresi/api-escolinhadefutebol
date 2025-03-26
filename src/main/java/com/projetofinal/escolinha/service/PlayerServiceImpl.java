package com.projetofinal.escolinha.service;


import com.projetofinal.escolinha.model.Category;
import com.projetofinal.escolinha.model.Player;
import com.projetofinal.escolinha.respository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private PlayerService service;

    @Transactional
    @Autowired
    public Player cadastrarJogador(Player player){
        Ma

        15, new Category(1);
        Category category2 = new Category(2);
        Category category3 = new Category(3);
        Category category4 = new Category(4);
    }

    // Bean que lista todos os jogadores
    public List<Player> listarjogadores(){
        List<Player> player = playerRepository.findAll();
        return player;
    }


    // Faz o tratamento para quando houver valores nulos
    public Optional<Player> listarJogador(Integer id){
        return playerRepository.findById(id);
    }

    // Bean para garantir integridade dos dados, na hora de remover
    @Transactional
    public void removerJogador(Integer id){
        playerRepository.deleteById(id);
    }

}
