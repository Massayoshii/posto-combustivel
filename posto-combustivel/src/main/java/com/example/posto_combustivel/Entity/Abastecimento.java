package com.example.posto_combustivel.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "abastecimento")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Abastecimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "bomba_combustivel_id")
    private BombasDeCombustivel bombasDeCombustivel;
    @Column(name = "data_abastecimento")
    private LocalDate dataAbastecimento;
    @Column(name = "valor_total")
    private double valorTotal;
    @Column(name = "quantidade_litros")
    private double quantidadeLitros;
}
