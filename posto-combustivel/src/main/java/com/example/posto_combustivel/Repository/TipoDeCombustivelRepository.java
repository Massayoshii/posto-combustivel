package com.example.posto_combustivel.Repository;

import com.example.posto_combustivel.Entity.TiposDeCombustivel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoDeCombustivelRepository extends JpaRepository <TiposDeCombustivel , Long> {
}
