package com.projetofinal.escolinha.service;


import com.projetofinal.escolinha.model.Categoria;
import com.projetofinal.escolinha.model.Jogador;
import com.projetofinal.escolinha.respository.JogadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class JogadorServiceImpl implements JogadorService {

    @Autowired
    private JogadorRepository jogadorRepository;

    @Autowired
    private JogadorService service;

    @Transactional
    @Autowired
    public Jogador cadastrarJogador(Jogador jogador){
        Ma

        15, new Categoria(1);
        Categoria categoria2 = new Categoria(2);
        Categoria categoria3 = new Categoria(3);
        Categoria categoria4 = new Categoria(4);
    }

    // Bean que lista todos os jogadores
    public List<Jogador> listarjogadores(){
        List<Jogador> jogador = jogadorRepository.findAll();
        return jogador;
    }


    // Faz o tratamento para quando houver valores nulos
    public Optional<Jogador> listarJogador(Integer id){
        return jogadorRepository.findById(id);
    }

    // Bean para garantir integridade dos dados, na hora de remover
    @Transactional
    public void removerJogador(Integer id){
        jogadorRepository.deleteById(id);
    }

}
