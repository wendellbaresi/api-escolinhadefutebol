package com.projetofinal.escolinha.controller;


import com.projetofinal.escolinha.model.Player;
import com.projetofinal.escolinha.service.PlayerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/jogador")
public class PlayerController {

    @Autowired
    private PlayerServiceImpl jogadorServiceImpl;

    // Metodo de listar os valores na API
    @GetMapping
    public ResponseEntity<List<Player>> getAllJogador(){
        return ResponseEntity.ok().body(jogadorServiceImpl.listarjogadores());

    }

    // Metodo criado para cadastrar valores na API
    @PostMapping
    public ResponseEntity<Object> inserirJogador(@RequestBody Player player){
        return ResponseEntity.status(HttpStatus.CREATED).body(jogadorServiceImpl.cadastrarJogador(player));
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Object> getJogador( @PathVariable(value = "id") Integer id){
        return ResponseEntity.status(HttpStatus.OK).body(jogadorServiceImpl.listarJogador(id));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Object> deletJogador(@PathVariable(value = "id") Integer id){
        jogadorServiceImpl.removerJogador(id);
        return ResponseEntity.status(HttpStatus.OK).body("Jogador Excluido do Banco de Dados");
    }


    @PutMapping(value = "/{id}")
    public ResponseEntity<Object> updateJogador(@PathVariable(value = "id") Integer id,@RequestBody Player player){
        Optional<Player> dadosJogador = jogadorServiceImpl.listarJogador(id);
        Player atualizarPlayer = dadosJogador.get();
        atualizarPlayer.setNome(player.getNome());
        atualizarPlayer.setIdade(player.getIdade());
        atualizarPlayer.setPerna(player.getPerna());
        atualizarPlayer.setPeso(player.getPeso());
        atualizarPlayer.setPosicao(player.getPosicao());

        return ResponseEntity.status(HttpStatus.OK).body(jogadorServiceImpl.cadastrarJogador(atualizarPlayer));
    }

}
