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
public class JogadorService {

    @Autowired
    private JogadorRepository jogadorRepository;

    // Bean que lista todos os jogadores
    public List<Jogador> listarjogadores(){
        List<Jogador> jogador = jogadorRepository.findAll();
        return jogador;
    }

    // bean que garante a integridade dos dados.Se alguma inserção for errada, ele volta ao estado padrçao.
    @Transactional
    public Jogador cadastrarjogador(Jogador jogador){
        Categoria categoria1 = new Categoria(1);
        Categoria categoria2 = new Categoria(2);
        Categoria categoria3 = new Categoria(3);
        Categoria categoria4 = new Categoria(4);
        if (jogador.getIdade() <= 15){
            jogador.setCategoria(categoria1);
        }else if (jogador.getIdade() <= 17){
            jogador.setCategoria(categoria2);
        } else if (jogador.getIdade() <= 20) {
            jogador.setCategoria(categoria3);
        } else{
            jogador.setCategoria(categoria4);
        }
        return jogadorRepository.save(jogador);
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
