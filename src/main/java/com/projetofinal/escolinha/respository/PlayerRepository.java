package com.projetofinal.escolinha.respository;

import com.projetofinal.escolinha.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Integer> {
}
