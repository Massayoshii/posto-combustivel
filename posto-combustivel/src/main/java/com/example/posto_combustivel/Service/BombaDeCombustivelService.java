package com.example.posto_combustivel.Service;

import com.example.posto_combustivel.Entity.BombasDeCombustivel;
import com.example.posto_combustivel.Repository.BombasDeCombustivelRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BombaDeCombustivelService {

    private final BombasDeCombustivelRepository bombasDeCombustivelRepository;

    public void criar(BombasDeCombustivel bombasDeCombustivel){
        bombasDeCombustivelRepository.save(bombasDeCombustivel);
    }

    public BombasDeCombustivel buscarBombaCombustivelPorId(Long id){
        return bombasDeCombustivelRepository.findById(id).orElseThrow(() -> new NullPointerException("Bomba de combustivel nao encontrada pelo id " + id));
    }

    public List<BombasDeCombustivel> buscarBombaCombustivel(){
        return bombasDeCombustivelRepository.findAll();
    }

    @Transactional
    public void deletarBombaDeCombustivel(Long id ){
        bombasDeCombustivelRepository.deleteById(id);
    }

    public void alterarBombaCombustivel(Long id , BombasDeCombustivel bombasDeCombustivel){
        BombasDeCombustivel bomba = buscarBombaCombustivelPorId(id);
        bombasDeCombustivel.setId(bomba.getId());
        bombasDeCombustivelRepository.save(bombasDeCombustivel);
    }
}
