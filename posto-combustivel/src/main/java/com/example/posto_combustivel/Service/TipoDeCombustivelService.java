package com.example.posto_combustivel.Service;

import com.example.posto_combustivel.Entity.TiposDeCombustivel;
import com.example.posto_combustivel.Repository.TipoDeCombustivelRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TipoDeCombustivelService {
    private final TipoDeCombustivelRepository tipoDeCombustivelRepository;

    public void criar(TiposDeCombustivel tiposDeCombustivel){
        tipoDeCombustivelRepository.save(tiposDeCombustivel);
    }

    public TiposDeCombustivel buscarTipoDeCombustivelPorId(Long id){
        return tipoDeCombustivelRepository.findById(id).orElseThrow(() -> new NullPointerException("Tipo de combustivel nao encontrado pelo id "+ id));
    }

    public List<TiposDeCombustivel> buscarTipoDeCombustivel(){
        return tipoDeCombustivelRepository.findAll();
    }

    @Transactional
    public void deletarTipoDeCombustivel(Long id){
        tipoDeCombustivelRepository.deleteById(id);
    }

    public void alterarTipoDeCombustivel(Long id){
        TiposDeCombustivel combustivel = buscarTipoDeCombustivelPorId(id);
        combustivel.setId(combustivel.getId());
        tipoDeCombustivelRepository.save(combustivel);
    }
}
