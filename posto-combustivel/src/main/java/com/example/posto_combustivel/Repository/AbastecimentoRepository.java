package com.example.posto_combustivel.Repository;

import com.example.posto_combustivel.Entity.Abastecimento;
import com.example.posto_combustivel.Entity.BombasDeCombustivel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AbastecimentoRepository extends JpaRepository <Abastecimento, Long> {
}
