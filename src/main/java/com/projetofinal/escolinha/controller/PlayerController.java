package com.projetofinal.escolinha.controller;


import com.projetofinal.escolinha.model.Jogador;
import com.projetofinal.escolinha.service.JogadorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/jogador")
public class JogadorController {

    @Autowired
    private JogadorServiceImpl jogadorServiceImpl;

    // Metodo de listar os valores na API
    @GetMapping
    public ResponseEntity<List<Jogador>> getAllJogador(){
        return ResponseEntity.ok().body(jogadorServiceImpl.listarjogadores());

    }

    // Metodo criado para cadastrar valores na API
    @PostMapping
    public ResponseEntity<Object> inserirJogador(@RequestBody Jogador jogador){
        return ResponseEntity.status(HttpStatus.CREATED).body(jogadorServiceImpl.cadastrarJogador(jogador));
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
    public ResponseEntity<Object> updateJogador(@PathVariable(value = "id") Integer id,@RequestBody Jogador jogador){
        Optional<Jogador> dadosJogador = jogadorServiceImpl.listarJogador(id);
        Jogador atualizarJogador = dadosJogador.get();
        atualizarJogador.setNome(jogador.getNome());
        atualizarJogador.setIdade(jogador.getIdade());
        atualizarJogador.setPerna(jogador.getPerna());
        atualizarJogador.setPeso(jogador.getPeso());
        atualizarJogador.setPosicao(jogador.getPosicao());

        return ResponseEntity.status(HttpStatus.OK).body(jogadorServiceImpl.cadastrarJogador(atualizarJogador));
    }

}
