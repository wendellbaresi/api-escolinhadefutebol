package com.projetofinal.escolinha.respository;

import com.projetofinal.escolinha.model.Jogador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JogadorRepository  extends JpaRepository<Jogador, Integer> {
}
